package exercicio_335;

import java.util.Scanner;

public class Exercicio_335 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int idade;
        char sexo;
        char corolhos;
        char corcabelos;
        int maioridade;
        int totalhab, contB;
        double percentB;

        System.out.println("Levantamento de caracteristicas da população de PELOTAS.");

        // entrada de dados
        System.out.print("Entra a idade do habitante ou (zero para encerrar): ");
        idade = teclado.nextInt();
        maioridade = 0;
        contB = 0;
        totalhab = 0;

        while (idade > 0) {
            totalhab++;

            // processmaneto 1
            if (idade > maioridade) {
                maioridade = idade;

            }
            // entrada de dados
            System.out.print("Entre o sexo [M]asculino / [F]eminino : ");
            sexo = teclado.next().toUpperCase().charAt(0);
            System.out.print("Entre a cor dos olhos [A]zuis, [V]erdes, [C]astanhos, [O]utros: ");
            corolhos = teclado.next().toUpperCase().charAt(0);
            System.out.print("Entre a cor dos cabelos [L]ouros, [C]astanhos, [P]retos");
            corcabelos = teclado.next().toUpperCase().charAt(0);

            // proceesmaneto 2
            if ((idade > 18 && idade <= 35)
                    && (sexo == 'F') && (corolhos == 'V') && (corcabelos == 'L')) {
                contB++;
            }
            System.out.println("------------------------");
            System.out.print("Entra a idade do habitante ou (zero para encerrar): ");
            idade = teclado.nextInt();
        }
        // saida de dados
        if (totalhab > 0) {
            // saida de dados - Resposta A
            System.out.println("maior idade = " + maioridade);
            percentB = contB * 100 / totalhab;
            // saida de dados - resposta B
            System.out.println("Para " + totalhab + "dehabitantes F, >18 <=35 V L o % = " + percentB);

        }
    }
}
