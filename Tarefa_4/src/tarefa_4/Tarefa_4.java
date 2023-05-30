package tarefa_4;
import java.util.Scanner;

public class Tarefa_4 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int tamv = 20;
        String[] nomes = new String[tamv];
        String busca, existe;
        int i, count;  
        
        //Diz o que o program faz
         System. out.println("Entra com 20 nomes e faz uma busca para ver se o nome existe e conta quantos nomes são iguais ao nome digitado");
        
        //Entrada de dados
        for (i = 0; i < tamv; i++) {
           System.out.print("Entre com o " +(i+1)+ "º nome: ");
           nomes[i] = teclado.next().toUpperCase();
        }
        
        //Busca
        System.out.println("");
        System.out.print("Digite um nome para a busca: ");
        busca = teclado.next().toUpperCase();
        System.out.println("");
        
        //Processamento
        count = 0;
        existe = "";
        for (i = 0; i < tamv; i++) {
            if (busca.equals(nomes[i])) {
                existe = "O nome digitado foi encontrado no vetor";
                count++;
            }
        }
        
        //Saida de dados
        System.out.println("===============================================================");
        System.out.println(existe);
        System.out.println("Foram encontrados " +(count)+ " resultados para esse nome");       
    }
    
}
