package br.com.fiap.techchallenge.interfaces.controllers.product.converters;

import br.com.fiap.techchallenge.domain.entities.Product;
import br.com.fiap.techchallenge.domain.vos.ProductCategory;
import br.com.fiap.techchallenge.domain.vos.ProductDescription;
import br.com.fiap.techchallenge.domain.vos.ProductImage;
import br.com.fiap.techchallenge.domain.vos.ProductName;
import br.com.fiap.techchallenge.domain.vos.ProductPrice;
import br.com.fiap.techchallenge.interfaces.controllers.product.requests.ProductRequest;

public class ProductRequestToProduct {

    public Product convert(final ProductRequest productRequests) {
        return Product.builder()
                .id(productRequests.id())
                .name(new ProductName(productRequests.name()))
                .category(new ProductCategory(productRequests.category()))
                .price(new ProductPrice(productRequests.price()))
                .description(new ProductDescription(productRequests.description()))
                .image(new ProductImage(productRequests.image()))
                .build();

    }
}
