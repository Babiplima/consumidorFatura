package com.company;

public class Main {

    public static void main(String[] args) {
        try{

            // Sistema Executar

            Sistema.cadastrarConsumidor();
            Sistema.cadastrarFatura();
            System.out.println(Sistema.pesquisarFatura());
        }catch(Exception erro){
            System.out.println(erro.getMessage());
        }

    }

}
