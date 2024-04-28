package br.com.fiap.techchallenge.frameworks.db.converters;

import java.util.Objects;
import java.util.UUID;

import br.com.fiap.techchallenge.domain.vos.OrderItem;
import br.com.fiap.techchallenge.frameworks.db.entities.OrderItemEntity;
import org.springframework.stereotype.Component;

@Component
public class OrderItemToOrderItemEntity {

    public OrderItemEntity convert(final OrderItem orderItem) {
        return OrderItemEntity
                .builder()
                .product(Objects.nonNull(orderItem.product()) ? UUID.fromString(orderItem.product()) : null)
                .quantity(orderItem.quantity())
                .price(orderItem.price())
                .build();
    }
}
