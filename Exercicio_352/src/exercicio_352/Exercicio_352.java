package exercicio_352;
import java.util.Scanner;

public class Exercicio_352 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int tamv = 5;
        String[] nomes = new String[tamv];
        int i;
        int pos, compare;
        String nomeok;
        
        //Diz para que serve o programa
        System.out.println("Armazena 5 nomes que podem ser procurados");
        //entrada
        for (i = 0; i < tamv; i++) {
            System.out.print("Entre com o nome:[" + (i + 1) + "]");
            nomes[i] = teclado.next().toUpperCase();
        }
        
        // processamento
        System.out.print("entre com um nome para pesquisar no vetor: ");
        nomeok = teclado.next().toUpperCase();
        pos = 0;
        for (i = 0; i < tamv; i++) {
            compare = nomes[i].compareTo(nomeok);
            if (compare == 0) {
                nomeok = nomes[i];
                pos = i;
            }
        }
        
        //sida
        System.out.println("O nome "+ nomeok + " esta no vetor e na posição " + pos + 1 );
    }
    
}
