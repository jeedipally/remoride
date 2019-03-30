package com.hacktrix.model;

/* 
 * Written by Praveen Velaga 8/
 * 
 */
public class Loan {

    private int id;
    private String name;
    private String loanType;
    private String loanAmount;

    public Loan() {
    }

    public Loan(int id, String name, String loanType, String loanAmount) {
        this.id = id;
        this.name = name;
        this.loanType = loanType;
        this.loanAmount = loanAmount;
    }

    
    public String getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(String loanAmount) {
		this.loanAmount = loanAmount;
	}

	public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

	public String getLoanType() {
		return loanType;
	}

	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}

    
}
