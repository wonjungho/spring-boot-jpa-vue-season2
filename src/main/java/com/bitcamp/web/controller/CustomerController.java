package com.bitcamp.web.controller;

import java.util.HashMap;
import com.bitcamp.web.common.util.PageProxy;
import com.bitcamp.web.domain.CustomerDTO;
import com.bitcamp.web.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * CustomerController
 */
@RestController
@RequestMapping("/customers")
public class CustomerController {
    @Autowired CustomerService customerService;
    @Autowired CustomerDTO customer;
    @Autowired PageProxy pxy;

    @PostMapping("")
    public HashMap<String,Object> join(){
        HashMap<String,Object> map = new HashMap<>();
        map.put("result", "success");
       
        return map; 
    }

    @GetMapping("/page/{pageNum}")
    public HashMap<String, Object> list(@PathVariable String pageNum){
       HashMap<String, Object> map = new HashMap<>();
       return map;
    }

    @GetMapping("/count")   
    public String count() {
        System.out.println("CustomerController count() 경로로 들어옴");
        int count = customerService.countAll();
        return "100";
    }

    @GetMapping("/{customerId}/{password}")
    public CustomerDTO login(@PathVariable("customerId")String id,
                        @PathVariable("password")String pass){
        
        customer.setCustomerId(id);
        customer.setPassword(pass);
        return customerService.login(customer);
    }

   
    @GetMapping("/{customerId}")
    public CustomerDTO getCustomer(@PathVariable String customerId) {
        System.out.println("ID 검색 진입 : "+customerId);
        return customerService.findCustomerByCustomerId(customerId);
    }

    @PutMapping("/modify")
    public CustomerDTO updateCustomer() {
        customer.setAddress("test");
        customer.setCustomerId("test");
        customer.setCity("city");
        customer.setCustomerName("customerName");
        customer.setPassword("password");
        customer.setPhone("phone");
        customer.setPostalcode("postalcode");
        customer.setSsn("ssn");
        return customer;
    }

    @DeleteMapping("/delete")
    public HashMap<String,Object> deleteCustomer() {
        HashMap<String, Object> map = new HashMap<>();
        map.put("result","탈퇴성공");
        return map;
    }
}