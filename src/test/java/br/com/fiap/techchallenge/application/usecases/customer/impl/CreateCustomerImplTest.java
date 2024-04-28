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
public class CreateCustomerImplTest {

    @Mock
    private CustomerGateway customerGateway;

    @InjectMocks
    private CreateCustomerImpl createCustomerImpl;

    @Test
    public void testCreateCustomer() {
        Customer dummyCustomer = new Customer(); // Substitua isso pela implementação real do seu objeto Customer.
        when(customerGateway.create(dummyCustomer)).thenReturn(dummyCustomer);

        // Ação
        Customer createdCustomer = createCustomerImpl.create(dummyCustomer);
        verify(customerGateway, times(1)).create(dummyCustomer);
        assertEquals(dummyCustomer, createdCustomer);
    }
}