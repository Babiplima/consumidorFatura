package com.company;

public class Main {

    public static void main(String[] args) {
    Consumidor consumidor = new Consumidor("Athos","athos@athos");
    Fatura fatura = new Fatura(1000,10);
        System.out.println(consumidor);
        System.out.println(fatura);
    }
}
