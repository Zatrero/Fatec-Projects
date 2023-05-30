package exercicio_359;

import java.util.Scanner;

public class Exercicio_359 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int tamv = 3;
        int i;
        String[] nome = new String[tamv];
        String[] result = new String[tamv];
        int[] idade = new int[tamv];

        System.out.println("Para 10 nomes, seleciona os entre o intervalor de L até S");
// entrada de dados
        for (i = 0; i < tamv; i++) {
            System.out.print("Entre com o nome[" + (i + 1) + "]");
            nome[i] = teclado.next().toUpperCase();
            System.out.print("Entre com a idade de " + nome[i] + ": ");
            idade[i] = teclado.nextInt();
        }
//processamento
        // processmaneto
        for (i = 0; i < tamv; i++) {
            result[i] = "";
        }
        for (i = 0; i < tamv; i++) {
            if ((nome[i].charAt(0) >= 'L') && (nome[i].charAt(0) <= 'S')) {
                result[i] = nome[i];
            }
        }

        // saida 
        for (i = 0; i < tamv; i++) {
             if (!result[i].equals("")) {
                System.out.print("Nomes entre L e S: " + result[i]);
                System.out.println(" idade = " + idade[i]);
            }
        }

    }
}
