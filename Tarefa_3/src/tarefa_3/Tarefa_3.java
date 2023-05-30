package tarefa_3;
import java.util.Scanner;

public class Tarefa_3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int tamv= 20;
        int[] num = new int[tamv];
        int maior, menor, count0, count57, i;
        
        //Diz o que o programa faz
        System.out.println("Lê 20 numeros, mostra o maior e o menor, os multiplos de 5 e 7 e conta quantos numeros são iguais a 0");
        
        //Entrada de dados 
        for (i = 0; i < tamv; i++) {
            System.out.print("Entre com o " +(i+1)+ "º numero: ");
            num[i] = teclado.nextInt();
        }
        
        //Processamento
        maior = 0;
        menor = num[0];
        count0 = 0;
        count57 = 0;
        for (i = 0; i < tamv; i++) {
            if (num[i] > maior) {
                maior = num[i];
            }
            if (num[i] < menor) {
                menor = num[i];
            }
            if (num[i] == 0) {
                count0 ++;
            }
            else{
                if (num[i] %7 == 0 & num[i] %5 == 0) {
                    count57 ++;
                }
            }
        }
        
        //Saida de dados
        System.out.println("");
        System.out.println("================================================");
        System.out.println("O maior numero é: " + maior);
        System.out.println("O menor numero é: " + menor);
        System.out.println("Há " + count57 + " numeros divisíveis por 5 e 7");
        System.out.println("Dentre os numeros digitados " + count0 + " deles são 0");
    }
    
}
