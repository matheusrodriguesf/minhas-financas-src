package br.com.arcelino.financasapi.converter;

import br.com.arcelino.financasapi.enumeration.StatusLancamentoEnum;
import jakarta.persistence.AttributeConverter;

public class StatusLancamentoConverter implements AttributeConverter<StatusLancamentoEnum, Integer> {

    @Override
    public Integer convertToDatabaseColumn(StatusLancamentoEnum attribute) {
        return attribute != null ? attribute.getCodigo() : null;

    }

    @Override
    public StatusLancamentoEnum convertToEntityAttribute(Integer dbData) {
        return dbData != null ? StatusLancamentoEnum.getType(dbData) : null;
    }

}
