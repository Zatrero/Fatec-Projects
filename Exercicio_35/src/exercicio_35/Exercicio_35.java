package exercicio_35;
import java.util.Scanner;


/**
 *
 * @author Lucas Neves GTI
 */
public class Exercicio_35 {
    public static void main(String[] args) {
        String nome;
        String end;
        String tel;
        
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Exibe o nome, endereço e telefone");
        System.out.println("Digite o nome: ");
        nome = ler.nextLine();
        
        System.out.println("Digite o endereço: ");
        end = ler.nextLine();
        
        System.out.println("Digite o telefone: ");
        tel = ler.nextLine();
        
        System.out.println("Nome: " + nome);
        
        System.out.println("Endereço: " + end);
        
        System.out.println("Telefone: " + tel);
        
    }
    
}
