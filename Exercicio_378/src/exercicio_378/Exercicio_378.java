package exercicio_378;

import java.util.Scanner;

public class Exercicio_378 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int tamv;
        tamv = 10;
        int[] num = new int[tamv];
        int i, j, count;

        //Diz o que o programa faz
        System.out.println(" Entrar com varios numeros ate digitar o numero 0 (zero). Imprimir quantos  numeros sao iguais ao ultimo numero foram lidos. o limite de numeros e 100. ");

        //Entrada de dados
        count = 0;
        for (i = 0; i < tamv; i++) {
            System.out.print("Entre com o " + (i + 1) + "º número: ");
            num[i] = teclado.nextInt();

            if (num[i] == 0) {
                tamv = i;
            }
        }

        //Processamento
        if (tamv == 100) {
            for (j = 0; j < i; j++) {
                if (num[j] == num[99]) {
                    count++;
                }
            }
        } 
        else {
            for (j = 0; j < i; j++) {
                if (num[j] == num[i - 2]) {
                    count++;
                }
            }
        }
        //saida
        System.out.println("Foram digitados " + (i) + " numeros e foram encontrados " + count + " numeros iguais ao ultimo numero não nulo digitado numero digitado");
    }

}
