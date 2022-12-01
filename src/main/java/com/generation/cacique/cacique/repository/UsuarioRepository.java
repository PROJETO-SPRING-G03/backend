package com.generation.cacique.cacique.repository;

import com.generation.cacique.cacique.model.Produto;
import com.generation.cacique.cacique.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UsuarioRepository extends JpaRepository<Usuario,Long> {


    public List<Usuario> findAllByNomeContainingIgnoreCase(@Param("nome") String nome);

}