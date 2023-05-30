package exercicio_388;

import java.util.Scanner;

public class Exercicio_388 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int tamv = 5100;
        double[] vpcompra = new double[tamv];
        double[] vpvenda = new double[tamv];
        int cont1, cont2, cont3;
        double lucro;
        int i;

        System.out.println("Conta os produtos em 3 faixas de lucro");
// entrada de dados
        for (i = 0; i < tamv; i++) {
            System.out.print("Entre o preço de compra " + (i + 1) + " R$: ");
            vpcompra[i] = teclado.nextDouble();
            System.out.print("Entre o preço de venda " + (i + 1) + " R$: ");
            vpvenda[i] = teclado.nextDouble();
        }
//processamento

        cont1 = 0;
        cont2 = 0;
        cont3 = 0;
        for (i = 0; i < tamv; i++) {
            lucro = (vpvenda[i] / vpcompra[i]) - 1;

            if (lucro < 0.1) {

                //count1 = count + 1 (SAME ENERGY)		
                cont1++;
            } else {
                if ((lucro > 0.1) & (lucro > 0.2)) {

                    cont2++;
                } else {
                    cont3++;
                }
            }
        }
        //saida de dados

        System.out.println("Mercadorias com faixa de dados < 10%  " + cont1);
        System.out.println("Mercadorias com faixa de dados 10% < lucro <= 20%  " + cont2);
        System.out.println("Mercadorias com faixa de dados  >20%  " + cont3);
    }

}
