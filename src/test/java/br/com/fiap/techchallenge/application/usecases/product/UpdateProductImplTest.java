package br.com.fiap.techchallenge.application.usecases.product;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.eq;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import br.com.fiap.techchallenge.application.gateways.ProductGateway;
import br.com.fiap.techchallenge.application.usecases.product.impl.UpdateProductImpl;
import br.com.fiap.techchallenge.domain.entities.Product;
import br.com.fiap.techchallenge.domain.vos.ProductName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class UpdateProductImplTest {

    @Mock
    private ProductGateway productGateway;

    @InjectMocks
    private UpdateProductImpl updateProduct;

    @Test
    public void testUpdateProduct() {
        String productId = "123";
        Product mockProduct = Product.builder()
                .name(ProductName.builder()
                        .name("produto1")
                        .build())
                .build();
        Product updatedProduct = Product.builder()
                .name(ProductName.builder()
                        .name("produto1")
                        .build())
                .build();

        when(productGateway.update(eq(productId), any(Product.class))).thenReturn(updatedProduct);

        Product resultProduct = updateProduct.update(productId, mockProduct);

        verify(productGateway, times(1)).update(productId, mockProduct);
        assertNotNull(resultProduct, "O produto retornado não deve ser nulo.");
        assertEquals(updatedProduct, resultProduct, "O produto retornado deve ser o produto atualizado.");
    }
}
