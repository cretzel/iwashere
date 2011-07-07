package dao;

import java.util.List;

import model.WasHere;

public interface WasHereDao {

	List<WasHere> findAll();

	void put(WasHere newWasHere);

}
