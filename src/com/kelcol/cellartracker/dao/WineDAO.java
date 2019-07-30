package com.kelcol.cellartracker.dao;

import java.util.List;

import com.kelcol.cellartracker.entity.Wine;

public interface WineDAO {
	
	public List<Wine> getWines();
	
	public void saveWine(Wine theWine);
	
	public Wine getWine(int theId);
	
	public void deleteWine(int theId);
	
	public List<Wine> searchWines(String searchName);

}
