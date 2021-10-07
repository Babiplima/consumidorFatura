package com.company;

public class Consumidor {

   //Atributos
    private String nome;
    private String email;
    private tipoConsumidor.Tipo tipo;

    //Met Construtores

    public Consumidor(){

    }
    public Consumidor(String nome, String email, tipoConsumidor.Tipo tipo) {
        this.nome = nome;
        this.email = email;
        this.tipo = tipo;
    }
    //Métodos Getters e Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public tipoConsumidor.Tipo getTipo() {
        return tipo;
    }

    public void setTipo(tipoConsumidor.Tipo tipo) {
        this.tipo = tipo;
    }


    //Método To String


    @Override
    public String toString() {
        StringBuilder exibir = new StringBuilder();
        exibir.append(super.toString());
        exibir.append("\n =============================== ");
        exibir.append("\n Nome "+nome);
        exibir.append(("\n E-mail "+ email));
        exibir.append("\n Tipo de consumidor: " + tipo);
        exibir.append("\n =============================== ");
        return exibir.toString();
    }
}
