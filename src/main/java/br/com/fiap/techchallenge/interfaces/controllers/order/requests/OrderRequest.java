package br.com.fiap.techchallenge.interfaces.controllers.order.requests;

import java.time.LocalDate;
import java.util.List;

import br.com.fiap.techchallenge.interfaces.controllers.customer.requests.CustomerRequest;
import lombok.Builder;

@Builder
public record OrderRequest(String id,
                           CustomerRequest customer,
                           List<OrderItemRequest> items,
                           LocalDate created,
                           Double amount) {

    @Builder
    public record OrderItemRequest(String product,
                                   Integer quantity,
                                   Double price) {
    }
}
