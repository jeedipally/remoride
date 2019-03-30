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
    
	public int saveData(Customer cust){
		 String query = "INSERT INTO customer VALUES(?,?,?,?,?,?,?)";
	        return template.update(query,cust.getId(),
	        		cust.getLoanId() ,
	        		cust.getName() ,
	        		cust.getSalaryType(),
	        		cust.getLoan(),
	        		cust.getRentedhouse(),
	        		cust.getSalAmount() 
	        		) ;
	        		
    }
	
	
}
