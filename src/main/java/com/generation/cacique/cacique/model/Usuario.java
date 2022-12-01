package com.generation.cacique.cacique.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.List;

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
    private String username;

    @Email(message = "o atributo deve ser um email válido")
    private String email;

    @NotBlank(message = "O atributo senha é obrigatorio e nao pode ser vazio")
    @Size(min = 8, message = "O atributo senha deve conter no mínimo 8 caracteres")
    private String senha;

    private String foto;

    @OneToMany(mappedBy = "usuario", cascade = CascadeType.REMOVE)
    @JsonIgnoreProperties("usuario")
    private List<Produto> produto;

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

    public String getUsername() {
        return username;
    }

    public void setUsername(String usernaame) {
        this.username = usernaame;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
}
