package exercicio_375;
import java.util.Scanner;

public class Exercicio_375 {

    public static void main(String[] args) {
        Scanner teclado  = new Scanner(System.in);
        int tamv = 5;
        int[] A = new int[tamv];
        int[] B = new int[tamv];
        int[] Result = new int[tamv];
        int i;
        
        //Diz oq faz o programa
        System.out.println("Le 20 numeros de A e B e calcula a diferenca entre eles");
        
        //Entrada de dados
        
        for (i = 0; i < tamv; i++) {
            System.out.print("Entre com o "+ (i+1) + "º valor de A: ");
            A[i] = teclado.nextInt();           
        }
        
        for (i = 0; i < tamv; i++) {
            System.out.print("Entre com o "+ (i+1) + "º valor de B: ");
            B[i] = teclado.nextInt();           
        }
        
        //Processamento 
        
        for (i = 0; i < tamv; i++) {
            Result[i]= A[i] - B[i];
        }
        
        //Saida
        
        System.out.println("A diferença entre os valores dos vetores A e B são:");
        
        for (i = 0; i < tamv; i++) {
            System.out.println((i+1) + "º: "+A[i]+" - " +B[i]+ " = " + Result[i] );
        }
    }
    
}
