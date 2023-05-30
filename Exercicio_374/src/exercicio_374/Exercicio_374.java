package exercicio_374;
import java.util.Scanner;

public class Exercicio_374 {

    public static void main(String[] args) {
        Scanner teclado  = new Scanner(System.in);
        int tamv = 5;
        double[] A = new double[tamv];
        double[] B = new double[tamv];
        int i;
        
        //Diz oq faz o programa
        System.out.println("Le 20 numeros de A e exibe o quadrado deles em B");
        
        //Entrada de dados
        
        for (i = 0; i < tamv; i++) {
            System.out.print("Entre com o "+ (i+1) + "º valor de A: ");
            A[i] = teclado.nextInt();           
        }
                
        //Processamento 
        
        for (i = 0; i < tamv; i++) {
            B[i]= Math.pow(A[i], 2);
        }
        
        //Saida
        
        System.out.println("Os valores de A ao quadrado são respectivamente:");
        
        for (i = 0; i < tamv; i++) {
            System.out.println((i+1) + "º: "+A[i]+"² = " + B[i]  );
        }
    }
    
}
