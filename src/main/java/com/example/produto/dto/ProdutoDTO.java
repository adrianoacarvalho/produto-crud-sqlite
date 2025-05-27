package com.example.produto.dto;

import com.example.produto.Produto;

import jakarta.validation.constraints.NotNull;

public class ProdutoDTO extends ProdutoBaseDTO {
	@NotNull
	private Long id;
    
    public ProdutoDTO(Produto produto) {
        this.id = produto.getId();
        this.nome = produto.getNome();
        this.preco = produto.getPreco();
        this.quantidade = produto.getQuantidade();}
    
    public Long getId() {
        return id;
    }
}
