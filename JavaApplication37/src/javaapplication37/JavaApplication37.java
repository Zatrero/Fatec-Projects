package javaapplication37;

import java.util.Scanner;

public class JavaApplication37 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int tamv = 30;
        String[] nome = new String[tamv];
        String[] endereco = new String[tamv];
        String[] numero = new String[tamv];
        int i;
        int pos, compare;
        String nomeok;

        //Diz o que o programa faz 
        System.out.println("Coleta os dados de 30 pessoas e busca pelo nome");

        //Entrada de dados
        for (i = 0; i < tamv; i++) {

            System.out.println("");
            System.out.print("Entre com o " + (i + 1) + "º nome: ");
            nome[i] = teclado.nextLine().toUpperCase();

            System.out.print("Entre com o Endereço: ");
            endereco[i] = teclado.nextLine().toUpperCase();

            System.out.print("Entre com o telefone (Apenas numeros): ");
            numero[i] = teclado.nextLine();

        }

        //Busca
        System.out.println("");
        System.out.print("Ok Dados Cadastrados");

        System.out.println("");
        System.out.print("Digite um nome para a busca: ");
        nomeok = teclado.nextLine().toUpperCase();
        pos = 0;
        for (i = 0; i < tamv; i++) {
            compare = nome[i].compareTo(nomeok);
            if (compare == 0) {
                nomeok = nome[i];
                pos = i;
            }
        }

        //Saida de dados
        System.out.println("================================");
        System.out.println("");
        System.out.println("Nome: " + nome[pos]);
        System.out.println("Endereço: " + endereco[pos]);
        System.out.println("Telefone: " + numero[pos]);
    }

}
