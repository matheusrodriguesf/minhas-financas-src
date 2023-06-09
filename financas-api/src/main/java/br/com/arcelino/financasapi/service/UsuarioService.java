package br.com.arcelino.financasapi.service;

import org.springframework.stereotype.Service;

import br.com.arcelino.financasapi.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UsuarioService {
    private final UsuarioRepository repository;

}
