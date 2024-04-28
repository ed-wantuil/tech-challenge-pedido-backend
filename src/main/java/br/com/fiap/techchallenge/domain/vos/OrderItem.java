package br.com.fiap.techchallenge.domain.vos;

import lombok.Builder;

@Builder
public record OrderItem(String product, Integer quantity, Double price) {
    public OrderItem {
        validate(product, quantity, price);

    }

    private void validate(final String product, final Integer quantity, final Double price) {
        if (product == null || product.isEmpty()) {
            throw new IllegalArgumentException("Product ID cannot be null or empty");
        }

        if (quantity == null || quantity <= 0) {
            throw new IllegalArgumentException("Quantity cannot be null or less than or equal to zero");
        }

        if (price == null || price <= 0) {
            throw new IllegalArgumentException("Price cannot be null or less than or equal to zero");
        }
    }
}
