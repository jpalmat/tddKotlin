package com.example.tddKotlin.service

import com.example.tddKotlin.model.Customer
import com.example.tddKotlin.repository.CustomerRepository
import junit.framework.Assert.assertEquals
import org.junit.Test
//import org.junit.jupiter.api.Assertions.*
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.Mockito.`when`
import org.mockito.junit.MockitoJUnitRunner
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.mock.mockito.MockBean

@RunWith(MockitoJUnitRunner::class)
internal class CustomerServiceTest {

    @Mock
    lateinit var customerService: CustomerService

    @Mock
    lateinit var customerRepository : CustomerRepository

    @Test
    fun `getAllCustomers should return the list of customers`() {
        val expectedCustomers = listOf(Customer("Jimmy"), Customer("Javier"))
        `when`(customerRepository.findAll()).thenReturn(expectedCustomers)
        assertEquals(expectedCustomers, customerService.getAllCustomers())
    }
}