package br.com.fiap.techchallenge.interfaces.controllers.order.impl;

import br.com.fiap.techchallenge.application.usecases.order.OrderCheckout;
import br.com.fiap.techchallenge.interfaces.controllers.order.OrderCheckoutController;
import br.com.fiap.techchallenge.interfaces.controllers.order.converters.OrderRequestToOrder;
import br.com.fiap.techchallenge.interfaces.controllers.order.converters.OrderToOrderResponse;
import br.com.fiap.techchallenge.interfaces.controllers.order.requests.OrderRequest;
import br.com.fiap.techchallenge.interfaces.controllers.order.responses.OrderResponse;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@AllArgsConstructor
@Slf4j
public class OrderCheckoutControllerImpl implements OrderCheckoutController {

    private final OrderCheckout orderCheckout;

    private final OrderRequestToOrder orderRequestToOrder;

    private final OrderToOrderResponse orderToOrderResponse;

    public OrderResponse create(final OrderRequest orderRequest) {
        log.info("Creating product {}", orderRequest);

        var order = orderRequestToOrder.convert(orderRequest);

        order = orderCheckout.checkout(order);

        return orderToOrderResponse.convert(order);
    }
}
