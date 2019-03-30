package com.hacktrix.model;

public class Loan {

    private int id;
    private String name;
    private String category;
    private String loanType;
    private RemoRideCustomer customer;

    public Loan() {
    }

    public Loan(int id, String name, String category, String loanType, RemoRideCustomer customer) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.loanType = loanType;
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

	public String getLoanType() {
		return loanType;
	}

	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}

	public RemoRideCustomer getCustomer() {
		return customer;
	}

	public void setCustomer(RemoRideCustomer customer) {
		this.customer = customer;
	}
    
    
}
