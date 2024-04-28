package br.com.fiap.techchallenge.frameworks.db.converters;

import java.util.Objects;
import java.util.UUID;

import br.com.fiap.techchallenge.domain.entities.Order;
import br.com.fiap.techchallenge.frameworks.db.entities.OrderEntity;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class OrderToOrderEntity {

    private final CustomerToCustomerEntity customerToCustomerEntity;

    private final OrderItemToOrderItemEntity orderItemToOrderItemEntity;

    public OrderEntity convert(final Order order) {
        return OrderEntity
                .builder()
                .id(Objects.nonNull(order.getId()) ? UUID.fromString(order.getId()) : null)
                .customer(Objects.nonNull(order.getCustomer()) ? customerToCustomerEntity.convert(order.getCustomer()) : null)
                .items(order.getItems()
                        .stream()
                        .map(orderItemToOrderItemEntity::convert)
                        .toList())
                .amount(order.getAmount().amount())
                .created(order.getCreated())
                .build();
    }
}
