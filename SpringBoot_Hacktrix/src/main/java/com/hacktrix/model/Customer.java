/**
 * 
 */
package com.hacktrix.model;

/**
 * @author Narendar
 *
 */
public class Customer {
	
	    private int loanId;
	    private String name;
	    private String salaryType;
	    private String loanType;
	    private String rentedhouse;
	    private double salAmount;
	    
		public int getLoanId() {
			return loanId;
		}
		public void setLoanId(int loanId) {
			this.loanId = loanId;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getSalaryType() {
			return salaryType;
		}
		public void setSalaryType(String salaryType) {
			this.salaryType = salaryType;
		}
		public String getLoanType() {
			return loanType;
		}
		public void setLoanType(String loanType) {
			this.loanType = loanType;
		}
		public String getRentedhouse() {
			return rentedhouse;
		}
		public void setRentedhouse(String rentedhouse) {
			this.rentedhouse = rentedhouse;
		}
		public double getSalAmount() {
			return salAmount;
		}
		public void setSalAmount(double salAmount) {
			this.salAmount = salAmount;
		}
	    
	    
	    

}
