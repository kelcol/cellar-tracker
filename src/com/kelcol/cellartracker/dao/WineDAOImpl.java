package com.kelcol.cellartracker.dao;

import java.util.List;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kelcol.cellartracker.entity.Wine;

@Repository
public class WineDAOImpl implements WineDAO {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Wine> getWines() {		
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Wine> theQuery = currentSession.createQuery("from Wine order by wine_vintage", Wine.class);
		List<Wine> wines = theQuery.getResultList();		
		return wines;		
	}

	@Override
	public void saveWine(Wine theWine) {
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.saveOrUpdate(theWine);
	}

	@Override
	public Wine getWine(int theId) {
		Session currentSession = sessionFactory.getCurrentSession();
		Wine theWine = currentSession.get(Wine.class, theId);
		return theWine;
	}

	@Override
	public void deleteWine(int theId) {
		Session currentSession = sessionFactory.getCurrentSession();
		Query theQuery = currentSession.createQuery("delete from Wine where id=:wineId");
		theQuery.setParameter("wineId", theId);
		theQuery.executeUpdate();
	}

	@Override
	public List<Wine> searchWines(String searchName) {
		Session currentSession = sessionFactory.getCurrentSession();
		Query theQuery = null;
		if (searchName != null && searchName.trim().length() > 0) {
			theQuery = currentSession.createQuery("from Wine", Wine.class);
		} else {
			theQuery = currentSession.createQuery("from Wine",Wine.class);
		}
		List<Wine> wines = theQuery.getResultList();
		return wines;
	}

}
