package com.cg.billing.daoservices;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.cg.billing.beans.Customer;
public class CustomerDAOImpl implements CustomerDAO{

	private EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JPA-PU");
	
	@Override
	public Customer save(Customer customer) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(customer);
		entityManager.getTransaction().commit();
		entityManager.close();
		return customer;
	}

	@Override
	public Customer find(int customerID) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		return entityManager.find(Customer.class, customerID);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Customer> findAll() {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Query query = entityManager.createQuery("from Customer c",Customer.class);
		return query.getResultList();
	}

	@Override
	public boolean remove(int customerID) {
		// TODO Auto-generated method stub
		return false;
	}
}
