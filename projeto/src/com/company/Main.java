package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Cliente cliente = new Cliente("Pedro");
        Produto produto = new Produto(0,4,"Coxinha");
        Compra compra = new Compra(1,cliente,produto);

        System.out.println(compra.pegarDetalhes());

        Compra compra2 = new Compra(1,cliente,produto);

    }
}
