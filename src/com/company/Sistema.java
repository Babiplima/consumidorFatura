package com.company;

import java.util.List;
import java.util.Scanner;

public class Sistema {


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
    //Método menu Tipo de Consumidor

    public static void menuTipoConsumidor() {
        List<Tipo> tipos = ServicoConsumidor.mostrarTipo();
        System.out.println("Tipos disponíveis ");

        //Apresentação de tipos de consumidores disponíveis

        for (int i = 0; i < tipos.size(); i++) {
            System.out.println(tipos.get(i));
        }
    }
    //Método cadastrar consumidor

    public static Consumidor cadastrarConsumidor() throws Exception {
        String nome = capturarDados("Por favor, digite seu nome: ").nextLine();
        String email = capturarDados("Por favor, digite seu email: ").nextLine();
        menuTipoConsumidor();
        String tipo = capturarDados("Por favor, digite o tipo de consumidor, podendo ser Física ou Jurídica").nextLine();
        return ServicoConsumidor.cadastrarConsumidor(nome, email);
    }

    //Método cadastrar Fatura

    public static Fatura cadastrarFatura() throws Exception {
        String email = capturarDados("Digite o email do consumidor: ").nextLine();
        double valor = capturarDados("Digite o valor da fatura: ").nextDouble();
        String dataDeVencimento = capturarDados("Digite a data de vencimento: ").nextLine();
        return ServicoFatura.cadastrarFatura(email, valor, dataDeVencimento);
    }

        //Método pesquisar fatura


        public static List<Fatura> pesquisarFatura()throws Exception{
            String email1 = capturarDados("Digite o email do consumidor: ").nextLine();
            ServicoConsumidor.validarEmail(email1);
            List<Fatura> faturas = ServicoFatura.pesquisarFaturaPeloEmailConsumidor(email1);
            return faturas;
        }
    }

