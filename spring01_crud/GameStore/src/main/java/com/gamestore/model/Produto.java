package com.gamestore.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.sun.istack.NotNull;

@Entity
@Table(name = "tb_produto")
public class Produto {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long id_produto;
	@NotBlank
	private String nome;
	@NotBlank
	private String descricao_produto;
	@NotNull
	private long quantidade_estoque;
	@NotNull
	private double preco_produto;
	
	
	public long getId_produto() {
		return id_produto;
	}
	public void setId_produto(long id_produto) {
		this.id_produto = id_produto;
	}
	public String getNome_produto() {
		return nome;
	}
	public void setNome_produto(String nome_produto) {
		this.nome = nome_produto;
	}
	public String getDescricao_produto() {
		return descricao_produto;
	}
	public void setDescricao_produto(String descricao_produto) {
		this.descricao_produto = descricao_produto;
	}
	public long getQuantidade_estoque() {
		return quantidade_estoque;
	}
	public void setQuantidade_estoque(long quantidade_estoque) {
		this.quantidade_estoque = quantidade_estoque;
	}
	public double getPreco_produto() {
		return preco_produto;
	}
	public void setPreco_produto(double preco_produto) {
		this.preco_produto = preco_produto;
	}
	
}
