package com.company;

public class Main {

    public static void main(String[] args) {
    Consumidor consumidor = new Consumidor("Athos","athos@athos");
    Fatura fatura = new Fatura(1500,8,consumidor);
        System.out.println(fatura);
    }
}
