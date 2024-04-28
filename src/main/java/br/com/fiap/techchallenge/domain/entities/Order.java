package br.com.fiap.techchallenge.domain.entities;

import java.time.LocalDate;
import java.util.List;

import br.com.fiap.techchallenge.domain.vos.OrderAmount;
import br.com.fiap.techchallenge.domain.vos.OrderItem;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Order {
    private String id;
    private Customer customer;
    private List<OrderItem> items;
    private LocalDate created;
    private OrderAmount amount;
}
