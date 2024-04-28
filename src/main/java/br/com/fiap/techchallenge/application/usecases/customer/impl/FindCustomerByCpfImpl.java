package br.com.fiap.techchallenge.application.usecases.customer.impl;

import br.com.fiap.techchallenge.application.usecases.customer.FindCustomerByCpf;
import br.com.fiap.techchallenge.application.gateways.CustomerGateway;
import br.com.fiap.techchallenge.domain.entities.Customer;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class FindCustomerByCpfImpl implements FindCustomerByCpf {
    private final CustomerGateway customerGateway;

    @Override
    public Customer findByCpf(final String cpf) {
        return customerGateway.findByCpf(cpf);
    }
}
