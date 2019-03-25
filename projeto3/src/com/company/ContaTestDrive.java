package com.company;

public class ContaTestDrive {
    public static void main(String[] args){
        Conta c1 = new Conta(0,"All Might");
        c1.deposita(1000);
        c1.sacar(300);
        System.out.println("Saldo: "+ c1.getSaldo());

        Conta c2 = new Conta(1,199,"Naruto");
        Conta c3 = new Conta(2,-999,"Sasuke");

        System.out.println("Saldo: "+ c2.getSaldo());
        System.out.println("Saldo: "+ c3.getSaldo());

    }
}
