package dev.osiel.requestcreditsystem.service.impl

import dev.osiel.requestcreditsystem.entity.Customer
import dev.osiel.requestcreditsystem.exception.BusinessException
import dev.osiel.requestcreditsystem.repository.CustomerRepository
import dev.osiel.requestcreditsystem.service.ICustomerService
import org.springframework.stereotype.Service

@Service
class CustomerService(
    private val customerRepository: CustomerRepository
): ICustomerService {
    override fun save(customer: Customer): Customer =
        this.customerRepository.save(customer)

    override fun findById(id: Long): Customer =
        this.customerRepository.findById(id).orElseThrow{
            throw BusinessException("Id $id not found")
        }

    override fun delete(id: Long) {
        val customer: Customer = this.findById(id)
        this.customerRepository.delete(customer)
    }
}