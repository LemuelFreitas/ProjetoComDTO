package com.ProjetocomDTO.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ProjetocomDTO.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}