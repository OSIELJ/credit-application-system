package dev.osiel.requestcreditsystem.service

import dev.osiel.requestcreditsystem.entity.Customer

interface ICustomerService {

    fun save(customer: Customer): Customer

    fun findById(id: Long): Customer

    fun delete(id: Long)
}