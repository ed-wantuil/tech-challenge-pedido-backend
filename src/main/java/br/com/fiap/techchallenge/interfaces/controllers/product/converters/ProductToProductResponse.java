package br.com.fiap.techchallenge.interfaces.controllers.product.converters;


import br.com.fiap.techchallenge.domain.entities.Product;
import br.com.fiap.techchallenge.interfaces.controllers.product.responses.ProductResponse;

public class ProductToProductResponse {

    public ProductResponse convert(final Product product) {
        return ProductResponse.builder()
                .id(product.getId())
                .name(product.getName().name())
                .category(product.getCategory().getCategory().name())
                .price(product.getPrice().price())
                .description(product.getDescription().description())
                .image(product.getImage().image())
                .build();
    }
}
