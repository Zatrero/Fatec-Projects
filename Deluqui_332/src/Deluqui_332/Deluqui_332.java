package Deluqui_332;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Deluqui_332 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###.00");

        int totalalunos;
        int cont5;
        int cont5_10;
        int cont10;
        char resp;
        int quantas;

        System.out.println("Mostra a utilização da XEROX no DCE pelos alunos");

        // entrada de dados
        do {
            System.out.print("Voce fez uso da xerox [S/N/F] ? ");
            resp = teclado.next().toUpperCase().charAt(0);
        } while ((resp != 'S') && (resp != 'N') && (resp != 'F'));

        // inicialização dos contadores
        totalalunos = 0;
        cont5 = 0;
        cont5_10 = 0;
        cont10 = 0;

        while (resp != 'F') {
            if (resp == 'S') {
                totalalunos++;

                // entrada de dados
                System.out.print("Aluno, quantas vezes vc usou a XEROX?? ");
                quantas = teclado.nextInt();

                // processmaneto
                if (quantas <= 5) {
                    cont5++;
                } else if (quantas <= 10) {
                    cont5_10++;
                } else {
                    cont10++;
                }
            } else {
                System.out.println("esta aluno NAO utilizou a XEROX.");
            }

            // pergunta obrigatoria para verificcao de saida do ENQUANTO
            do {
                System.out.print("Voce fez uso da xerox [S/N/F] ? ");
                resp = teclado.next().toUpperCase().charAt(0);
            } while ((resp != 'S') && (resp != 'N') && (resp != 'F'));
        }

        // saida de dados
        if (totalalunos > 0) {
            System.out.println();
            System.out.println("Total de alunios que utilizaram a XEOX "
                    + totalalunos);
            System.out.println("Percentual de alunos até 5 vezes "
                    + df.format(cont5 * 100 / totalalunos));
            System.out.println("Percentual de alunos entre  5 e 10 vezes "
                    + df.format(cont5_10 * 100 / totalalunos));
            System.out.println("Percentual de alunos com mais de 10 vezes "
                    + df.format(cont10 * 100 / totalalunos));
        } else {
            System.out.println("A XEROX nÃO foi utilizada pelos alunos");
        }
    }

}
