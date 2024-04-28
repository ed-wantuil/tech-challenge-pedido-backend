package br.com.fiap.techchallenge.application.usecases.customer;

import br.com.fiap.techchallenge.domain.entities.Customer;

public interface CreateCustomer {
    Customer create(Customer customer);
}
