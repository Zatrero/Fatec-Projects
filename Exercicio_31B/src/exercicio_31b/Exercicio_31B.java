package exercicio_31b;
import java.util.Scanner;

/**
 *
 * @author Lucas Neves GTI
 */
public class Exercicio_31B {
    public static void main(String[] args) {
        double a;
        double b;
        double c;
        
        double r;
        
        System.out.println("Calcule a média entre 3 numeros");
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite o primeiro numero: ");
        a = ler.nextDouble();
        
        System.out.println("Digite o segundo numero: ");
        b = ler.nextDouble();
        
        System.out.println("Digite o terceiro numero: ");
        c = ler.nextDouble();
        
        r = (a + b + c) /3;
        
        System.out.println("A média é: " + r);
    }
    
}
