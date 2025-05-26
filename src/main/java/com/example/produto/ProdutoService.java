package com.example.produto;

import com.example.produto.dto.ProdutoCreateDTO;
import com.example.produto.dto.ProdutoDTO;
import com.example.produto.dto.ProdutoUpdateDTO;
import com.example.produto.exception.ProdutoNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    private final ProdutoRepository repository;
    
    
    public ProdutoService(ProdutoRepository repository) {
    	this.repository = repository;
    }
    

    public Produto adicionar(ProdutoCreateDTO dto) {
        Produto produto = new Produto();
        produto.setNome(dto.getNome());
        produto.setPreco(dto.getPreco());
        produto.setQuantidade(dto.getQuantidade());
        return repository.save(produto);
    }

    public Produto atualizar(Long id, ProdutoUpdateDTO dto) {
        Produto produto = repository.findById(id).orElseThrow(() -> new ProdutoNotFoundException(id));
        produto.setNome(dto.getNome());
        produto.setPreco(dto.getPreco());
        produto.setQuantidade(dto.getQuantidade());
        return repository.save(produto);
    }

    public void deletar(Long id) {
        if (!repository.existsById(id)) {
            throw new ProdutoNotFoundException(id);
        }
        repository.deleteById(id);
    }
    
    public Page<ProdutoDTO> listar(String nome, Pageable pageable) {
        if (nome == null || nome.isBlank()) {
            return repository.findAll(pageable).map(ProdutoDTO::new);
        } else {
            return repository.findByNomeContainingIgnoreCase(nome, pageable).map(ProdutoDTO::new);
        }
    }
}
