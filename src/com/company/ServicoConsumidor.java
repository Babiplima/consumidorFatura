package com.company;

import java.util.Scanner;

public class ServicoConsumidor {

    //Método receber dados para cadastrar

    public static Scanner capturarDados(String mensagem) {
        System.out.println(mensagem);
        return new Scanner(System.in);
    }

    //Método cadastrar consumidor

    public static Consumidor cadastrarConsumidor(){
        String nome = capturarDados( "Por favor, digite seu nome: " ).nextLine();
        String email = capturarDados("Por favor, digite seu email: ").nextLine();
    }
}
