package com.example.tddKotlin.service

import com.example.tddKotlin.model.Customer
import com.example.tddKotlin.repository.CustomerRepository
import io.mockk.every
import io.mockk.mockk
import junit.framework.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito.`when`
import org.mockito.junit.MockitoJUnitRunner
import org.springframework.test.util.ReflectionTestUtils

@RunWith(MockitoJUnitRunner::class)
internal class CustomerServiceTest {

    @Mock
    lateinit var customerService: CustomerService

    val customerRepository = mockk<CustomerRepository>()

    @Test
    fun `getAllCustomers should return the list of customers`() {
        val expectedCustomers = listOf(Customer("Jimmy"), Customer("Javier"))
//        ReflectionTestUtils.setField(customerService, "customerRepository", customerRepository)
//        `when`(customerRepository.findAll()).thenReturn(expectedCustomers)
        every { customerRepository.findAll() } returns expectedCustomers
        assertEquals(expectedCustomers, customerService.getAllCustomers())
    }
}