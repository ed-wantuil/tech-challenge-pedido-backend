package br.com.fiap.techchallenge.interfaces.controllers.customer;

import br.com.fiap.techchallenge.interfaces.controllers.customer.requests.CustomerRequest;
import br.com.fiap.techchallenge.interfaces.controllers.customer.responses.CustomerResponse;

public interface CreateCustomerController {

    CustomerResponse create(CustomerRequest customerRequest);

}
