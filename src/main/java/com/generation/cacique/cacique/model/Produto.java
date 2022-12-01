package com.generation.cacique.cacique.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;
import java.math.BigDecimal;

@Entity
@Table(name = "tb_produtos")
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O atributo nome é obrigatorio e nao pode ser vazio")
    @Size(min = 3, max = 100, message = "O atributo nome deve conter no mínimo 3 e no máximo 100 caracteres")
    private String nome;

    @NotNull(message = "o preço não pode ser nulo")
    @PositiveOrZero(message = "o preço deve ser positivo ou zero.")
    private BigDecimal preco;

    @PositiveOrZero(message = "o preço deve ser positivo ou zero.")
    private Long quantidade;

    @NotNull(message = "o tamanho não pode ser nulo")
    private String tamanho;

    private String foto;

}
