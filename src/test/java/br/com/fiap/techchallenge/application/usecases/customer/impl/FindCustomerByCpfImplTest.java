package br.com.fiap.techchallenge.application.usecases.customer.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import br.com.fiap.techchallenge.application.gateways.CustomerGateway;
import br.com.fiap.techchallenge.domain.entities.Customer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class FindCustomerByCpfImplTest {

    @Mock
    private CustomerGateway customerGateway;

    @InjectMocks
    private FindCustomerByCpfImpl findCustomerByCpfImpl;

    @Test
    public void testFindByCpf() {
        String cpf = "123.456.789-00";
        Customer expectedCustomer = new Customer(); // Suponha que este seja o objeto Customer esperado.

        when(customerGateway.findByCpf(cpf)).thenReturn(expectedCustomer);

        Customer resultCustomer = findCustomerByCpfImpl.findByCpf(cpf);

        verify(customerGateway, times(1)).findByCpf(cpf);
        assertEquals(expectedCustomer, resultCustomer);
    }
}