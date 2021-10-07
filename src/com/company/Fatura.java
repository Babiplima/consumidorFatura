package com.company;

import com.company.Consumidor;

public class Fatura {

    //Atributos

    private double valor;
    private double vencimento;
    Consumidor consumidor;

    //Métodos construtores


    public Fatura() {
    }

    public Fatura(double valor, double vencimento, Consumidor consumidor) {
        this.valor = valor;
        this.vencimento = vencimento;
        this.consumidor = consumidor;
    }
}
