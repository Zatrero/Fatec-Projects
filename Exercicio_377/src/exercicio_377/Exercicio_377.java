package exercicio_377;

import java.util.Scanner;

public class Exercicio_377 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        long registro;
        int atraso;
        double imposto;
        double multa;
        int i;
        char ver = 'S';

        //Diz o que o programa faz 
        System.out.println("Calcula a multa do seu imposto atrasado");
        System.out.println("");

        //Entrada de dados
        do {
            System.out.print("Digite o numero de registro da propriedade: ");
            registro = teclado.nextLong();

            System.out.println("");
            System.out.print("Qual o valor do imposto? ");
            imposto = teclado.nextDouble();

            System.out.println("");
            System.out.print("Há quantos meses está atrasado? ");
            atraso = teclado.nextInt();

            // Processamento
            if (imposto >= 500) {
                multa = atraso * ((imposto * 1) / 100);
            } else {
                if (imposto > 500 && imposto <= 1800) {
                    multa = atraso * ((imposto * 2) / 100);
                } else {
                    if (imposto > 1800 && imposto <= 5000) {
                        multa = atraso * ((imposto * 5) / 100);
                    } else {
                        if (imposto > 5000 && imposto < 7500) {
                            multa = atraso * ((imposto * 9) / 100);
                        } else {
                            multa = atraso * ((imposto * 12) / 100);
                        }
                    }
                }
            }

            //Saída
            System.out.println("");
            System.out.println("===================================================");
            System.out.println("Propriedade: " + registro);
            if (atraso == 1) {
                System.out.println("Seu imposto de " + imposto + " está atrasado há 1 mes.");
            } else {
                System.out.println("Seu imposto de " + imposto + " está atrasado há " + atraso + " meses.");
            }

            System.out.println("Valor da multa: " + multa);
            System.out.println("");
            System.out.println("");

            System.out.println("Deseja continuar [S/N]");
            ver = teclado.next().toUpperCase().charAt(0);
        } while (ver == 'S');

        System.out.println("OK Fim do programa");
    }

}
