package br.com.fiap.techchallenge.application.usecases.product;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import br.com.fiap.techchallenge.application.gateways.ProductGateway;
import br.com.fiap.techchallenge.application.usecases.product.impl.FindProductImpl;
import br.com.fiap.techchallenge.domain.entities.Product;
import br.com.fiap.techchallenge.domain.vos.ProductName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class FindProductImplTest {

    @Mock
    private ProductGateway productGateway;

    @InjectMocks
    private FindProductImpl findProduct;

    @Test
    public void testFind() {
        Product product1 = Product.builder()
                .name(ProductName.builder()
                        .name("produto1")
                        .build())
                .build();
        List<Product> expectedProducts = Arrays.asList(product1);

        when(productGateway.find()).thenReturn(expectedProducts);

        List<Product> resultProducts = findProduct.find();

        verify(productGateway, times(1)).find();
        assertNotNull(resultProducts, "A lista de produtos retornada não deve ser nula.");
        assertEquals(expectedProducts.size(), resultProducts.size(), "O tamanho da lista de produtos retornados deve ser igual ao esperado.");
        assertEquals(expectedProducts, resultProducts, "A lista de produtos retornada deve ser igual à lista esperada.");
    }
}
