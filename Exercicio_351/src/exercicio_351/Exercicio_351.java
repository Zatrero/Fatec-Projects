package exercicio_351;

import java.util.Scanner;

public class Exercicio_351 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int tamv = 5;
        String[] nomes = new String[tamv];
        int i, j;
        int compare, pos;
        String aux;

        //Informa pra q serve
        System.out.println("Insere nomes dps busca indicando a posição");

        //Entrada
        for (i = 0; i < tamv; i++) {
            System.out.print("Entre com o nome:[" + (i + 1) + "] ");
            nomes[i] = teclado.next().toUpperCase();
        }

        System.out.println("Escolha uma das " + tamv + " posições:");
        pos = teclado.nextInt();

//Processamento e saida
        if ((pos >= 1) && (pos < tamv)) {
            System.out.println("Na posiçãos " + pos + " nome " + nomes[pos - 1]);
        } else {
            System.out.println("A posição" + pos + "não consta no vetor de 0 até" + tamv);
        }
    }

}
