package br.com.fiap.techchallenge.application.gateways;

import br.com.fiap.techchallenge.domain.entities.Order;


public interface OrderGateway {
    Order checkout(Order order);

    Order findById(String id);
}
