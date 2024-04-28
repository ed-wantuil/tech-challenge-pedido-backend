package br.com.fiap.techchallenge.application.usecases.customer.impl;

import br.com.fiap.techchallenge.application.usecases.customer.CreateCustomer;
import br.com.fiap.techchallenge.application.gateways.CustomerGateway;
import br.com.fiap.techchallenge.domain.entities.Customer;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CreateCustomerImpl implements CreateCustomer {

    private final CustomerGateway customerGateway;

    @Override
    public Customer create(final Customer customer) {
        return customerGateway.create(customer);
    }

}
