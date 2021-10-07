package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sistema {

    //Lista responsável por receber consumidores

    private List<Consumidor> consumidor = new ArrayList<>();

    // Método captar dados

    public static Scanner capturarDados(String mensagem) {
        System.out.println(mensagem);
        return new Scanner(System.in);
    }

    //Menu

    public static void menu() {
        System.out.println("\n======Bem vindo ao seu PobreCred======");
        System.out.println("\nDigite 1 - para cadastrar um consumidor.");
        System.out.println("\nDigite 2 - para cadastrar uma fatura.");
        System.out.println("\nDigite 3 - para sair.");


    }
}
