package br.com.fiap.techchallenge.frameworks.web.customer;

import br.com.fiap.techchallenge.interfaces.controllers.customer.requests.CustomerRequest;
import br.com.fiap.techchallenge.interfaces.controllers.customer.responses.CustomerResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface CreateCustomerWeb {

    @Operation(summary = "Create a new customer",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Customer created")
            })
    @PostMapping("/customer")
    CustomerResponse create(@RequestBody CustomerRequest customerRequest);

}
