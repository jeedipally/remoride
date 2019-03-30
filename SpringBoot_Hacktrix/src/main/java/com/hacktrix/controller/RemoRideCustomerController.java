package com.hacktrix.controller;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hacktrix.model.RemoRideCustomer;
import com.hacktrix.repository.LoanItemRepository;
import com.hacktrix.repository.RemoRideCustomerRepository;

/* written by Praveen Parsa */

@RestController
public class RemoRideCustomerController {
	private static Set<String> riskyLocations = new HashSet<String>();
	
	@Autowired
	RemoRideCustomerRepository customerRepository;
	
	@Autowired
	LoanItemRepository loanItemRepository;
		
	@RequestMapping("/addCustomer")
	@ResponseBody
	public String addLoanItem(@RequestParam("id") int id, @RequestParam("name") String name,
			@RequestParam("companyName") String companyName, @RequestParam("currentLocation") String currentLocation,
			@RequestParam("income") String income, @RequestParam("rent") String rent) {

		if (customerRepository.addCustomer(id, name, companyName, currentLocation, income, rent) >= 1) {
			return "customer Added Successfully";
		} else {
			return "Something went wrong !";
		}
	}

	@RequestMapping("/getCustomerDetails")
	@ResponseBody
	public RemoRideCustomer getCustomerDetails(@RequestParam("custId") int custId) {
		RemoRideCustomer remorideCustomer = customerRepository.getCustomer(custId);
		setRiskFactor(remorideCustomer);
		return remorideCustomer;
	}

	public void setRiskFactor(RemoRideCustomer remorideCustomer) {
		boolean isRiskyLocation = riskyLocations.contains(remorideCustomer.getCurrentLocation());
		if (isRiskyLocation) {
			remorideCustomer.setRiskFactor(70);
		}			
	}

	static {
		riskyLocations.add("Siria");
		riskyLocations.add("North Korea");
		riskyLocations.add("Afganisthan");
	}
}
