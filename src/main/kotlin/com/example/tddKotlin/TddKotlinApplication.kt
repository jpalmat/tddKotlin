package com.example.tddKotlin

import com.example.tddKotlin.model.Customer
import com.example.tddKotlin.repository.CustomerRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import java.time.LocalDate


@SpringBootApplication
class TddKotlinApplication: CommandLineRunner {

	@Autowired
	lateinit var customerRepository: CustomerRepository

	override fun run(vararg args: String?) {
		customerRepository.deleteAll()

		//customer 1
		val customer1 = Customer("Jimmy")
		customerRepository.save(customer1)

		//customer 2
		val customer2 = Customer("Javier")
		customerRepository.save(customer2)
	}
}

fun main(args: Array<String>) {
	runApplication<TddKotlinApplication>(*args)
}
