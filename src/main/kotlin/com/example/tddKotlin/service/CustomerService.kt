package com.example.tddKotlin.service

import com.example.tddKotlin.model.Customer
import com.example.tddKotlin.repository.CustomerRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CustomerService {

    @Autowired
    lateinit var customerRepository: CustomerRepository

    fun getAllCustomers() : MutableIterable<Customer> {
        return customerRepository.findAll()
    }
}