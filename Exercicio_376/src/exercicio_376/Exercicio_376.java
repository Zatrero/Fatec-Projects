package exercicio_376;
import java.util.Scanner;
public class Exercicio_376 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int tamv = 5;
        double[] A = new double[tamv];
        double[] B = new double[tamv];
        double[] Result = new double[tamv];
        int i;
        
    //Entrada
        
        for (i = 0; i < tamv; i++) {
            System.out.print("Entre com o "+ (i+1) + "º valor de A: ");
            A[i] = teclado.nextInt();           
        }
       
    //Processamento
        for (i = 0; i < tamv; i++) {
            if (i %2 == 0) {
                B[i]= A[i]*3;
            }
            else{
                B[i]= A[i]/2;
            }
        }
    //Saida
        System.out.println("Seguindo a regra posição impar * 2 e par /3 os resultados são");
        for (i = 0; i < tamv; i++) {
            System.out.println((i+1)+"º = " + B[i]);
        }
    }
    
    
    
    
}
