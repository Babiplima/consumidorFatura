package com.company;

import com.company.Consumidor;

public class Fatura {

    //Atributos

    private double valor;
    private String dataVencimento;
    Consumidor consumidor;

    //Métodos construtores


    public Fatura() {
    }

    public Fatura(double valor, String dataVencimento, Consumidor consumidor) {
        this.valor = valor;
        this.dataVencimento = dataVencimento;
        this.consumidor = consumidor;
    }

    //Métodos Getters e Setters

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
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
        exibir.append("\n=================================");
        exibir.append("\n===Informações da fatura do cartão CredPobre===");
        exibir.append("\n=================================");
        exibir.append("\n =============================== ");
        exibir.append ("\n Consumidor: "+consumidor);
        exibir.append("\n O Valor da sua fatura é R$  "+valor);
        exibir.append(("\n O vencimento da sua fatura é dia "+ dataVencimento));
        exibir.append("\n =============================== ");
        return exibir.toString();
    }
}
