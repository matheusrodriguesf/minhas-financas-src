package br.com.arcelino.financasapi.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.NullValuePropertyMappingStrategy;

import br.com.arcelino.financasapi.entity.Usuario;
import br.com.arcelino.financasapi.model.request.UsuarioFormRequest;
import br.com.arcelino.financasapi.model.response.UsuarioResponse;

@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE, nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
public interface UsuarioMapper {

    UsuarioResponse toResponse(Usuario usuario);

    Usuario toEntity(UsuarioFormRequest usuarioForm);

}
