package exercicio_112;
import java.util.Scanner;

/**
 *
 * @author Shadow
 */
public class Exercicio_112 {
    public static void main(String[] args) {
        
        double n1;
        double n2;
        double n3;
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Lê 3 números e verifica se eles podem formar um triângulo");
        System.out.println("Digite o primeiro numero: ");
        n1 = ler.nextDouble();
        System.out.println("Digite o segundo número: ");
        n2 = ler.nextDouble();
        System.out.println("Digite o terceiro número: ");
        n3 = ler.nextDouble();
        
        if (n1 < n2 + n3 & n2 < n1 + n3 & n3< n1 + n2) {
            
            System.out.println("Os numeros formam um triângulo");
        }
        else{
        
            System.out.println("Os numeros não formam um triângulo");
        }
        
    
    }
    
}
