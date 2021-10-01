package com.gamestore.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;

@Entity
@Table(name = "tb_produto")
public class Produto {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long idProduto;
	@NotNull
	private String nome;
	@NotNull
	private String descricaoProduto;
	@NotNull
	private long quantidadeEstoque;
	@NotNull
	private double precoProduto;
	@ManyToOne
	@JsonIgnoreProperties("produtos")
	private Categoria fk_categoria;
	
	public long getIdProduto() {
		return idProduto;
	}
	public void setIdProduto(long idProduto) {
		this.idProduto = idProduto;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricaoProduto() {
		return descricaoProduto;
	}
	public void setDescricaoProduto(String descricaoProduto) {
		this.descricaoProduto = descricaoProduto;
	}
	public long getQuantidadeEstoque() {
		return quantidadeEstoque;
	}
	public void setQuantidadeEstoque(long quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}
	public double getPrecoProduto() {
		return precoProduto;
	}
	public void setPrecoProduto(double precoProduto) {
		this.precoProduto = precoProduto;
	}
	public Categoria getFk_categoria() {
		return fk_categoria;
	}
	public void setFk_categoria(Categoria fk_categoria) {
		this.fk_categoria = fk_categoria;
	}
	
}
