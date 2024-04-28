package br.com.fiap.techchallenge.frameworks.web.product;

import br.com.fiap.techchallenge.interfaces.controllers.product.requests.ProductRequest;
import br.com.fiap.techchallenge.interfaces.controllers.product.responses.ProductResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface UpdateProductWeb {

    @Operation(summary = "Update a new product",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Update created"),
                    @ApiResponse(responseCode = "404", description = "Product not found")
            })
    @PutMapping("product/{id}")
    ProductResponse update(@PathVariable String id,
                           @RequestBody ProductRequest productRequest);

}
