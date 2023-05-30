package exercicio_389;
import java.util.Scanner;

public class Exercicio_389 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int tamv = 12;
        double[] temp = new double[tamv];
        String[] meses = new String[12];
        int i, j;
        double maior, menor , media;
        
        //Diz o que o programa faz 
        System.out.println("Armazena as temperaturas de 12 meses e calcula a maior a menor e a média");
        
        //Entrada de dados
        
        meses[0] = "Janeiro";
        meses[1] = "Fevereiro";
        meses[2] = "Março";
        meses[3] = "Abril";
        meses[4] = "Maio";
        meses[5] = "Junho";
        meses[6] = "Julho";
        meses[7] = "Agosto";
        meses[8] = "Setembro";
        meses[9] = "Outubro";
        meses[10] = "Novembro";
        meses[11] = "Dezembro";
        
        for (i = 0; i < tamv; i++) {
            System.out.print("Insira a temperatura  do mes de " + meses[i] + ": ");
            temp[i] = teclado.nextDouble();
        }
        
        //Processamento
        maior = temp[0];
        menor = temp[0];
        media = 0;
        
        for (i = 0; i < tamv; i++) {
            if (temp[i] < menor ) {
                menor = temp[i];
            }
            if (temp[i] > maior) {
                maior = temp[i];
            }
            
            media = media + temp[i];
        }
        
        media = media/12;
        
        //Saida
        
        System.out.println("");
        System.out.println("========================================================");
        
        for (i = 0; i < tamv; i++) {
                System.out.println("A temperatura de " +meses[i]+ " é de: " +temp[i]);
        }
        
        System.out.println("");
        System.out.println("A maior temperatura é: " + maior+ "ºC");
        System.out.println("A menor temperatura é: " + menor + "ºC");
        System.out.println("A média das temperaturas é: " + media+ "ºC");
        
    }
    
}
