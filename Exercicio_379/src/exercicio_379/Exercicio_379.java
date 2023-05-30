package exercicio_379;
import java.util.Scanner;

public class Exercicio_379 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int tamv = 20;
        int[] num = new int[tamv];
        int i,j, cont1, cont2, cont3;
        double media;
        
     //Diz oq o programa faz
        System.out.println("Entra com 20 numeros e conta os numeros iguais a 30 maiores e iguais a média");
        
        cont1 = 0;
        cont2 = 0;
        cont3 = 0;
        media = 0;
        for (i = 0; i < tamv; i++) {
            System.out.print("Entre com o "+ (i+1) +"º número: ");
            num[i] = teclado.nextInt();
            media = media + num[i];
        }
        
        media = media/tamv;
        
        for (j = 0; j < i; j++) {
            if (num[j]== 30) {
                cont1++;
            }
            if (num[j] > media) {
                cont2++;
            }
            if (num[j] == media) {
                cont3++;
            }
        }
        System.out.println("===========================================================");
        System.out.println("Existem " + cont1 + " numeros iguais a 30");
        System.out.println("Existem " + cont2 + " numeros maiores que a media");
        System.out.println("Existem " + cont3 + " numeros iguais a media");
    }
    
}
