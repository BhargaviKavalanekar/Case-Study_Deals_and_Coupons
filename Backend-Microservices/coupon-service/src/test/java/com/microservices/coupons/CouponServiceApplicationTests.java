package com.microservices.coupons;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.microservices.coupons.controllers.AdminController;
import com.microservices.coupons.exceptions.CustomException;
import com.microservices.coupons.model.Customer;
import com.microservices.coupons.repository.CustomersRepository;


@SpringBootTest
class CouponServiceApplicationTests {
 
	@Autowired
	private AdminController admincontroller;
	
	@MockBean
	private CustomersRepository customersrepo;
	
    @Test
    public void getAllCustomersTest() throws CustomException {
    	when(customersrepo.findAll()).thenReturn(Stream.of(new Customer("34","vamsi","yadav","vamsi@gmail.com","vamsi@988", null),
    			new Customer("12","vyom","yadav","vyom@gmail.com","vyom@988", null)).collect(Collectors.toList()));
			assertEquals(2,admincontroller.getAllCustomers().size());
		
    }

}