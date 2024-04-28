package br.com.fiap.techchallenge.application.usecases.product;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import br.com.fiap.techchallenge.application.gateways.ProductGateway;
import br.com.fiap.techchallenge.application.usecases.product.impl.RemoveProductImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class RemoveProductImplTest {

    @Mock
    private ProductGateway productGateway;

    @InjectMocks
    private RemoveProductImpl removeProduct;

    @Test
    public void testRemove() {
        String productId = "123";

        removeProduct.remove(productId);

        verify(productGateway, times(1)).remove(productId);
    }
}
