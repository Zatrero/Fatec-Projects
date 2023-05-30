package exercicio_332;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio_332 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###.00");
        int usoal, nouse, taluno, vezes;
        int cont5, cont510, cont10;
        char resp, ver;

        //Diz o que o programa faz
        System.out.println("Exibe o prcentual de alunos que utilizaram a xerox");
        
        //Entrada e Processamento
        taluno = 0;
        cont5 = 0;
        cont510 = 0;
        cont10 = 0;
        usoal = 0;
        nouse = 0;
        do {
            System.out.print("Você usou a Xerox [S/N/F]? ");
            ver =  teclado.next().toUpperCase().charAt(0);
            if (ver != 'S' & ver != 'F' & ver != 'N') {
                System.out.println("");
                System.out.println("Responda apenas com Sim, Não ou Fim");
                System.out.println("");
            }
            resp = ver;
            taluno++;

            if (resp =='S') {
                usoal++;
                System.out.print("Quantas vezes você usou? ");
                vezes = teclado.nextInt();
                System.out.println("");
                if (vezes <= 5) {
                    cont5++;
                } else {
                    if (vezes > 5 & vezes < 10) {
                        cont510++;
                    } else {
                        cont10++;
                    }
                }
            }
            else{
                if (resp == 'N') {
                    nouse++;
                }
            }
        } while (resp != 'F');
        
        taluno = taluno - 1;   
        
        
        //Saida
        if (taluno > 0) {
            System.out.println("");
            System.out.println("============================================");
            System.out.println("Foram entrevistdados " +taluno+ " alunos e dentre eles:");
            System.out.println(usoal + " usaram a Xerox");
            System.out.println("Desses " + usoal + " que usaram a xerox:");
            System.out.println(df.format(cont5 * 100 / taluno) + "% dos alunos usaram até 5 vezes");
            System.out.println(df.format(cont510 * 100 / taluno) + "% dos alunos usaram entre 5 e 10 vezes");
            System.out.println(df.format(cont10 * 100 / taluno) + "% dos alunos usaram mais de 10 vezes");
            if (nouse !=0) {
                System.out.println(df.format(nouse * 100 / taluno) + "% dos alunos não usaram a xerox");
            }
        }
        else{
            System.out.println("A xerox não foi usada");
        }
        
    }

}
