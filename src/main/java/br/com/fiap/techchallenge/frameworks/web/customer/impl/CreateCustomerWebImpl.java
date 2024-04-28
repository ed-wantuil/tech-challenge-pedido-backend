package br.com.fiap.techchallenge.frameworks.web.customer.impl;

import br.com.fiap.techchallenge.frameworks.web.customer.CreateCustomerWeb;
import br.com.fiap.techchallenge.interfaces.controllers.customer.CreateCustomerController;
import br.com.fiap.techchallenge.interfaces.controllers.customer.requests.CustomerRequest;
import br.com.fiap.techchallenge.interfaces.controllers.customer.responses.CustomerResponse;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CreateCustomerWebImpl implements CreateCustomerWeb {

    private final CreateCustomerController customerCreateController;

    public CustomerResponse create(final CustomerRequest customerRequest) {
        return customerCreateController.create(customerRequest);
    }

}
