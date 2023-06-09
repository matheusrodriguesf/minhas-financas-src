package br.com.arcelino.financasapi.service;

import org.springframework.stereotype.Service;

import br.com.arcelino.financasapi.repository.LancamentoRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class LancamentoService {

    private final LancamentoRepository repository;

}
