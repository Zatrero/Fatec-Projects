package algoritmo_334;
import java.util.Scanner;

public class Algoritmo_334 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double gordo;
        double magro;
        double peso;
        int idg;
        int idm;
        int id;
                
        //Diz o que o programa faz
        System.out.println("Impre o peso e o id do boi mais gordo e do mais magro");
        
        //Entrada
        id = 1;
        magro = 100000;
        gordo = 0;
        idg = 0;
        idm = 0;
        while(id > 0){
            System.out.print("Entre com a identificação do boi");
            id = teclado.nextInt();
            System.out.print("Entre com o peso do boi");
            peso = teclado.nextDouble();
            
            //Processamento
            if (peso > gordo) {
                gordo = peso;
                idg = id;
            }
            if (peso < magro) {
                magro = peso;
                idm = id;
            }
        }
        
        //Saida
        
            System.out.println("Boi mais gordo ID: " + idg + " Peso " + gordo);
            System.out.println("Boi mais magro ID: " + idm + " Peso " + magro );
        
    }
    
}
