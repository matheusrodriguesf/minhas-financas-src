package br.com.arcelino.financasapi.enumeration;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public enum StatusLancamentoEnum {
    PEDENTE(1, "Pendente"),
    CANCELADO(2, "Cancelado"),
    EFETIVADO(3, "Efetivado");

    private final Integer codigo;
    private final String descricao;

    private static final Map<Integer, StatusLancamentoEnum> codigoToTipoLancamentoEnum = Arrays
            .stream(StatusLancamentoEnum.values())
            .collect(Collectors.toMap(StatusLancamentoEnum::getCodigo, tipo -> tipo));

    StatusLancamentoEnum(Integer codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public static StatusLancamentoEnum getType(Integer codigo) {
        return codigoToTipoLancamentoEnum.get(codigo);
    }
}
