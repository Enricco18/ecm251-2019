package com.company;

public class Compra {

    private int id;
    private Cliente cliente;
    private Produto produto;

    public Compra(int id, Cliente cliente, Produto produto){
        this.id = id;
        this.cliente = cliente;
        this.produto = produto;
    }

    public String pegarDetalhes(){
        return " ID: " + id + " \n Nome: " + cliente.getNome() + "\n Produto:" + produto.getNome();
    }
}