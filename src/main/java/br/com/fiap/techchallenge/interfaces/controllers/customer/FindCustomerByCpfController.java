package br.com.fiap.techchallenge.interfaces.controllers.customer;

import br.com.fiap.techchallenge.interfaces.controllers.customer.responses.CustomerResponse;

public interface FindCustomerByCpfController {

    CustomerResponse findByCpf(String cpf);
}
