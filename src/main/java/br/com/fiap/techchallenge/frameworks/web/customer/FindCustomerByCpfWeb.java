package br.com.fiap.techchallenge.frameworks.web.customer;

import br.com.fiap.techchallenge.interfaces.controllers.customer.responses.CustomerResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface FindCustomerByCpfWeb {

    @Operation(summary = "Find by CPF",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Customer found"),
                    @ApiResponse(responseCode = "404", description = "Customer not found")
            })
    @GetMapping("/customer")
    CustomerResponse findByCpf(@RequestParam String cpf);
}
