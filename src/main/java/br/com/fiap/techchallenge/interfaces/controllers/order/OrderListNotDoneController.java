package br.com.fiap.techchallenge.interfaces.controllers.order;

import java.util.List;

import br.com.fiap.techchallenge.interfaces.controllers.order.responses.OrderResponse;

public interface OrderListNotDoneController {

    List<OrderResponse> orderListNotDone();
}
