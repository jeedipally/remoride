package com.hacktrix.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.hacktrix.model.RemoRideCustomer;

/*Written by Praveen Parsa*/

@Repository
public class RemoRideCustomerRepository {
		

    @Autowired
    JdbcTemplate template;
    
    public RemoRideCustomer getCustomer(int id){
        String query = "SELECT * FROM remocustomer WHERE id=?";
        RemoRideCustomer custDetails = template.queryForObject(query,new Object[]{id},new BeanPropertyRowMapper<>(RemoRideCustomer.class));
        return custDetails;
    }

	public int addCustomer(int id, String name, String companyName, String currentLocation, String income,
			String rent) {
		String query = "INSERT INTO LOAN VALUES(?,?,?,?,?,?)";
		return template.update(query, id, name, companyName, currentLocation, income, rent);

	}

}
