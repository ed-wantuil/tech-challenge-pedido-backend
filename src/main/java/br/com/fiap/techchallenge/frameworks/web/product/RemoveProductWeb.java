package br.com.fiap.techchallenge.frameworks.web.product;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface RemoveProductWeb {

    @Operation(summary = "Remove a product by id",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Product removed"),
                    @ApiResponse(responseCode = "404", description = "Product not found")
            })
    @DeleteMapping("product/{id}")
    void remove(@PathVariable("id") String id);
}
