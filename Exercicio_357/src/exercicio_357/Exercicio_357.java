package exercicio_357;

import java.util.Scanner;

public class Exercicio_357 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        String aux;
        int i, j;
        int tamv = 3;
        String[] nomes = new String[tamv];
        double[] sal = new double[tamv];
        double[] salnovo = new double[tamv];
        double sup;
        int compare,solicitacao;

        //Diz oq o sistema faz   
        System.out.println("Grava 10 salarios e reajusta com 10% e depois pode se pesquisar fazer uma busca por ordem de nome ou salario");

        // Entrada de dados
        for (i = 0; i < tamv; i++) {
            System.out.print("Digite um nome: ");
            nomes[i] = teclado.next().toUpperCase();

            System.out.print("Informe o salário atual de " + nomes[i] + " : ");
            sal[i] = teclado.nextDouble();

        }

        //Solicitação dos dados
        System.out.println("Dados inseridos");
        System.out.println("Houve um aumento de 10% em tos os salarios");
        System.out.println("Por favor digite em que ordem que ver os resultados [1]alfabetica ou [2]salarial");
        solicitacao = teclado.nextInt();

        //Processamento
        for (j = i + 1; j < tamv ; j++) {
            salnovo[i] = sal[i] * 0.10;
        }

        if (solicitacao == 1) {
            for (i = tamv; i < tamv; i++) {
                for (j = i + 1; j <= tamv - 1; j++) {
                    compare = nomes[i].compareTo(nomes[j]);
                    if (compare > 0) {
                        aux = nomes[i];
                        nomes[i] = nomes[j];
                        nomes[j] = aux;
                    }
                }
                for (i = 0; i < tamv; i++) {
                    System.out.println("Funcionario: " + nomes[i] + " Salario Antigo: " + sal[i] + " Salario atual: " + salnovo[i]);
                }
            }
        } else {
            if (solicitacao == 2) {
                for (j = i + 1; j < tamv - 1; j++) {
                    if (salnovo[i] > salnovo[j]) {
                        sup = salnovo[i];
                        salnovo[i] = salnovo[j];
                        salnovo[j] = sup;
                    }
                    for (i = 0; i < tamv; i++) {
                        System.out.println("Funcionario: " + nomes[i] + " Salario Antigo: " + sal[i] + " Salario atual: " + salnovo[i]);
                    }
                }
            }
        }

    }

}
