package br.com.arcelino.financasapi.service;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import br.com.arcelino.financasapi.mapper.UsuarioMapper;
import br.com.arcelino.financasapi.model.request.UsuarioFormRequest;
import br.com.arcelino.financasapi.model.response.UsuarioResponse;
import br.com.arcelino.financasapi.repository.UsuarioRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UsuarioService {

    private final UsuarioRepository repository;
    private final UsuarioMapper mapper;

    public UsuarioResponse getUsuarioByEmail(String email) {
        var usuario = repository.findByEmail(email);
        return Optional.ofNullable(usuario).map(mapper::toResponse).orElse(null);
    }

    public UsuarioResponse getUsuarioById(Long id) {
        return repository.findById(id)
                .map(mapper::toResponse)
                .orElse(null);
    }

    public Page<UsuarioResponse> getUsuarios(Pageable pageable) {
        return repository.findAll(pageable)
                .map(mapper::toResponse);
    }

    @Transactional
    public UsuarioResponse save(UsuarioFormRequest usuarioForm) {
        return mapper.toResponse(repository.save(mapper.toEntity(usuarioForm)));
    }

    @Transactional
    public UsuarioResponse update(Long id, UsuarioFormRequest usuarioForm) {
        var usuario = repository.findById(id).orElseThrow();
        usuario.setNome(usuarioForm.nome());
        usuario.setEmail(usuarioForm.email());
        usuario.setSenha(usuarioForm.senha());
        return mapper.toResponse(repository.save(usuario));
    }

    @Transactional
    public UsuarioResponse inativar(Long id) {
        var usuario = repository.findById(id).orElseThrow();
        usuario.setAtivo(false);
        return mapper.toResponse(repository.save(usuario));
    }

    @Transactional
    public UsuarioResponse ativar(Long id) {
        var usuario = repository.findById(id).orElseThrow();
        usuario.setAtivo(true);
        return mapper.toResponse(repository.save(usuario));
    }

    @Transactional
    public void delete(Long id) {
        repository.deleteById(id);
    }

}
