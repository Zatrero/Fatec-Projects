package exercicio_125;
import java.util.Scanner;

public class Exercicio_125 {
    public static void main(String[] args) {
        // TODO code application logic here
        int idade;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Vê a idade da pessoa e diz se é maior de idade ou idoso");
        
        // Entrada de dados
        
        System.out.print("Entre com a idade: ");
        idade = teclado.nextInt();
        
        //Processamento e saida
        if (idade >= 18) {
            System.out.println("Essa pessoa é maior de idade");
        }
        else{
        System.out.println("Essa pessoa não é maior de idade");
        }
        
        if (idade >= 65) {
            System.out.println("Essa pessoa é um idoso");
        }
        else{
        System.out.println("Essa pessoa não é um idoso");
        }
    }
    
}
