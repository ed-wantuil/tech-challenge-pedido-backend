package br.com.fiap.techchallenge.frameworks.db.impl;

import br.com.fiap.techchallenge.application.gateways.CustomerGateway;
import br.com.fiap.techchallenge.domain.entities.Customer;
import br.com.fiap.techchallenge.frameworks.db.converters.CustomerEntityToCustomer;
import br.com.fiap.techchallenge.frameworks.db.converters.CustomerToCustomerEntity;
import br.com.fiap.techchallenge.frameworks.db.repositories.SpringDataCustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class CustomerRepositoryImpl implements CustomerGateway {

    private final SpringDataCustomerRepository springDataCustomerRepository;

    private final CustomerToCustomerEntity customerToCustomerEntity;

    private final CustomerEntityToCustomer customerEntityToCustomer;

    @Override
    public Customer create(final Customer customer) {
        var customerEntity = customerToCustomerEntity.convert(customer);
        customerEntity = springDataCustomerRepository.save(customerEntity);

        return customerEntityToCustomer.convert(customerEntity);
    }

    @Override
    public Customer findByCpf(final String cpf) {
        final var customerEntity = springDataCustomerRepository.findByCpf(cpf);

        return customerEntityToCustomer.convert(customerEntity);
    }
}
