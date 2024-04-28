package br.com.fiap.techchallenge.interfaces.controllers.customer.converters;

import br.com.fiap.techchallenge.domain.entities.Customer;
import br.com.fiap.techchallenge.interfaces.controllers.customer.responses.CustomerResponse;

public class CustomerToCustomerResponse {

    public CustomerResponse convert(final Customer customer) {
        return CustomerResponse.builder()
                .id(customer.getId())
                .cpf(customer.getCpf().cpf())
                .name(customer.getName().name())
                .email(customer.getEmail().value())
                .build();
    }
}
