package controller;

import java.util.Date;
import java.util.List;

import model.WasHere;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import validator.WasHereValidator;
import dao.WasHereDao;

@Controller
@RequestMapping("iwashere")
@SessionAttributes("new")
public class WasHereController {

	@Autowired
	private WasHereDao wasHereDao;

	@RequestMapping(method = RequestMethod.GET)
	public String setupForm(Model model) {
		WasHere newWasHere = new WasHere();
		newWasHere.setDate(new Date());
		model.addAttribute("new", newWasHere);
		return "wasHere";
	}

	@ModelAttribute("wasHeres")
	public List<WasHere> populatePetTypes() {
		return wasHereDao.findAll();
	}

	@RequestMapping(method = { RequestMethod.POST })
	public String processSubmit(@ModelAttribute("new") WasHere newWasHere,
			BindingResult result, SessionStatus status) {
		new WasHereValidator().validate(newWasHere, result);
		if (result.hasErrors()) {
			return "wasHere";
		} else {
			wasHereDao.put(newWasHere);
			status.setComplete();
			return "redirect:/mvc/iwashere";
		}
	}

}
