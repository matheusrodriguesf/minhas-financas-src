package br.com.arcelino.financasapi.controller;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.arcelino.financasapi.model.request.UsuarioFormRequest;
import br.com.arcelino.financasapi.model.response.UsuarioResponse;
import br.com.arcelino.financasapi.service.UsuarioService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/usuarios")
@RequiredArgsConstructor
public class UsuarioController {

    private final UsuarioService service;

    @GetMapping
    public Page<UsuarioResponse> getUsuarios(Pageable pageable) {
        return service.getUsuarios(pageable);
    }

    @GetMapping(params = "email")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<UsuarioResponse> getUsuarioByEmail(@RequestParam String email) {
        return ResponseEntity.ok(service.getUsuarioByEmail(email));
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<UsuarioResponse> getUsuarioById(@PathVariable Long id) {
        return ResponseEntity.ok(service.getUsuarioById(id));
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<UsuarioResponse> save(@RequestBody UsuarioFormRequest usuarioForm) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.save(usuarioForm));
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<UsuarioResponse> update(@PathVariable Long id, @RequestBody UsuarioFormRequest usuarioForm) {
        return ResponseEntity.ok(service.update(id, usuarioForm));
    }

    @PutMapping("/{id}/inativar")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<UsuarioResponse> inativar(@PathVariable Long id) {
        return ResponseEntity.ok(service.inativar(id));
    }

    @PutMapping("/{id}/ativar")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<UsuarioResponse> ativar(@PathVariable Long id) {
        return ResponseEntity.ok(service.ativar(id));
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

}
