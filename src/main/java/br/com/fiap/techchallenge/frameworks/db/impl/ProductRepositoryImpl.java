package br.com.fiap.techchallenge.frameworks.db.impl;

import java.util.List;
import java.util.UUID;

import br.com.fiap.techchallenge.application.gateways.ProductGateway;
import br.com.fiap.techchallenge.domain.entities.Product;
import br.com.fiap.techchallenge.frameworks.db.converters.ProductEntityToProduct;
import br.com.fiap.techchallenge.frameworks.db.converters.ProductToProductEntity;
import br.com.fiap.techchallenge.frameworks.db.repositories.SpringDataProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class ProductRepositoryImpl implements ProductGateway {

    private final SpringDataProductRepository springDataProductRepository;

    private final ProductEntityToProduct productEntityToProduct;

    private final ProductToProductEntity productToProductEntity;

    @Override
    public List<Product> find() {
        return springDataProductRepository
                .findAll()
                .stream()
                .map(productEntityToProduct::convert)
                .toList();
    }

    @Override
    public List<Product> findByCategory(final String category) {
        return springDataProductRepository.findByCategory(category)
                .stream()
                .map(productEntityToProduct::convert)
                .toList();
    }

    @Override
    public Product create(final Product product) {
        var productEntity = productToProductEntity.convert(product);
        productEntity = springDataProductRepository.save(productEntity);

        return productEntityToProduct.convert(productEntity);
    }

    @Override
    public Product update(final String id, final Product product) {
        var productEntity = springDataProductRepository
                .findById(UUID.fromString(product.getId())).orElseThrow();

        productEntity.setName(product.getName().name());
        productEntity.setCategory(product.getCategory().getCategory().name());
        productEntity.setPrice(product.getPrice().price());
        productEntity.setDescription(product.getDescription().description());
        productEntity.setImage(product.getImage().image());
        productEntity = springDataProductRepository.save(productEntity);

        return productEntityToProduct.convert(productEntity);
    }

    @Override
    public void remove(final String id) {
        springDataProductRepository.deleteById(UUID.fromString(id));
    }
}
