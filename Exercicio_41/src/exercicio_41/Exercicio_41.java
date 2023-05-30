package exercicio_41;
import java.util.Scanner;

/**
 *
 * @author Lucas Neves GTI
 */
public class Exercicio_41 {
    public static void main(String[] args) {
        double a;
        double b;
        double c;
        double d;
        double r;
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Calcula a média ponderada entre 4 numeros");
        System.out.println("Os pesos respectivos são 1,2,3 e 4");
         
        System.out.println("Digite o primeiro numero: ");
         a = ler.nextDouble();
         
        System.out.println("Digite o segundo numero: ");
         b = ler.nextDouble();
         
        System.out.println("Digite o terceiro numero: ");
         c = ler.nextDouble();
         
        System.out.println("Digite o primeiro numero: ");
         d = ler.nextDouble();
         
        r = (a * 0.1 + b * 0.2 + c * 0.3 + d * 0.4)/4;
         
        System.out.println("A média ponderada é : " + r);
    }
    
}
