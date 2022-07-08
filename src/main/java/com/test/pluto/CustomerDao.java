package com.test.pluto;

import org.springframework.orm.hibernate4.HibernateTemplate;
import java.util.List;

public class CustomerDao {
	private HibernateTemplate hibernateTemplate;
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
	
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	public void insert(Customer customer) {
		hibernateTemplate.save(customer);
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