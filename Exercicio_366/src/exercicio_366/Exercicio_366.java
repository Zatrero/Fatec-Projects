package exercicio_366;
import java.util.Scanner;

public class Exercicio_366 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int tamv =5;
        String[] nome = new String[tamv];
        String[] profissao = new String[tamv];
        String aux;
        int i,j;
        
    //Diz oq faz
        
        
        for (i=0; i< tamv ; i++){
            for (j = i + 1; j < tamv; j++) {
                aux = nome[i];
                nome[i] = nome[j];
                
            }
        }
    }
    
}
