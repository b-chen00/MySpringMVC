package com.test.pluto;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@RequestMapping("")
@Controller
public class WebController {
	
	@Autowired
	CustomerService service;
	
	//value = "/test", 
	@RequestMapping(method = RequestMethod.GET)
	public String displayHome(ModelMap model) {
		model.addAttribute("message", "Test 3");
		return "home";
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String displayAdd(ModelMap model) {
		return "add";
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public String displayUpdate(ModelMap model) {
		return "update";
	}
	
	@ModelAttribute("allCustomers")
	public List<Customer> populateCustomers(){
		List<Customer> customers = service.getAllCustomer();
		return customers;
	}
}
