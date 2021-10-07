package com.company;

public class Consumidor {

   //Atributos
    private String nome;
    private String email;

    //Met Construtores

    public Consumidor(){

    }
    public Consumidor(String nome, String email) {
        this.nome = nome;
        this.email = email;
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

    //Método To String


    @Override
    public String toString() {
        StringBuilder exibir = new StringBuilder();
        exibir.append(super.toString());
        exibir.append("\n =============================== ");
        exibir.append("\n Nome "+nome);
        exibir.append(("\n E-mail "+ email));
        exibir.append("\n =============================== ");
        return exibir.toString();
    }
}
