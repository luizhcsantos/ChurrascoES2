/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.churrasco.UI.Classes;

/**
 *
 * @author Microsoft
 */
public class Produto {
    private String nomeProduto;
    private String categoria;
    private float preco;
    private int quantidadeComprar;

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public void setQuantidadeComprar(int quantidadeComprar) {
        this.quantidadeComprar = quantidadeComprar;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public String getCategoria() {
        return categoria;
    }

    public float getPreco() {
        return preco;
    }

    public int getQuantidadeComprar() {
        return quantidadeComprar;
    }
    
    public void atualizarQuantidade(int novaQuantidade) {
        quantidadeComprar = novaQuantidade;
    }
    public float calcularValorTotal() { return preco*quantidadeComprar; }
}
