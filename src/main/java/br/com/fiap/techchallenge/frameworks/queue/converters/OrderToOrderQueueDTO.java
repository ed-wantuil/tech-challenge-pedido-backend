package br.com.fiap.techchallenge.frameworks.queue.converters;

import java.util.Objects;

import br.com.fiap.techchallenge.domain.entities.Order;
import br.com.fiap.techchallenge.frameworks.queue.dtos.OrderQueueDTO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class OrderToOrderQueueDTO {

    public OrderQueueDTO convert(final Order order) {
        return OrderQueueDTO
                .builder()
                .orderId(Objects.nonNull(order.getId()) ? order.getId() : null)
                .customerId(Objects.nonNull(order.getCustomer()) ? order.getCustomer().getId() : null)
                .amount(order.getAmount().amount())
                .created(order.getCreated())
                .build();
    }
}
