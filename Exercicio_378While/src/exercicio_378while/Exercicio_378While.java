package exercicio_378while;

import java.util.Scanner;

public class Exercicio_378While {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int tamv;
        tamv = 100;
        int[] num = new int[tamv];
        int i, j, count;
        int result;
        boolean continuar = true;

        //Diz o que o programa faz
        System.out.println(" Entrar com varios numeros ate digitar o numero 0 (zero). Imprimir quantos  numeros sao iguais ao ultimo numero foram lidos. o limite de numeros e 100. ");

        //Entrada de dados
        i = 0;
       
        while(continuar = true){
         i++;
         System.out.print("Entre com o " + (i + 1) + "º número: ");
         num[i] = teclado.nextInt();
         if (num[i] == 0) {
                continuar = false;
         }
        }
        /*do {
            i = 0; i < tamv; i++;
            System.out.print("Entre com o " + (i + 1) + "º número: ");
            i++;
            num[i] = teclado.nextInt();
            i++;
            if (num[i] == 0) {
                continuar = false;
            }

        } while (continuar);*/

        tamv = i;

        count = 0;

        for (j = 0; j < tamv; j++) {
            if (num[j] == num[i - 1]) {
                count = count++;
            }
        }
        //saida
        System.out.println("Foram digitados " + (i) + " numeros e foram encontrados " + count + " numeros iguais ao numero digitado antes de 0");
    }

}
