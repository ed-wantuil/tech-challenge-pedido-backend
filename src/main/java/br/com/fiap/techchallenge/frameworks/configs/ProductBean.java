package br.com.fiap.techchallenge.frameworks.configs;

import br.com.fiap.techchallenge.application.gateways.ProductGateway;
import br.com.fiap.techchallenge.application.usecases.product.CreateProduct;
import br.com.fiap.techchallenge.application.usecases.product.FindProduct;
import br.com.fiap.techchallenge.application.usecases.product.FindProductByCategory;
import br.com.fiap.techchallenge.application.usecases.product.RemoveProduct;
import br.com.fiap.techchallenge.application.usecases.product.UpdateProduct;
import br.com.fiap.techchallenge.application.usecases.product.impl.CreateProductImpl;
import br.com.fiap.techchallenge.application.usecases.product.impl.FindByProductCategoryImpl;
import br.com.fiap.techchallenge.application.usecases.product.impl.FindProductImpl;
import br.com.fiap.techchallenge.application.usecases.product.impl.RemoveProductImpl;
import br.com.fiap.techchallenge.application.usecases.product.impl.UpdateProductImpl;
import br.com.fiap.techchallenge.frameworks.web.product.CreateProductWeb;
import br.com.fiap.techchallenge.frameworks.web.product.FindProductByCategoryWeb;
import br.com.fiap.techchallenge.frameworks.web.product.FindProductWeb;
import br.com.fiap.techchallenge.frameworks.web.product.RemoveProductWeb;
import br.com.fiap.techchallenge.frameworks.web.product.UpdateProductWeb;
import br.com.fiap.techchallenge.frameworks.web.product.impl.CreateProductWebImpl;
import br.com.fiap.techchallenge.frameworks.web.product.impl.FindProductByCategoryWebImpl;
import br.com.fiap.techchallenge.frameworks.web.product.impl.FindProductWebImpl;
import br.com.fiap.techchallenge.frameworks.web.product.impl.RemoveProductWebImpl;
import br.com.fiap.techchallenge.frameworks.web.product.impl.UpdateProductWebImpl;
import br.com.fiap.techchallenge.interfaces.controllers.product.CreateProductController;
import br.com.fiap.techchallenge.interfaces.controllers.product.FindProductByCategoryController;
import br.com.fiap.techchallenge.interfaces.controllers.product.FindProductController;
import br.com.fiap.techchallenge.interfaces.controllers.product.RemoveProductController;
import br.com.fiap.techchallenge.interfaces.controllers.product.UpdateProductController;
import br.com.fiap.techchallenge.interfaces.controllers.product.converters.ProductRequestToProduct;
import br.com.fiap.techchallenge.interfaces.controllers.product.converters.ProductToProductResponse;
import br.com.fiap.techchallenge.interfaces.controllers.product.impl.CreateProductControllerImpl;
import br.com.fiap.techchallenge.interfaces.controllers.product.impl.FindProductByCategoryControllerImpl;
import br.com.fiap.techchallenge.interfaces.controllers.product.impl.FindProductControllerImpl;
import br.com.fiap.techchallenge.interfaces.controllers.product.impl.RemoveProductControllerImpl;
import br.com.fiap.techchallenge.interfaces.controllers.product.impl.UpdateProductControllerImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProductBean {

    @Bean
    CreateProduct productCreate(final ProductGateway productRepository) {
        return new CreateProductImpl(productRepository);
    }

    @Bean
    ProductRequestToProduct productRequestToProduct() {
        return new ProductRequestToProduct();
    }

    @Bean
    ProductToProductResponse productToProductResponse() {
        return new ProductToProductResponse();
    }

    @Bean
    CreateProductController productCreateController(final CreateProduct productCreate,
                                                    final ProductRequestToProduct productRequestToProduct,
                                                    final ProductToProductResponse productToProductResponse) {
        return new CreateProductControllerImpl(productCreate, productRequestToProduct, productToProductResponse);
    }

    @Bean
    CreateProductWeb createProductWeb(final CreateProductController createProductController) {
        return new CreateProductWebImpl(createProductController);
    }

    @Bean
    FindProductByCategory productFindByCategory(final ProductGateway productRepository) {
        return new FindByProductCategoryImpl(productRepository);
    }

    @Bean
    FindProductByCategoryController productFindByCategoryController(final FindProductByCategory productFindByCategory,
                                                                    final ProductToProductResponse productToProductResponse) {
        return new FindProductByCategoryControllerImpl(productFindByCategory, productToProductResponse);
    }

    @Bean
    FindProductByCategoryWeb findProductByCategoryWeb(final FindProductByCategoryController findProductByCategoryController) {
        return new FindProductByCategoryWebImpl(findProductByCategoryController);
    }

    @Bean
    FindProduct productFind(final ProductGateway productRepository) {
        return new FindProductImpl(productRepository);
    }

    @Bean
    FindProductController productFindController(final FindProduct productFind,
                                                final ProductToProductResponse productToProductResponse) {
        return new FindProductControllerImpl(productFind, productToProductResponse);
    }

    @Bean
    FindProductWeb findProductWeb(final FindProductController findProductController) {
        return new FindProductWebImpl(findProductController);
    }

    @Bean
    RemoveProduct productRemove(final ProductGateway productRepository) {
        return new RemoveProductImpl(productRepository);
    }

    @Bean
    RemoveProductController productRemoveController(final RemoveProduct productRemove) {
        return new RemoveProductControllerImpl(productRemove);
    }

    @Bean
    RemoveProductWeb removeProductWeb(final RemoveProductController removeProductController) {
        return new RemoveProductWebImpl(removeProductController);
    }

    @Bean
    UpdateProduct productUpdate(final ProductGateway productRepository) {
        return new UpdateProductImpl(productRepository);
    }

    @Bean
    UpdateProductController productUpdateController(final UpdateProduct productUpdate,
                                                    final ProductRequestToProduct productRequestToProduct,
                                                    final ProductToProductResponse productToProductResponse) {
        return new UpdateProductControllerImpl(productUpdate, productRequestToProduct, productToProductResponse);
    }

    @Bean
    UpdateProductWeb updateProductWeb(final UpdateProductController updateProductController) {
        return new UpdateProductWebImpl(updateProductController);
    }
}
