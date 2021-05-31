package com.example.tddKotlin.controller

import com.example.tddKotlin.model.Customer
import com.example.tddKotlin.repository.CustomerRepository
import com.example.tddKotlin.service.CustomerService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class CustomerController {

    @Autowired
    lateinit var customerService: CustomerService

    @GetMapping("/customers")
    fun getAllCustomers(): MutableIterable<Customer> {
        return customerService.getAllCustomers();
    }

}