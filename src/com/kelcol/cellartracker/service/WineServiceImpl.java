package com.kelcol.cellartracker.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kelcol.cellartracker.dao.WineDAO;
import com.kelcol.cellartracker.entity.Wine;

@Service
public class WineServiceImpl implements WineService {

	@Autowired
	private WineDAO wineDAO;
	
	@Override
	@Transactional
	public List<Wine> getWines() {
		return wineDAO.getWines();
	}

	@Override
	@Transactional
	public void saveWine(Wine theWine) {
		
		wineDAO.saveWine(theWine);

		
	}

	@Override
	@Transactional
	public Wine getWine(int theId) {
		
		return wineDAO.getWine(theId);
	}

	@Override
	@Transactional
	public void deleteWine(int theId) {
		
		wineDAO.deleteWine(theId);		
		
	}

	@Override
    @Transactional
    public List<Wine> searchWines(String searchName) {

        return wineDAO.searchWines(searchName);
    }
	

}
