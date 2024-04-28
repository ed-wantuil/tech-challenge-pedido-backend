package br.com.fiap.techchallenge.domain.vos;

import br.com.fiap.techchallenge.domain.enums.ProductCategoryEnum;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@EqualsAndHashCode
public class ProductCategory {
    ProductCategoryEnum category;

    public ProductCategory(final String category) {
        validate(category);

        this.category = ProductCategoryEnum.valueOf(category);
    }

    private void validate(final String category) {
        if (category == null) {
            throw new IllegalArgumentException("Category cannot be null");
        }
    }
}
