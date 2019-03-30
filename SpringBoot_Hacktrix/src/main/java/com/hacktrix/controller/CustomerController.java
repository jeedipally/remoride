package com.hacktrix.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hacktrix.model.Customer;
import com.hacktrix.repository.CustomerRepository;


/**
 * @author Narendar
 *
 */

@RestController
public class CustomerController {

	@Autowired
	CustomerRepository custRepository;
    
    @RequestMapping(value="/submit", method = RequestMethod.POST)
    public String saveCustomerData(Customer cust){
    	
    	//save the customer data .
    	custRepository.saveData(cust);
    	
    	//retrun customer risk profile 
    	
    	return custRepository.checkRiskProfile(cust);
    	
    }

	
	
}
