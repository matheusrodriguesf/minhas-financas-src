package br.com.arcelino.financasapi.enumeration;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public enum TipoLancamentoEnum {
    RECEITA(1, "Receita"),
    DESPESA(2, "Despesa");

    private final Integer codigo;
    private final String descricao;
    private static final Map<Integer, TipoLancamentoEnum> codigoToTipoLancamentoEnum = Arrays
            .stream(TipoLancamentoEnum.values()).collect(Collectors.toMap(TipoLancamentoEnum::getCodigo, tipo -> tipo));

    TipoLancamentoEnum(Integer codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public static TipoLancamentoEnum getType(Integer codigo) {
        return codigoToTipoLancamentoEnum.get(codigo);
    }
}