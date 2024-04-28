package br.com.fiap.techchallenge.frameworks.web.order;

import br.com.fiap.techchallenge.interfaces.controllers.order.requests.OrderRequest;
import br.com.fiap.techchallenge.interfaces.controllers.order.responses.OrderResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface OrderCheckoutWeb {

    @Operation(summary = "Checkout a new order",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Checkout a new order")
            })
    @PostMapping("/checkout")
    OrderResponse create(@RequestBody OrderRequest orderRequest);
}
