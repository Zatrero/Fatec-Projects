package exercicio_350;

import java.util.Scanner;

public class Exercicio_350 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int tamv = 5;
        String[] nomes = new String[tamv];
        int i, j;
        int compare;
        String aux;

        //Informa pra q serve
        System.out.println("Ordena nomes em ordem alfabetica");

        for (i = 0; i < tamv; i++) {
            System.out.println("Entre com o nome [" + (i + 1) + "]");
            nomes[i] = teclado.next();
        }
        for (i = 0; i < tamv; i++) {
            for (j = i + 1; j <= tamv - 1; j++) {
                compare = nomes[i].compareTo(nomes[j]);
                if (compare > 0) {
                    aux = nomes[i];
                    nomes[i] = nomes[j];
                    nomes[j] = aux;
                }
            }
        }
        for (i = 0; i < tamv; i++) {
            System.out.println("["+(i+1)+ "] -" + nomes[i]);
        }

    }

}
