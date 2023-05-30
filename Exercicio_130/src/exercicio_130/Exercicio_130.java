package exercicio_130;
import java.util.Scanner;

public class Exercicio_130 {

    public static void main(String[] args) {
        // TODO code application logic here
        double valor;
        String produto;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Mostra o valor de venda de um produto");
        
        //Entrada de dados
        System.out.print("Insira o nome do produto: ");
        produto = teclado.next();
        System.out.print("Insira o valor do produto: ");
        valor = teclado.nextDouble();
        
        //Processamento/ saida
        if (valor < 20.00) {
            System.out.print("O " + produto + " tem valor de venda = R$" + valor * 1.45);
        }
        else{
         System.out.print("O " + produto + " tem valor de venda = R$" + valor * 1.30);
        }
    }
    
}
