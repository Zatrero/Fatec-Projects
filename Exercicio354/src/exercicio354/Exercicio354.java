package exercicio354;
import java.util.Scanner;

public class Exercicio354 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int tamv = 15;
        int[] num = new int[tamv];
        int i, j;
        int aux;
        
//informa oq o programa faz
        System.out.println("armazena 15 numeros em ordem e diz se são impares ou pares");
        
//entrada
        for (i = 0; i < tamv; i++) {
            System.out.print("Entre com o numero:[" + (i + 1) + "]");
            num[i] = teclado.nextInt();
        }
        
        
//processamento
        for (i = 0; i < tamv-1; i++) {
            for (j = i + 1; j < tamv -1; j++) {
                if (num[i] > num[j]) {
                    aux=num[i];
                    num[i] = num[j];
                    num[j] = aux;
                }
            }
        }
        
        
//saida
        for (i = 0; i < tamv; i++) {
            System.out.print("O numero "+ num[i] + " é ");
            if (num[i] % 2 == 0) {
                System.out.print("par");
                 System.out.println("");
            }
            else{
                System.out.print("impar");
                System.out.println("");
            }
        }
    }
    
}
