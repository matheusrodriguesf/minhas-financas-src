package br.com.arcelino.financasapi.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_usuario", schema = "financas")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private Long id;

    @Column(name = "nome_usuario", nullable = false, length = 150)
    private String nome;

    @Column(name = "email_usuario", nullable = false, length = 150, unique = true)
    private String email;

    @Column(name = "senha_usuario", nullable = false, length = 150)
    private String senha;

    @Column(name = "st_usuario", nullable = false)
    private Boolean ativo;

    @Column(name = "data_cadastro_usuario", insertable = false, updatable = false)
    private LocalDateTime dataCadastro;

}
