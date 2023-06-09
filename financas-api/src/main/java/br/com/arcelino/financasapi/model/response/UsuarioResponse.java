package br.com.arcelino.financasapi.model.response;

public record UsuarioResponse(Long id, String nome, String email, Boolean ativo, String dataCadastro) {

}
