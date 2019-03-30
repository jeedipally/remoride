/**
 * 
 */
package com.hacktrix.model;

/**
 * @author Narendar
 *
 */
public class Customer {
	
		private int id;
	    private int loanId;
	    private String name;
	    private String salaryType;
	    private String loan;
	    private String rentedhouse;
	    private double salAmount;
	    
		public int getLoanId() {
			return loanId;
		}
		public String getLoan() {
			return loan;
		}
		public void setLoan(String loan) {
			this.loan = loan;
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
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
	    
	    
	    

}
