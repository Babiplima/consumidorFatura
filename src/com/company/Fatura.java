package com.company;

import com.company.Consumidor;

public class Fatura {

    //Atributos

    private double valor;
    private int vencimento;
    Consumidor consumidor;

    //Métodos construtores


    public Fatura() {
    }

    public Fatura(double valor, int vencimento, Consumidor consumidor) {
        this.valor = valor;
        this.vencimento = vencimento;
        this.consumidor = consumidor;
    }

    //Métodos Getters e Setters

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
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
        exibir.append("\n O Valor da sua fatura é R$  "+valor);
        exibir.append(("\n O vencimento da sua fatura é dia "+ vencimento));
        exibir.append("\n =============================== ");
        return exibir.toString();
    }
}
