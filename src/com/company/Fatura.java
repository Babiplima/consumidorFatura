package com.company;

import com.company.Consumidor;

public class Fatura {

    //Atributos

    private int valor;
    private int vencimento;
    Consumidor consumidor;

    //Métodos construtores


    public Fatura(int i, int i1) {
    }

    public Fatura(double valor, double vencimento, Consumidor consumidor) {
        this.valor = valor;
        this.vencimento = vencimento;
        this.consumidor = consumidor;
    }
}
