package br.com.fiap.techchallenge.frameworks.db.converters;

import br.com.fiap.techchallenge.domain.vos.OrderItem;
import br.com.fiap.techchallenge.frameworks.db.entities.OrderItemEntity;
import org.springframework.stereotype.Component;

@Component
public class OrderItemEntityToOrderItem {

    public OrderItem convert(final OrderItemEntity orderItemEntity) {
        return OrderItem
                .builder()
                .product(orderItemEntity.getProduct().toString())
                .quantity(orderItemEntity.getQuantity())
                .price(orderItemEntity.getPrice())
                .build();
    }
}
