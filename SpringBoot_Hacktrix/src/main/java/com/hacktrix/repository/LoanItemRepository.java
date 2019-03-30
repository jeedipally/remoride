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
/* 
 * Written by Praveen Velaga 8/
 * 
 */
@Repository
public class LoanItemRepository {

    @Autowired
    JdbcTemplate template;

    /*Getting all Items from table*/
    public List<Loan> getAllLoanItems(){
        List<Loan> items = template.query("select id, name,loanType,loanAmount from loan",(result,rowNum)->new Loan(result.getInt("id"),
                result.getString("name"),result.getString("loanType"), result.getString("loanAmount")));
        return items;
    }
    /*Getting a specific loan item by item id from table*/
    public Loan getLoanItem(int loanItemId){
        String query = "SELECT * FROM LOAN WHERE ID=?";
        Loan item = template.queryForObject(query,new Object[]{loanItemId},new BeanPropertyRowMapper<>(Loan.class));

        return item;
    }
    /*Adding an item into database table*/
    public int addLoanItem(int id,String name,String loanType, String loanAmount){
        String query = "INSERT INTO LOAN VALUES(?,?,?,?)";
        return template.update(query,id,name,loanType,loanAmount);
    }
    /*delete an item from database*/
    public int deleteItem(int id){
        String query = "DELETE FROM LOAN WHERE ID =?";
        return template.update(query,id);
    }
}
