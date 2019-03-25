package com.company;

public class Produto {
    private double preco;
    private int id;
    private String nome;

    public Produto(double preco, int id, String nome) {
        this.preco = preco;
        this.id = id;
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }
}