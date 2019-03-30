/**
 * 
 */
package com.hacktrix.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.hacktrix.model.Customer;

/**
 * @author Narendar
 *
 */

@Repository
public class CustomerRepository {

	@Autowired
    JdbcTemplate template;
	
	
	public String saveData(Customer cust){
		
		return "" ;
    }
	
	
}
