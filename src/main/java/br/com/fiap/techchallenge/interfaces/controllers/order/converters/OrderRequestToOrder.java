package br.com.fiap.techchallenge.interfaces.controllers.order.converters;

import java.util.Objects;

import br.com.fiap.techchallenge.domain.entities.Order;
import br.com.fiap.techchallenge.domain.vos.OrderAmount;
import br.com.fiap.techchallenge.domain.vos.OrderItem;
import br.com.fiap.techchallenge.interfaces.controllers.customer.converters.CustomerRequestToCustomer;
import br.com.fiap.techchallenge.interfaces.controllers.order.requests.OrderRequest;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class OrderRequestToOrder {

    private CustomerRequestToCustomer customerRequestToCustomer;

    public Order convert(final OrderRequest orderRequest) {
        return Order
                .builder()
                .id(orderRequest.id())
                .customer(Objects.nonNull(orderRequest.customer()) ? customerRequestToCustomer.convert(orderRequest.customer()) : null)
                .items(orderRequest.items().stream()
                        .map(item -> OrderItem.builder()
                                .product(item.product())
                                .quantity(item.quantity())
                                .price(item.price())
                                .build())
                        .toList())
                .created(orderRequest.created())
                .amount(new OrderAmount(orderRequest.amount()))
                .build();
    }
}
