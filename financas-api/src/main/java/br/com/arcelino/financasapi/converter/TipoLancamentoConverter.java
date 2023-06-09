package br.com.arcelino.financasapi.converter;

import br.com.arcelino.financasapi.enumeration.TipoLancamentoEnum;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class TipoLancamentoConverter implements AttributeConverter<TipoLancamentoEnum, Integer> {

    @Override
    public Integer convertToDatabaseColumn(TipoLancamentoEnum attribute) {
        return attribute != null ? attribute.getCodigo() : null;
    }

    @Override
    public TipoLancamentoEnum convertToEntityAttribute(Integer dbData) {
        return dbData != null ? TipoLancamentoEnum.getType(dbData) : null;
    }
}
