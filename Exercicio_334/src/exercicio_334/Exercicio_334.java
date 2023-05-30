package exercicio_334;

import java.util.Scanner;

public class Exercicio_334 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int id;
        double peso;
        int idgordo, idmagro;
        double pesogordo, pesomagro;
        int contBoi;

        System.out.println("Localiza o boi mais magro e mais gordinho do ebanho");

        // entrada de dados
        idgordo = 0;
        idmagro = 0;
        pesomagro = 10000;
        pesogordo = 0;
        id = 1000;
contBoi = 0;
        while (id > 0) {
            // pede osdados de cada boi
            System.out.print("Entre a identificação do boi (ou ZERO para encerrar): ");
            id = teclado.nextInt();
            // processmaneto
            // sõ faz pocessmaneto se entar um ID de boi > 0
            if (id > 0) {
                System.out.print("Entre o peso do boi (Kg): ");
                peso = teclado.nextDouble();
                contBoi++;
                // processmaneto do gordinho
                if (peso > pesogordo) {
                    idgordo = id;
                    pesogordo = peso;
                }
                // processmaneto do magro
                if (peso < pesomagro) {
                    idmagro = id;
                    pesomagro = peso;
                }
            }
        }
        // saiada de dados
        // Se pelo menos um boi foi digitado mostrar as respostas
        if (contBoi > 0) {
            System.out.println("===================================");
            System.out.println("O boi gordo " + idgordo + " pesa " + pesogordo + " Kg");
            System.out.println("O boi magro " + idmagro + " pesa " + pesomagro + " Kg");
        } else {
            System.out.println("NAO foi entrado dados denenhum boi");
        }
    }

}
