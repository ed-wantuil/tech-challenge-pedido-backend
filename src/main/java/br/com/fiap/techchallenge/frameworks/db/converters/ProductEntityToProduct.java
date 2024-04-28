package br.com.fiap.techchallenge.frameworks.db.converters;

import br.com.fiap.techchallenge.domain.entities.Product;
import br.com.fiap.techchallenge.domain.vos.ProductCategory;
import br.com.fiap.techchallenge.domain.vos.ProductDescription;
import br.com.fiap.techchallenge.domain.vos.ProductImage;
import br.com.fiap.techchallenge.domain.vos.ProductName;
import br.com.fiap.techchallenge.domain.vos.ProductPrice;
import br.com.fiap.techchallenge.frameworks.db.entities.ProductEntity;
import org.springframework.stereotype.Component;

@Component
public class ProductEntityToProduct {

    public Product convert(final ProductEntity productEntity) {
        return Product
                .builder()
                .id(productEntity.getId().toString())
                .name(new ProductName(productEntity.getName()))
                .category(new ProductCategory(productEntity.getCategory()))
                .price(new ProductPrice(productEntity.getPrice()))
                .description(new ProductDescription(productEntity.getDescription()))
                .image(new ProductImage(productEntity.getImage()))
                .build();
    }
}
