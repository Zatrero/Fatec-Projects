package exercicio_383;

import java.util.Scanner;

public class Exercicio_383 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int tamv = 10;
        int[] num = new int[tamv];
        int[] res = new int[tamv];
        int i, j;

        //Diz o que o programa faz
        System.out.println("Lê 20 numeros em um vetor e inverte as posições");

        //Entrada de dados
        for (i = 0; i < tamv; i++) {
            System.out.print("Entre com o " + (i + 1) + "º numero: ");
            num[i] = teclado.nextInt();
        }

        //Processamento
        j = 0;
        for (i = tamv - 1; i > -1; i = i - 1) {
            res[j] = num[i];
            j++;
        }
        //Saida
        System.out.println("");
        System.out.println("================================================");
        System.out.println("A resultado a inversão das posições do vetor é");
        for (i = 0; i < tamv; i++) {
            System.out.print(res[i]+", ");
        }
    }

}
