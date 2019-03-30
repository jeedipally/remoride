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

@Repository
public class ItemRepository {

    @Autowired
    JdbcTemplate template;

    /*Getting all Items from table*/
    public List<Loan> getAllItems(){
        List<Loan> items = template.query("select id, name,category from item",(result,rowNum)->new Loan(result.getInt("id"),
                result.getString("name"),result.getString("category"), null, null));
        return items;
    }
    /*Getting a specific item by item id from table*/
    public Loan getItem(int itemId){
        String query = "SELECT * FROM ITEM WHERE ID=?";
        Loan item = template.queryForObject(query,new Object[]{itemId},new BeanPropertyRowMapper<>(Loan.class));

        return item;
    }
    /*Adding an item into database table*/
    public int addItem(int id,String name,String category){
        String query = "INSERT INTO ITEM VALUES(?,?,?)";
        return template.update(query,id,name,category);
    }
    /*delete an item from database*/
    public int deleteItem(int id){
        String query = "DELETE FROM ITEM WHERE ID =?";
        return template.update(query,id);
    }
}
