package br.com.fiap.techchallenge.application.usecases.order;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import br.com.fiap.techchallenge.application.gateways.OrderGateway;
import br.com.fiap.techchallenge.application.usecases.order.impl.OrderCheckoutImpl;
import br.com.fiap.techchallenge.domain.entities.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class OrderCheckoutImplTest {

    @Mock
    private OrderGateway orderGateway;

    @InjectMocks
    private OrderCheckoutImpl orderCheckout;

    @Test
    public void testCheckout() {
        Order mockOrder = new Order(); // Assuma a existência de uma implementação adequada de Order.
        when(orderGateway.checkout(mockOrder)).thenReturn(mockOrder);

        Order resultOrder = orderCheckout.checkout(mockOrder);

        verify(orderGateway, times(1)).checkout(mockOrder);
        assertEquals(mockOrder, resultOrder, "O pedido retornado deve ser o mesmo que foi enviado para checkout.");
    }
}
