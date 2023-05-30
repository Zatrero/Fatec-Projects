package exercicio_39;
import java.util.Scanner;

/**
 *
 * @author Lucas Neves GTI
 */
public class Exercicio_39 {
    public static void main(String[] args) {
        double a;
        double b;
        double r;
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Calcula a média de 2 numeros");
        System.out.println("Digite o primeiro numero: ");
        a = ler.nextDouble();
        
        System.out.println("Digite o segundo numero: ");
        b = ler.nextDouble();
        
        r = ( a + b)/2;
        
        System.out.println("Média: " + r);
    }
    
}
