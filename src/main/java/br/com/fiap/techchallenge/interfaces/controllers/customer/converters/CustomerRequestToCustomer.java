package br.com.fiap.techchallenge.interfaces.controllers.customer.converters;


import br.com.fiap.techchallenge.domain.entities.Customer;
import br.com.fiap.techchallenge.domain.vos.Cpf;
import br.com.fiap.techchallenge.domain.vos.CustomerName;
import br.com.fiap.techchallenge.domain.vos.Email;
import br.com.fiap.techchallenge.interfaces.controllers.customer.requests.CustomerRequest;

public class CustomerRequestToCustomer {

    public Customer convert(final CustomerRequest customerRequest) {
        return Customer.builder()
                .id(customerRequest.id())
                .cpf(new Cpf(customerRequest.cpf()))
                .name(new CustomerName(customerRequest.name()))
                .email(new Email(customerRequest.email()))
                .build();
    }
}
