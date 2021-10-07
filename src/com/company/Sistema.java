package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sistema {

    //Lista responsável por receber consumidores

    private List<Consumidor> consumidor = new ArrayList<>();

    // Método captar dados

    public static Scanner capturarDados(String mensagem){
        System.out.println(mensagem);
        return new Scanner(System.in);
    }

}
