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

    public Fatura(int valor, int vencimento, Consumidor consumidor) {
        this.valor = valor;
        this.vencimento = vencimento;
        this.consumidor = consumidor;
    }

    //Métodos Getters e Setters

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getVencimento() {
        return vencimento;
    }

    public void setVencimento(int vencimento) {
        this.vencimento = vencimento;
    }

    public Consumidor getConsumidor() {
        return consumidor;
    }

    public void setConsumidor(Consumidor consumidor) {
        this.consumidor = consumidor;
    }

    //Método To String


    @Override
    public String toString() {
        StringBuilder exibir = new StringBuilder();
        exibir.append(super.toString());
        exibir.append("\n =============================== ");
        exibir.append (consumidor);
        exibir.append("\n O Valor da sua fatura é "+valor);
        exibir.append(("\n O vancimento da sua fatura é em "+ vencimento));
        exibir.append("\n =============================== ");
        return exibir.toString();
    }
}
