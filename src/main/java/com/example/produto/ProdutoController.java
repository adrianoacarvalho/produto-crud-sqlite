package com.example.produto;

import com.example.produto.dto.ProdutoCreateDTO;
import com.example.produto.dto.ProdutoDTO;
import com.example.produto.dto.ProdutoUpdateDTO;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    
    private final ProdutoService service;
    
    public ProdutoController(ProdutoService service) {
    	this.service = service;
    }

    @PostMapping
    public Produto adicionar(@Valid @RequestBody ProdutoCreateDTO dto) {
        return service.adicionar(dto);
    }

    @PutMapping("/{id}")
    public Produto atualizar(@PathVariable Long id, @Valid @RequestBody ProdutoUpdateDTO dto) {
        return service.atualizar(id, dto);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
    
    @GetMapping
    public Page<ProdutoDTO> listar(
        @RequestParam(required = false) String nome,
        Pageable pageable
    ) {
        return service.listar(nome, pageable);
    }
}
