package br.com.arcelino.financasapi.model.request;

import br.com.arcelino.financasapi.enumeration.StatusLancamentoEnum;
import br.com.arcelino.financasapi.enumeration.TipoLancamentoEnum;

public record FiltroLancamentoRequest(
        String descricao,
        Integer mes,
        Integer ano,
        TipoLancamentoEnum tipo,
        StatusLancamentoEnum status) {

}
