package com.example.tddKotlin.repository

import com.example.tddKotlin.model.Customer
import org.springframework.data.repository.CrudRepository


interface CustomerRepository: CrudRepository<Customer, Int> {
}