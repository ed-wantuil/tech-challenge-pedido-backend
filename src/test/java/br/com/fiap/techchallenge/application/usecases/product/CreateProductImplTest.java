package br.com.fiap.techchallenge.application.usecases.product;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import br.com.fiap.techchallenge.application.gateways.ProductGateway;
import br.com.fiap.techchallenge.application.usecases.product.impl.CreateProductImpl;
import br.com.fiap.techchallenge.domain.entities.Product;
import br.com.fiap.techchallenge.domain.vos.ProductName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class CreateProductImplTest {

    @Mock
    private ProductGateway productGateway;

    @InjectMocks
    private CreateProductImpl createProduct;

    @Test
    public void testCreateProduct() {
        Product mockProduct = Product.builder()
                .name(ProductName.builder()
                        .name("produto1")
                        .build())
                .build();
        when(productGateway.create(any(Product.class))).thenReturn(mockProduct);

        Product returnedProduct = createProduct.create(mockProduct);

        verify(productGateway, times(1)).create(mockProduct);
        assertEquals(mockProduct, returnedProduct, "O produto retornado deve ser o mesmo que foi criado.");
    }
}
