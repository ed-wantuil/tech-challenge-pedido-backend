package br.com.fiap.techchallenge.interfaces.controllers.customer.impl;

import br.com.fiap.techchallenge.application.usecases.customer.FindCustomerByCpf;
import br.com.fiap.techchallenge.interfaces.controllers.customer.FindCustomerByCpfController;
import br.com.fiap.techchallenge.interfaces.controllers.customer.converters.CustomerToCustomerResponse;
import br.com.fiap.techchallenge.interfaces.controllers.customer.responses.CustomerResponse;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@AllArgsConstructor
@Slf4j
public class FindCustomerByCpfControllerImpl implements FindCustomerByCpfController {

    private final FindCustomerByCpf customerFindByCpf;

    private final CustomerToCustomerResponse customerToCustomerResponse;

    public CustomerResponse findByCpf(final String cpf) {
        log.info("Finding customer by CPF {}", cpf);

        final var customer = customerFindByCpf.findByCpf(cpf);

        return customerToCustomerResponse.convert(customer);
    }
}
