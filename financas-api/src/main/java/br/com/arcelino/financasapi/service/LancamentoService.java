package br.com.arcelino.financasapi.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import br.com.arcelino.financasapi.model.request.FiltroLancamentoRequest;
import br.com.arcelino.financasapi.model.response.LancamentoResponse;
import br.com.arcelino.financasapi.repository.LancamentoRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class LancamentoService {

    private final LancamentoRepository repository;

    public Page<LancamentoResponse> buscarLancamentos(FiltroLancamentoRequest filtro, Pageable pageable) {
        return repository.buscarLancamentos(filtro, pageable);

    }

}
