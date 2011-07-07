package dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import model.WasHere;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.document.mongodb.MongoTemplate;
import org.springframework.data.document.mongodb.query.Criteria;
import org.springframework.data.document.mongodb.query.Order;
import org.springframework.data.document.mongodb.query.Query;
import org.springframework.stereotype.Repository;

@Repository
public class WasHereDaoImpl implements WasHereDao {

	@Autowired(required = false)
	private MongoTemplate mongoTemplate;

	public List<WasHere> findAll() {
		Query query = new Query();
		query.sort().on("date", Order.DESCENDING);
		List<WasHere> result = mongoTemplate.find(query, WasHere.class);
		return result;
	}

	public void put(WasHere newWasHere) {
		mongoTemplate.insert(newWasHere);
	}

}
