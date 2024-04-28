package br.com.fiap.techchallenge.frameworks.web.order.impl;

import br.com.fiap.techchallenge.frameworks.web.order.OrderCheckoutWeb;
import br.com.fiap.techchallenge.interfaces.controllers.order.OrderCheckoutController;
import br.com.fiap.techchallenge.interfaces.controllers.order.requests.OrderRequest;
import br.com.fiap.techchallenge.interfaces.controllers.order.responses.OrderResponse;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class OrderCheckoutWebImpl implements OrderCheckoutWeb {

    private final OrderCheckoutController orderCheckoutController;

    public OrderResponse create(final OrderRequest orderRequest) {
        return orderCheckoutController.create(orderRequest);
    }
}
