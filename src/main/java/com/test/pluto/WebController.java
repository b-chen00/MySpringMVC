package com.test.pluto;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;  
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.view.RedirectView;
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
	
	@RequestMapping(value = "/processAdd", method = RequestMethod.GET)
	public RedirectView processAdd(ModelMap model, @RequestParam(name = "newName") String name, @RequestParam(name = "newEmail") String email) {
		//Customer c = new Customer(name, email);
		service.addCustomer(name, email);
		return new RedirectView("/MySpringMVC/");
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public String displayUpdate(ModelMap model, @RequestParam(name = "updateId") String id) {
		model.addAttribute("id", id);
		return "update";
	}
	
	@RequestMapping(value = "/processUpdate", method = RequestMethod.GET)
	public RedirectView processUpdate(ModelMap model, @RequestParam(name = "newName") String name, @RequestParam(name = "newEmail") String email, @RequestParam(name = "id") String id) {
		service.updateCustomer(id, name, email);
		return new RedirectView("/MySpringMVC/");
	}
	
	@ModelAttribute("allCustomers")
	public List<Customer> populateCustomers(){
		List<Customer> customers = service.getAllCustomer();
		return customers;
	}
}
