package com.generation.cacique.cacique.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table( name = "tb_categorias")
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O atributo nome é obrigatorio e nao pode ser vazio")
    @Size(min = 3, max = 50, message = "O atributo nome não deve conter no mínimo 3 e no máximo 50 caracteres")
    private String nome;

    @NotBlank(message = "O atributo nome é obrigatorio e nao pode ser vazio")
    @Size(min = 3, max = 100, message = "O atributo descricao  não deve conter no mínimo 3 e no máximo 100 caracteres")
    private String descricao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
