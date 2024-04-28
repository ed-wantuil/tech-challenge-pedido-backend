package br.com.fiap.techchallenge.frameworks.web.customer.impl;

import br.com.fiap.techchallenge.frameworks.web.customer.FindCustomerByCpfWeb;
import br.com.fiap.techchallenge.interfaces.controllers.customer.FindCustomerByCpfController;
import br.com.fiap.techchallenge.interfaces.controllers.customer.responses.CustomerResponse;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class FindCustomerByCpfWebImpl implements FindCustomerByCpfWeb {

    private final FindCustomerByCpfController customerFindByCpfController;

    public CustomerResponse findByCpf(final String cpf) {
        return customerFindByCpfController.findByCpf(cpf);
    }
}
