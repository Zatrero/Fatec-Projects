package exercicio_361;
import java.util.Scanner;

public class Exercicio_361 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int tamv = 3;
        int i;
        String[] nome = new String[tamv];
        int[] cod = new int[tamv];
        int[] quant = new int[tamv];
        double[] vcomp = new double[tamv];
        double[] vvend = new double[tamv];
        int quest;
        int v, busca;

//Diz oq o programa faz
System.out.println("Armazena informações 5 produtos. Faz uma lista de todos produtos ou somente de um ao se digitar o codigo");

//entrada 
	for (i=0; i< tamv ; i++){
		System.out.print("Entre com o nome do produto["+(i+1)+"]: ");
		nome[i] = teclado.next();
		System.out.print("Entre com o codigo de " +nome[i]+ "["+(i+1)+"]: ");
		cod[i] = teclado.nextInt();
		System.out.print("Entre com o valor de compra de " +nome[i]+ "["+(i+1)+"]: ");
		vcomp[i] = teclado.nextDouble();
		System.out.print("Entre com o valor de venda de " +nome[i]+ "["+(i+1)+"]: ");
		vvend[i] = teclado.nextDouble();
		System.out.print("Entre com a quantidade de " +nome[i]+ "["+(i+1)+"]: ");
		quant[i] = teclado.nextInt();
                System.out.println();
                        }
//processamento e saida
	System.out.println("Deseja buscar um produto especifico??");
        System.out.println("Digite 1 para digitar o código ou 2 para ver a lista completa:");
	quest = teclado.nextInt();
        v = 0;
	if(quest == 1){	
		System.out.println("digite o codigo do produto:");
		busca = teclado.nextInt();
		for (i=0; i< tamv ; i++){
			if(busca == cod[i]){
			v = i;
                                }
                }
	
	System.out.println("Código: "+ cod[v]);
	System.out.println("Produto: "+ nome[v]);
	System.out.println("Quantidade: "+ quant[v]);
	System.out.println("Valor de compra: "+ vcomp[v]);
	System.out.println("Valor de venda: "+ vvend[v]);
        }
        else{
		for (i=0; i< tamv ; i++){
			System.out.println("Código: "+ cod[i]);
			System.out.println("Produto: "+ nome[i]);
			System.out.println("Quantidade: "+ quant[i]);
			System.out.println("Valor de compra: "+ vcomp[i]);
			System.out.println("Valor de venda: "+ vvend[i]);
                        System.out.println();
                }
        }
    }
    
}
