package br.com.fiap.techchallenge.frameworks.db.converters;


import br.com.fiap.techchallenge.domain.entities.Customer;
import br.com.fiap.techchallenge.domain.vos.Cpf;
import br.com.fiap.techchallenge.domain.vos.CustomerName;
import br.com.fiap.techchallenge.domain.vos.Email;
import br.com.fiap.techchallenge.frameworks.db.entities.CustomerEntity;
import org.springframework.stereotype.Component;

@Component
public class CustomerEntityToCustomer {

    public Customer convert(final CustomerEntity customerEntity) {
        return Customer
                .builder()
                .id(customerEntity.getId().toString())
                .name(new CustomerName(customerEntity.getName()))
                .email(new Email(customerEntity.getEmail()))
                .cpf(new Cpf(customerEntity.getCpf()))
                .build();
    }
}
