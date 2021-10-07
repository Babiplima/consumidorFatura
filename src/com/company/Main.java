package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        try{
            Sistema.cadastrarConsumidor();
            Sistema.cadastrarConsumidor();
            ServicoConsumidor.listarConsumidor();
        }catch(Exception erro){
            System.out.println(erro.getMessage());
        }

    }

}
