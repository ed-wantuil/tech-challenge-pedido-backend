package br.com.fiap.techchallenge.domain.entities;


import br.com.fiap.techchallenge.domain.vos.Cpf;
import br.com.fiap.techchallenge.domain.vos.CustomerName;
import br.com.fiap.techchallenge.domain.vos.Email;
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
public class Customer {
    private String id;
    private Cpf cpf;
    private CustomerName name;
    private Email email;

}
