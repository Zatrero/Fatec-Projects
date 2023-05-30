package exercicio_367;
import java.util.Scanner;

public class Exercicio_367 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int tamv = 20;
        int[] num = new int[tamv];
        int i, maior , menor;
        double numperc;
        double contPares;
        double percPares;
        double soma;
        double media;

        // Diz o que faz o program 
        System.out.println("Lê 20 numeros e imprime o maior e o menor junto com a média e o porcentual de numeros pares");

        //Entrada de Dados
        for (i = 0; i < tamv; i++) {
            System.out.print("Entre como o " + (i + 1) + "º numero: ");
            num[i] = teclado.nextInt();
        }

        //Processamento
        maior = num[0];
        menor = num[0];
        soma = 0;
        media = 0;
        contPares = 0;
        numperc = 0;

        // somo o primeiro elemento do vetores
        soma = soma + num[0];

        // testo se o primeiro elemento do vetor e par
        if (num[0] % 2 == 0) {
            contPares++;
        }

        // avrre o vetor a partir do segundo elemento
        for (i = 0; i < tamv; i++) {
            // teste o maior
            if (num[i] > maior) {
                maior = num[i];
            }
            // testa o menor
            if (num[i] < menor) {
                menor = num[i];
            }
            // somatorio de todos os elementos do vetor
            soma = soma + num[i];
            // teste para todos os lementos do vetor se e par
            if (num[i] % 2 == 0) {
                contPares++;
            }
        }
        // apos varre o todo o vetor calcula a media e o percentual de pares
        media = soma / tamv;
        percPares = contPares * 100 / tamv;
        // Saida de dados
        System.out.println("Maior = " + maior);
        System.out.println("Menor = " + menor);
        System.out.println("Media = " + media);
        System.out.println("Percentual de pares  = " + percPares + "%");

    }

}
