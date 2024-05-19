package br.com.fiap.techchallenge.frameworks.queue.converters;

import br.com.fiap.techchallenge.domain.entities.Customer;
import br.com.fiap.techchallenge.domain.entities.Order;
import br.com.fiap.techchallenge.domain.vos.OrderAmount;
import br.com.fiap.techchallenge.frameworks.queue.dtos.OrderQueueDTO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class OrderQueueDTOToOrder {


    public Order convert(final OrderQueueDTO orderQueueDTO) {
        return Order
                .builder()
                .id(orderQueueDTO.orderId())
                .customer(Customer.builder()
                        .id(orderQueueDTO.customerId())
                        .build())
                .created(orderQueueDTO.created())
                .amount(new OrderAmount(orderQueueDTO.amount()))
                .build();
    }
}
