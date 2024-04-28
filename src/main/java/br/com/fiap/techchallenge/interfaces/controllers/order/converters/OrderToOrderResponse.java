package br.com.fiap.techchallenge.interfaces.controllers.order.converters;

import java.util.Objects;

import br.com.fiap.techchallenge.domain.entities.Order;
import br.com.fiap.techchallenge.interfaces.controllers.customer.converters.CustomerToCustomerResponse;
import br.com.fiap.techchallenge.interfaces.controllers.order.responses.OrderResponse;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class OrderToOrderResponse {

    private final CustomerToCustomerResponse customerToCustomerResponse;

    public OrderResponse convert(final Order order) {
        return OrderResponse
                .builder()
                .id(order.getId())
                .customer(Objects.nonNull(order.getCustomer()) ? customerToCustomerResponse.convert(order.getCustomer()) : null)
                .items(order.getItems().stream().map(item -> OrderResponse.OrderItemResponse.builder()
                        .product(item.product())
                        .price(item.price())
                        .quantity(item.quantity())
                        .build()).toList())
                .created(order.getCreated())
                .amount(order.getAmount().amount())
                .build();
    }
}
