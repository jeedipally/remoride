package com.hacktrix.controller;
import java.util.List;

import com.hacktrix.model.Loan;
import com.hacktrix.repository.LoanItemRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author PraveenKumar Velaga
 *
 */
@RestController

public class LoanItemController {
	
	
    @Autowired
    LoanItemRepository loanRepo;

    @RequestMapping("/getAllLoans")
    @CrossOrigin(origins = "*")
    @ResponseBody
    public List<Loan> getAllLoanItems(){
        return loanRepo.getAllLoanItems();
    }

    @RequestMapping("/getLoan")
    @ResponseBody
    @CrossOrigin(origins = "*")
    public Loan getLoanItem(@RequestParam("loanId") int loanId){
        return loanRepo.getLoanItem(loanId);
    }

    @RequestMapping("/addLoan")
    @ResponseBody
    @CrossOrigin(origins = "*")
    public String addLoanItem(@RequestParam("id") int id,@RequestParam("name") String name,
                          @RequestParam("loanType") String loanType, @RequestParam("loanAmount") String loanAmount, @RequestParam("loanAmount") String loanStatus ){
        if(loanRepo.addLoanItem(id,name,loanType, loanAmount) >= 1){
            return "Item Added Successfully";
        }else{
            return "Something went wrong !";
        }
    }
    @RequestMapping("/deteteLoan")
    @ResponseBody
    public String deteteLoanItem(@RequestParam("loanId") int loanId){
        if(loanRepo.deleteItem(loanId) >= 1){
            return "Item Deleted Successfully";
        }else{
            return "Something went wrong !";
        }
    }
}