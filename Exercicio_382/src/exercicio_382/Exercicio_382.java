package exercicio_382;

import java.util.Scanner;

public class Exercicio_382 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int TAMV = 20;
        int i, j;
        int[] vet20 = new int[TAMV];
        int[] vtk = new int[TAMV];
        int aux;

        System.out.println("Monta um vetor novosem numeros repetidos e em ordem crescente");

        // entrada de dados
        for (i = 0; i < TAMV; i++) {
            System.out.print("Entre um numero[" + (i + 1) + "] ? ");
            vet20[i] = teclado.nextInt();
        }

        // processmaneto
        // metodo de ordenacao
        for (i = 0; i < TAMV; i++) {
            for (j = i + 1; j < TAMV; j++) {
                if (vet20[i] > vet20[j]) {
                    aux = vet20[i];
                    vet20[i] = vet20[j];
                    vet20[j] = aux;
                }
            }
        }

        // tirar os numeros repetidos e gerar novo vetor vtk
        // solução parcial. Precisa melhorar a ideia
        j = 1;
        for (i = 0; i < TAMV; i++) {
            if (vet20[i] != vet20[j -  1]) {
                vtk[j] = vet20[i];
                j++;
            }
        }

        // saida de dados
        for (i = 0; i <= j; i++) {
            System.out.println("[" + (i + 1) + "] = " + vtk[i]);
        }

    }

}
