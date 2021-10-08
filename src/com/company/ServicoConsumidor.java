package com.company;

import java.util.ArrayList;
import java.util.List;

public class ServicoConsumidor {

    //Lista para armazenar consumidores

    private static List<Consumidor> consumidores = new ArrayList<>();


    // Validar o email (Verificar se tem o @)
    // verificar se o email existe (Correr a lista)
    public static void validarEmail(String email) throws Exception{
        if (!email.contains("@")){
            throw new Exception("E-mail inválido. ");
        }
    }

    // verificar se o email existe (Correr a lista)
    public static void verificarSeOEmailExiste(String email) throws Exception{
        for (Consumidor consumidorReferencia : consumidores) {
            if (consumidorReferencia.getEmail().equals(email)){
                throw new Exception("Este e-mail já está cadastrado. ");
            }
        }
    }

    //Método exibir tipo de consumidor

    public static List<Tipo> mostrarTipo() {
        List<Tipo> tipos = new ArrayList<>();

        for (Tipo tipoReferencia : Tipo.values()) {
            tipos.add(tipoReferencia);
        }
        return tipos;

    }

    //Método validar consumidor

    public static Tipo validarTipo(String tipo) throws Exception {
        for (Tipo tipoReferencia : Tipo.values()) {
            if (tipo.equalsIgnoreCase(String.valueOf(tipoReferencia))) {
                return tipoReferencia;
            }
        }
        throw new Exception("Tipo de consumidor não encontrado ");
    }

    //Pesquisar consumidor por email

    public static Consumidor pesquisarConsumidorPorEmail(String email) throws Exception{
        for (Consumidor consumidorReferencia: consumidores) {
            if (consumidorReferencia.getEmail().equals(email)){
                return consumidorReferencia;
            }
        }
        throw new Exception("Consumidor não cadastrado no sistema. ");
    }

    //Método cadastrar Consumidor

    public static Consumidor cadastrarConsumidor(String nome, String email) throws Exception {


        Consumidor consumidor = new Consumidor(nome, email);
        consumidores.add(consumidor);
        return consumidor;
    }
    //Método listar

    public static void listarConsumidor() {
        for (Consumidor consumidor : consumidores) {
            System.out.println(consumidor);
        }


    }
}




    


