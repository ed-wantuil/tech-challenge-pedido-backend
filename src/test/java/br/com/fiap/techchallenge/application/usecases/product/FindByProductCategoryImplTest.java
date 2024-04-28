package br.com.fiap.techchallenge.application.usecases.product;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import br.com.fiap.techchallenge.application.gateways.ProductGateway;
import br.com.fiap.techchallenge.application.usecases.product.impl.FindByProductCategoryImpl;
import br.com.fiap.techchallenge.domain.entities.Product;
import br.com.fiap.techchallenge.domain.vos.ProductName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

@ExtendWith(MockitoExtension.class)
public class FindByProductCategoryImplTest {

    @Mock
    private ProductGateway productGateway;

    @InjectMocks
    private FindByProductCategoryImpl findByProductCategory;

    @Test
    public void testFindByCategory() {
        String category = "Electronics";
        List<Product> expectedProducts = new ArrayList<>();
        expectedProducts.add(Product.builder()
                .name(ProductName.builder()
                        .name("product1")
                        .build()).build());
        expectedProducts.add(Product.builder()
                .name(ProductName.builder()
                        .name("product2")
                        .build()).build());

        when(productGateway.findByCategory(category)).thenReturn(expectedProducts);

        List<Product> resultProducts = findByProductCategory.findByCategory(category);

        verify(productGateway, times(1)).findByCategory(category);
        assertNotNull(resultProducts, "A lista de produtos retornado não deve ser nula.");
        assertEquals(expectedProducts.size(), resultProducts.size(), "O número de produtos retornados deve ser igual ao esperado.");
    }
}
