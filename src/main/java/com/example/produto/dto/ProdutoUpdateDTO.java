package com.example.produto.dto;

import jakarta.validation.constraints.NotNull;

public class ProdutoUpdateDTO extends ProdutoBaseDTO {
	@NotNull
	private Long id;
	
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
