package br.com.fiap.techchallenge.frameworks.web.product;

import java.util.List;

import br.com.fiap.techchallenge.interfaces.controllers.product.responses.ProductResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface FindProductByCategoryWeb {

    @Operation(summary = "Find by category",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Find by category"),
                    @ApiResponse(responseCode = "404", description = "Product not found")
            })
    @GetMapping("/product/findByCategory")
    List<ProductResponse> findByCategory(@RequestParam String category);
}
