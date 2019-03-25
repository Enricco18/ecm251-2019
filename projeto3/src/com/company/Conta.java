package com.company;

public class Conta {
    int numero;
    private double saldo;
    String nome;


    public Conta(int numero, String nome) {
        this.numero = numero;
        this.saldo = 0;
        this.nome = nome;
    }

    public Conta(int numero, double saldo, String nome) {
        this.numero = numero;
        deposita(saldo);
        this.nome = nome;
    }

    void sacar(double valor){
        if(saldo>=valor && valor>0)
            saldo =saldo -valor;

    }
    void deposita(double valor){
        if(valor>0)
            saldo += valor;
    }
    double getSaldo(){
        return saldo;
    }
    public String getNome() {
        return nome;
    }
}
