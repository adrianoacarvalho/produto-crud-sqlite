package com.example.produto.exception;

public class ProdutoNotFoundException extends RuntimeException {
    private static final long serialVersionUID = 1L;

	public ProdutoNotFoundException(Long id) {
        super("Produto com ID " + id + " não encontrado.");
    }
}
