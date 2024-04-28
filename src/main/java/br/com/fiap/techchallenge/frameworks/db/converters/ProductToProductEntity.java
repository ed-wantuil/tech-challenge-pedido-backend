package br.com.fiap.techchallenge.frameworks.db.converters;

import java.util.Objects;
import java.util.UUID;

import br.com.fiap.techchallenge.domain.entities.Product;
import br.com.fiap.techchallenge.frameworks.db.entities.ProductEntity;
import org.springframework.stereotype.Component;

@Component
public class ProductToProductEntity {

    public ProductEntity convert(final Product product) {
        return ProductEntity
                .builder()
                .id(Objects.nonNull(product.getId()) ? UUID.fromString(product.getId()) : null)
                .name(product.getName().name())
                .category(product.getCategory().getCategory().name())
                .price(product.getPrice().price())
                .description(product.getDescription().description())
                .image(product.getImage().image())
                .build();
    }
}
