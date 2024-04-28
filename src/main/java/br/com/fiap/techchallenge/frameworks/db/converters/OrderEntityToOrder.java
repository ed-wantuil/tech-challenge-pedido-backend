package br.com.fiap.techchallenge.frameworks.db.converters;

import java.util.Objects;

import br.com.fiap.techchallenge.domain.entities.Order;
import br.com.fiap.techchallenge.domain.vos.OrderAmount;
import br.com.fiap.techchallenge.frameworks.db.entities.OrderEntity;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class OrderEntityToOrder {

    private CustomerEntityToCustomer customerEntityToCustomer;

    private OrderItemEntityToOrderItem orderItemEntityToOrderItem;

    public Order convert(final OrderEntity orderEntity) {
        return Order
                .builder()
                .id(orderEntity.getId().toString())
                .customer(Objects.nonNull(orderEntity.getCustomer()) ? customerEntityToCustomer.convert(orderEntity.getCustomer()) : null)
                .items(orderEntity.getItems().stream().map(orderItemEntityToOrderItem::convert).toList())
                .created(orderEntity.getCreated())
                .amount(new OrderAmount(orderEntity.getAmount()))
                .build();
    }
}
