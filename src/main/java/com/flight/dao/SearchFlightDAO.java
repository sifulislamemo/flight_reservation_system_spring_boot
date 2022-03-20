package com.flight.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.flight.model.Flight;
@Repository(value = "searchFlightDAO")
@Transactional
public class SearchFlightDAO {
	@Autowired
    private EntityManager entityManager;
    
    private Session getSession() {
        return entityManager.unwrap(Session.class);
    }
    public List<Flight> getByDeparture(String departure_airport) {
        String hqlQuery = "from flight where departure_airport = :departure_airport";
        Query query = getSession().createQuery(hqlQuery);
        query.setParameter("departure_airport", departure_airport);
        
      System.out.println("search" +departure_airport);
        List<Flight> flightList = query.list();
        getSession().flush();
      
        return flightList;
        }
}