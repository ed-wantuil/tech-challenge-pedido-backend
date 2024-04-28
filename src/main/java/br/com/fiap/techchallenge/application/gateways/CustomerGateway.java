package br.com.fiap.techchallenge.application.gateways;


import br.com.fiap.techchallenge.domain.entities.Customer;

public interface CustomerGateway {
    Customer create(Customer customer);

    Customer findByCpf(String cpf);
}
