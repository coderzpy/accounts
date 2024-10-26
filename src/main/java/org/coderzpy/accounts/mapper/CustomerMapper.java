package org.coderzpy.accounts.mapper;

import org.coderzpy.accounts.dto.CustomerDto;
import org.coderzpy.accounts.entity.Customer;

import java.time.LocalDateTime;

public class CustomerMapper {
    public static CustomerDto mapToCustomerDto(Customer customer, CustomerDto customerDto) {
        customerDto.setName(customer.getName());
        customerDto.setEmail(customer.getEmail());
        customerDto.setMobileNumber(customer.getMobileNumber());
        return customerDto;
    }

    public static Customer mapToCustomer(CustomerDto customerDto, Customer customer) {
        customer.setName(customerDto.getName());
        customer.setEmail(customerDto.getEmail());
        customer.setMobileNumber(customerDto.getMobileNumber());
        customer.setCreatedBy("System"); // or set it from customerDto if available

        // Set the createdAt field to the current timestamp
        if (customer.getCreatedAt() == null) {
            customer.setCreatedAt(LocalDateTime.now());
        }
        return customer;
    }
}
