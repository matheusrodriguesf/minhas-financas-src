package br.com.arcelino.financasapi.model.response;

import java.math.BigDecimal;

import br.com.arcelino.financasapi.enumeration.StatusLancamentoEnum;
import br.com.arcelino.financasapi.enumeration.TipoLancamentoEnum;

public record LancamentoResponse(
        Long id,
        String descricao,
        Integer mes,
        Integer ano,
        String usuario,
        BigDecimal valor,
        TipoLancamentoEnum tipoLancamento,
        StatusLancamentoEnum statusLancamento) {

}
