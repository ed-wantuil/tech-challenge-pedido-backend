package br.com.fiap.techchallenge.frameworks.db.converters;

import java.util.Objects;
import java.util.UUID;

import br.com.fiap.techchallenge.domain.entities.Customer;
import br.com.fiap.techchallenge.frameworks.db.entities.CustomerEntity;
import org.springframework.stereotype.Component;

@Component
public class CustomerToCustomerEntity {

    public CustomerEntity convert(final Customer customer) {
        return CustomerEntity
                .builder()
                .id(Objects.nonNull(customer.getId()) ? UUID.fromString(customer.getId()) : null)
                .name(customer.getName().name())
                .email(customer.getEmail().value())
                .cpf(customer.getCpf().cpf())
                .build();
    }
}
