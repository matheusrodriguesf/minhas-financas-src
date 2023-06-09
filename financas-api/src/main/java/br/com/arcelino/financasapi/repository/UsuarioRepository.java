package br.com.arcelino.financasapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.arcelino.financasapi.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
