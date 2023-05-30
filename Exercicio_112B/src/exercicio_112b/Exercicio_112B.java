package exercicio_112b;
import java.util.Scanner;

public class Exercicio_112B {

    
    public static void main(String[] args) {
        // TODO code application logic 
        int n1;
        int n2;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Mostra o maior de dois numeros");
        
        //Entrada de dados
        System.out.println("Entre com o primeiro número: ");
        n1 = teclado.nextInt();
        
        System.out.println("Entre com o segundo número: ");
        n2 = teclado.nextInt();
        
        //Processamento e saida
        if (n1 > n2) {
            System.out.println("O numero " + n1 + " é maior que o numero " + n2);
        }
        else{
            if (n2 > n1) {
                System.out.println("O número" + n2 + "é maior que o número " + n1);
            }
            else{
            System.out.println("Os numeros são iguais");
            }
        }
        
    }
    
}
