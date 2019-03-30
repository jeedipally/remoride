package com.hacktrix.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.hacktrix.model.Loan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
/**
 * @author PraveenKumar Velaga
 *
 */
@Repository
public class LoanItemRepository {

    @Autowired
    JdbcTemplate template;

    public List<Loan> getAllLoanItems(){
        List<Loan> items = template.query("select loanId, name,loanType,loanAmount, loanStatus from loan",(result,rowNum)->new Loan(result.getInt("loanId"),
                result.getString("name"),result.getString("loanType"), result.getString("loanAmount"), result.getString("loanStatus")));
        return items;
    }
    public Loan getLoanItem(int loanItemId){
        String query = "SELECT * FROM LOAN WHERE loanId=?";
        Loan item = template.queryForObject(query,new Object[]{loanItemId},new BeanPropertyRowMapper<>(Loan.class));

        return item;
    }
    /*Adding an LoanItems into database table======> only for admin*/
    public int addLoanItem(int id,String name,String loanType, String loanAmount){
        String query = "INSERT INTO LOAN VALUES(?,?,?,?, ?)";
        return template.update(query,id,name,loanType,loanAmount);
    }
    /*delete an LoanItem from database=====> Only for Admin*/
    public int deleteItem(int id){
        String query = "DELETE FROM LOAN WHERE ID =?";
        return template.update(query,id);
    }
}
