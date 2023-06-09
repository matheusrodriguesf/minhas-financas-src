package br.com.arcelino.financasapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.arcelino.financasapi.entity.Lancamento;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long> {

}
