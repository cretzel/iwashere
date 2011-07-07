package validator;

import java.util.Date;

import model.WasHere;

import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;

public class WasHereValidator {

	public void validate(WasHere wasHere, Errors errors) {
		String name = wasHere.getName();
		if (!StringUtils.hasLength(name)) {
			errors.rejectValue("name", "required", "required");
		}

		Date date = wasHere.getDate();
		if (date == null) {
			errors.rejectValue("date", "required", "required");
		}
	}
}
