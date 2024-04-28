package br.com.fiap.techchallenge.domain.entities;


import br.com.fiap.techchallenge.domain.vos.ProductCategory;
import br.com.fiap.techchallenge.domain.vos.ProductDescription;
import br.com.fiap.techchallenge.domain.vos.ProductImage;
import br.com.fiap.techchallenge.domain.vos.ProductName;
import br.com.fiap.techchallenge.domain.vos.ProductPrice;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Product {
    private String id;
    private ProductName name;
    private ProductCategory category;
    private ProductPrice price;
    private ProductDescription description;
    private ProductImage image;
}
