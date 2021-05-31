package com.example.tddKotlin.model

import javax.persistence.*

@Entity
class Customer {
   @Id
   @GeneratedValue
   var id: Int? = null
   var name: String? = null

   constructor() {}
   constructor(name: String?) {
      this.name = name
   }

   override fun toString(): String {
      return "Customer{" +
              "id=" + id +
              ", name='" + name + '\'' +
              '}'
   }
}