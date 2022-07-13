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
	
	
	@Transactional
	public boolean addCustomer(Customer customer) {
		
   		 // do some business processing  here ...
    		//now call DAO layer
		return(customerdao.insert(customer));
		
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
}