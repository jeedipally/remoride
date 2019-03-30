package com.hacktrix.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hacktrix.model.Customer;
import com.hacktrix.repository.CustomerRepository;


/**
 * @author Narendar
 *
 */

@Controller
public class CustomerController {

	@Autowired
	CustomerRepository custRepository;
    
    @ResponseBody
    @RequestMapping(value="/submit", method = RequestMethod.POST)
    public String saveCustomerData(Customer cust){
    	
    	custRepository.saveData(cust);
    	
        return "welcome";
    }

	
	
}
