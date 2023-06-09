package br.com.arcelino.financasapi.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.arcelino.financasapi.entity.Lancamento;
import br.com.arcelino.financasapi.model.request.FiltroLancamentoRequest;
import br.com.arcelino.financasapi.model.response.LancamentoResponse;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long> {

    @Query("""
            select new br.com.arcelino.financasapi.model.response.LancamentoResponse(
                lancamento.id as id,
                lancamento.descricao as descricao,
                lancamento.mes as mes,
                lancamento.ano as ano,
                lancamento.usuario.nome as usuario,
                lancamento.valor as valor,
                lancamento.tipo as tipoLancamento,
                lancamento.status as statusLancamento
            )
            from Lancamento as lancamento
            where (:#{#filtro.descricao} is null or lancamento.descricao like %:#{#filtro.descricao}%)
            and (:#{#filtro.mes} is null or lancamento.mes = :#{#filtro.mes})
            and (:#{#filtro.ano} is null or lancamento.ano = :#{#filtro.ano})
            and (:#{#filtro.tipo} is null or lancamento.tipo = :#{#filtro.tipo})
            and (:#{#filtro.status} is null or lancamento.status = :#{#filtro.status})
            order by lancamento.id desc
            """)
    Page<LancamentoResponse> buscarLancamentos(FiltroLancamentoRequest filtro, Pageable pageable);

}
