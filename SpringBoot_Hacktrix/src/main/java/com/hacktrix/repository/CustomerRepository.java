/**
 * 
 */
package com.hacktrix.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.hacktrix.model.Customer;
import com.hacktrix.model.Loan;

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
	
	
	public String checkRiskProfile(Customer cust ) {
		
		double existLoan = getLoanAmount(cust.getId());
		
		double sal = cust.getSalAmount();
		
		String newloan = cust.getLoan();
		
		
		return null;
		
	}
	
	 public double getLoanAmount(int custId){
	        String query = "SELECT * FROM LOAN WHERE ID=?";
	        Loan loan = template.queryForObject(query,new Object[]{custId},new BeanPropertyRowMapper<>(Loan.class));
	        Double loanVal = Double.valueOf(loan.getLoanAmount());
	        return loanVal.doubleValue();
	    }
	
	
	
}
