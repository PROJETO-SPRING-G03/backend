package com.generation.cacique.cacique.model;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tb_usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O atributo nome é obrigatorio e nao pode ser vazio")
    @Size(min = 3, max = 50, message = "O atributo nome deve conter no mínimo 3 e no máximo 50 caracteres")
    private String nome;

    @NotBlank(message = "O atributo usuário é obrigatorio e nao pode ser vazio")
    @Size(min = 3, max = 50, message = "O atributo usuário deve conter no mínimo 3 e no máximo 50 caracteres")
    private String usuario;

    @Email(message = "o atributo deve ser um email válido")
    private String email;

    @NotBlank(message = "O atributo senha é obrigatorio e nao pode ser vazio")
    @Size(min = 8, message = "O atributo senha deve conter no mínimo 8 caracteres")
    private String senha;

    private String foto;
}
