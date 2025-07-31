package com.onec.bms.loan.repositories;

import com.onec.bms.loan.model.Customer;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerRepository
{
    public Customer findById(String customerId) {
        return new Customer();
    }
}
