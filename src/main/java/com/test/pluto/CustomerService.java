package com.test.pluto;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class CustomerService {

	@Autowired
	private CustomerDao customerdao;
	
	@Transactional
	public List<Customer> getAllCustomer() {
		
                // do some business processing here ...
    		//now call DAO layer
		return customerdao.getAllCustomer();

  }
	
	@Transactional(readOnly = false)
	public boolean addCustomer(String name, String email) {
		Customer c = new Customer(name, email);
   		 // do some business processing  here ...
    		//now call DAO layer
		return(customerdao.insert(c));
		
	}
	
	@Transactional
	public Customer getCustomer(int theId) {
		
		// do some business processing here ... 
    		//now call DAO layer
		return customerdao.getCustomer(theId);
	}
	
	
	@Transactional
	public void deleteCustomer(int theId) {
   		 // do some business processing here ...
   		 //now call DAO layer
		customerdao.delete(theId);
	}
	
	@Transactional
	public void updateCustomer(String id, String name, String email) {
   		 // do some business processing here ...
   		 //now call DAO layer
		customerdao.update(id, name, email);
	}
}