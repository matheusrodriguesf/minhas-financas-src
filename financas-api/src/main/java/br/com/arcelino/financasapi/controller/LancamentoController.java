package br.com.arcelino.financasapi.controller;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.arcelino.financasapi.model.request.FiltroLancamentoRequest;
import br.com.arcelino.financasapi.model.response.LancamentoResponse;
import br.com.arcelino.financasapi.service.LancamentoService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/lancamentos")
@RequiredArgsConstructor
public class LancamentoController {
    private final LancamentoService service;

    @GetMapping
    public Page<LancamentoResponse> buscarLancamentos(FiltroLancamentoRequest filtro, Pageable pageable) {
        return service.buscarLancamentos(filtro, pageable);
    }
}
