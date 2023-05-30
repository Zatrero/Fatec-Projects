package exercicio_5121.pkg2;
import java.util.Scanner;

public class Exercicio_51212 {
  public static void main(String[] args) {
      String sigla;
      String estado;
      Scanner teclado = new Scanner(System.in);
      
      System.out.println("Identifica a sigla e mostra o estado");
      
      System.out.println("Entre com a sigla:");
      sigla = teclado.next().toUpperCase();
      
      if (sigla.equals("SP")) {
          estado = "São Paulo";
       }
      else{
          if (sigla.equals("MG")) {
              estado = "Minas Gerais";
          }
          else{
              if (sigla.equals("TO")) {
                  estado = "Tocantins";
              }
              else{
                  estado = "outro estado"; 
              }
          }
      }
      
      System.out.print("Para sigla "+ sigla + " o estado é: " + estado);
    }
    
}
