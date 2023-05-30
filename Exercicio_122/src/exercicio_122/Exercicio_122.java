package exercicio_122;
import java.util.Scanner;

public class Exercicio_122 {

    public static void main(String[] args) {
        // TODO code application logic here
        int l1,l2,l3;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Informa se tres lados formam um triângulo");
        
        //Entrada de dados
        
        System.out.print("Entra com o primeiro lado: ");
        l1 = teclado.nextInt();
        
        System.out.print("Entra com o segundo lado: ");
        l2 = teclado.nextInt();
        
        System.out.print("Entra com o terceiro lado: ");
        l3 = teclado.nextInt();
        
        
        //processamento / saida
        if ((l1 < l2 + l3) && (l2 < l3 + l1) && (l3 < l1 + l2)) {
            System.out.println("Esses números formam um triangulo");
        }
        else{
        System.out.println("Esses numeros não formam um triângulo");
        }
    }
    
}
