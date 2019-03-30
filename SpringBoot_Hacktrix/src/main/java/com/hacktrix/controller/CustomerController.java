package com.hacktrix.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
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
    
    @RequestMapping(value = "/saveCustomer", method = RequestMethod.POST)
    @ResponseBody
    public String saveCustomerData(@RequestBody Customer cust){
    	
    	System.out.println("in save saveCustomer");
    	
    	if(cust!=null ) {
    		//save the customer data .
        	custRepository.saveData(cust);
        	
        	//retrun customer risk profile 
        	 String msg =  custRepository.checkRiskProfile(cust);
        	
        	 return msg;
    	}else {
    		
    		return "Customer Can not be Null";
    	}
    	
       
    }
    
    
    @RequestMapping(value = "/user", method = RequestMethod.GET)
    @ResponseBody
    public List<String> listAllUsers() {
      
    	List al = new ArrayList();
    	
    	al.add("test");
    	al.add("test1");
    	al.add("test2");
        
        return  al ;
    }

	
	
}
