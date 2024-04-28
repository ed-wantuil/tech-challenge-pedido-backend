package br.com.fiap.techchallenge.interfaces.controllers.order;

import br.com.fiap.techchallenge.interfaces.controllers.order.requests.OrderRequest;
import br.com.fiap.techchallenge.interfaces.controllers.order.responses.OrderResponse;

public interface OrderCheckoutController {

    OrderResponse create(OrderRequest orderRequest);
}
