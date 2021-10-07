package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ServicoConsumidor {

    //Lista para armazenar consumidores

    private List<Consumidor> consumidor = new ArrayList<>();

    //Método exibir tipo de consumidor

    public static List<tipoConsumidor.Tipo> mostrarTipo() {
        List<tipoConsumidor.Tipo> tipos = new ArrayList<>();

        for (tipoConsumidor.Tipo tipoReferencia : tipoConsumidor.Tipo.values()) {
            tipos.add(tipoReferencia);
        }
        return tipos;

    }

    //Método validar consumidor

    public static tipoConsumidor.Tipo validarTipo(String tipo) throws Exception {
        for (tipoConsumidor.Tipo tipoReferencia : tipoConsumidor.Tipo.values()) {
            if (tipo.equalsIgnoreCase(String.valueOf(tipoReferencia))) {
                return tipoReferencia;
            }
        }
        throw new Exception("Tipo de consumidor não encontrado ");
    }

    //Método cadastrar Consumidor

    public static Consumidor cadastrarConsumidor(String nome, String email, String tipoEscolhido) throws Exception {
        tipoConsumidor.Tipo tipo = validarTipo(tipoEscolhido);

        Consumidor consumidor = new Consumidor(nome, email, tipo);
        consumidor.add(consumidor);
        return consumidor;
    }
    //Método listar

    public static void listarConsumidor() {
        for (Consumidor consumidor : consumidores) {
            System.out.println(consumidor);
        }
    }
}




    


