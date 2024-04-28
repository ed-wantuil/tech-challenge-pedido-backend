package br.com.fiap.techchallenge.interfaces.controllers.order.responses;

import java.time.LocalDate;
import java.util.List;

import br.com.fiap.techchallenge.interfaces.controllers.customer.responses.CustomerResponse;
import lombok.Builder;


@Builder
public record OrderResponse(String id,
                            CustomerResponse customer,
                            List<OrderItemResponse> items,
                            LocalDate created,
                            Double amount) {

    @Builder
    public record OrderItemResponse(String product,
                                    Integer quantity,
                                    Double price) {
    }
}
