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
		
		// get the exist loan 
		int existLoan = getLoanAmount(cust.getId());
		
		// salary 
		double sal = cust.getSalAmount();
		
		//new loan amount 
		String newloan = cust.getLoan();
		
		Integer newloanVal = Integer.valueOf(newloan);

		 int newval = newloanVal.intValue() ;
		  
		  
		 int totalLoan = existLoan+newval ;
		 
		 int bal = (int) (sal-totalLoan) ;
		 
		 
		 int factor = (int) ((bal/sal)*100) ;
		 
		 if(factor>75) {
			 
			 return "L";
			 
		 }else if(factor<=50) {
			 
			 return "H";
			 
		 }else {
			 
			 return "M";
			 
		 }
		
	}
	
	 public int getLoanAmount(int custId){
	        String query = "SELECT * FROM LOAN WHERE loanId=?";
	        Loan loan = template.queryForObject(query,new Object[]{custId},new BeanPropertyRowMapper<>(Loan.class));
	        Integer loanVal = Integer.valueOf(loan.getLoanAmount());
	        return loanVal.intValue();
	    }
	
	
	
}
