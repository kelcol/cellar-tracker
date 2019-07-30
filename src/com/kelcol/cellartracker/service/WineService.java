package com.kelcol.cellartracker.service;

import java.util.List;

import com.kelcol.cellartracker.entity.Wine;

public interface WineService {

	public List<Wine> getWines();

	public void saveWine(Wine theWine);

	public Wine getWine(int theId);
	
	public void deleteWine(int theId);
	
	public List<Wine> searchWines(String searchName);


}
