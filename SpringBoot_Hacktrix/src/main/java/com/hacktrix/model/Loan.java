package com.hacktrix.model;

/**
 * @author PraveenKumar Velaga
 *
 */
public class Loan {

    private int loanId;
    private String name;
    private String loanType;
    private String loanAmount;
    private String loanStatus;

    public Loan() {
    }

    public Loan(int loanId, String name, String loanType, String loanAmount, String loanStatus) {
        this.loanId = loanId;
        this.name = name;
        this.loanType = loanType;
        this.loanAmount = loanAmount;
        this.loanStatus = loanStatus;
    }

    
    public String getLoanStatus() {
		return loanStatus;
	}

	public void setLoanStatus(String loanStatus) {
		this.loanStatus = loanStatus;
	}

	public String getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(String loanAmount) {
		this.loanAmount = loanAmount;
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

	public int getLoanId() {
		return loanId;
	}

	public void setLoanId(int loanId) {
		this.loanId = loanId;
	}

    
}
