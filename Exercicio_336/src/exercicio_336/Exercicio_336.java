package exercicio_336;

import java.util.Scanner;

public class Exercicio_336 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int filhos = 5;
        char ver;
        int i;
        int[] ciclo = new int[filhos];
        double[] total = new double[filhos];
        double soma;

        //Diz o que o programa faz
        System.out.println("Vê quantos filhos a familia te e dá desconto");

        //Entrada de dados
        do {
            System.out.println("");
            System.out.print("Você tem filhos?? ");
            ver = teclado.next().toUpperCase().charAt(0);
            if (ver == 'S') {
                System.out.println("");
                System.out.print("Quantos filhos voce tem?");
                filhos = teclado.nextInt();

                if (filhos <= 5) {

                    for (i = 0; i < filhos; i++) {
                        System.out.println("Em qual grade deseja matricular seu " + (i + 1) + "º filho");
                        System.out.println("[1]Pré escola");
                        System.out.println("[2]Fundamental 1");
                        System.out.println("[3]Fundamental 2");
                        System.out.println("[4]Ensino Médio");
                        System.out.println("");
                        ciclo[i] = teclado.nextInt();
                    }
                } else {
                    System.out.println("O numero de filhos é maior do que o exigido pela aplicação (5)");
                    ver = 'N';
                }

                //Processamento do 1º filho
                if (ver == 'S') {
                    if (ciclo[0] == 1) {
                        total[0] = 300;
                    } else {
                        if (ciclo[0] == 2) {
                            total[0] = 400;
                        } else {
                            if (ciclo[0] == 3) {
                                total[0] = 700;
                            } else {
                                total[0] = 1200;
                            }
                        }
                    }

                    //Processamento dos filhos restantes
                    for (i = 1; i < filhos; i++) {
                        if (ciclo[i] == 1) {
                            total[i] = 300;
                        } else {
                            if (ciclo[i] == 2) {
                                total[i] = 400;
                            } else {
                                if (ciclo[i] == 3) {
                                    total[i] = 700;
                                } else {
                                    total[i] = 1200;
                                }
                            }
                        }
                    }

                    //Desconto e total
                    total[1] = total[1] - (total[1] * 10) / 100;
                    total[2] = total[2] - (total[2] * 20) / 100;
                    total[3] = total[3] - (total[3] * 30) / 100;
                    total[4] = total[4] - (total[4] * 40) / 100;

                    soma = 0;

                    for (i = 0; i < filhos; i++) {
                        soma = soma + total[i];
                    }

                    //Saida de dados
                    System.out.println("");
                    System.out.println("============================================================================");
                    for (i = 0; i < filhos; i++) {
                        System.out.println("A mensalidade do seu " + (i + 1) + "º filho é: " + total[i]);
                    }
                    System.out.println("O total das mensalidades é: " + soma);

                } else {
                    if (ver == 'N') {
                        System.out.println("Ok fim do programa");
                    } else {
                        System.out.println("Por favor digite apenas sim ou não");
                    }
                }
            }

        } while (ver != 'N');

    }

}
