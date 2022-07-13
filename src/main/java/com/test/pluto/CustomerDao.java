package com.test.pluto;

import org.springframework.orm.hibernate4.HibernateTemplate;
//import org.hibernate.cfg.Configuration;
import java.util.List;

public class CustomerDao {
	private HibernateTemplate hibernateTemplate;
	/**
	Configuration configuration = new Configuration();
	configuration.configure();
	serviceRegistry = new ServiceRegistryBuilder().applySettings(
			configuration.getProperties()).buildServiceRegistry();
	sessionFactory = configuration.buildSessionFactory(serviceRegistry);
	**/
	
	/**
    Configuration configuration = new Configuration();
    configuration.configure("hibernate_sp.cfg.xml");
    StandardServiceRegistryBuilder ssrb = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
    SessionFactory sessionFactory = configuration.buildSessionFactory(ssrb.build());
    Session session = sessionFactory.openSession();
	**/
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
	
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	public boolean insert(Customer customer) {
		hibernateTemplate.save(customer);
		return true;
	}
	
	public void update(Customer customer) {
		hibernateTemplate.update(customer);
	}
	
	public Customer getCustomer(int roll) {
		return hibernateTemplate.get(Customer.class, roll);
	}
	
	public void delete(int roll) {
		hibernateTemplate.delete(getCustomer(roll));
	}
	
	@SuppressWarnings("unchecked")
	public List<Customer> getAllCustomer(){
		return (List<Customer>) hibernateTemplate.find("from Customer");
	}
}