package exercicio_115;
import java.util.Scanner;

public class Exercicio_115 {
    public static void main(String[] args) {
        // TODO code application logic here
        double n;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Mostra a raiz quadrada e o quadrado de um numero");
        
        //Entrada de dados
        System.out.print("Entre com um número: ");
        n = teclado.nextDouble();
        
        //Processamento e saida
        System.out.println("O quadrado de " + n + " = " + Math.pow(n, 2));
        System.out.println("O quadrado de " + n + " = " + Math.sqrt(n));
    }
    
}
