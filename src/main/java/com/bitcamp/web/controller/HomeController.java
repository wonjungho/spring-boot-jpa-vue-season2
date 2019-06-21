package com.bitcamp.web.controller;

import com.bitcamp.web.service.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * HomeController
 */
@Controller
public class HomeController {
    @Autowired CustomerService customerService; 
    @RequestMapping("/")   
    public String index() {
        int count = customerService.countAll();
        return "index";
    }
  
}