/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello_world;
import java.util.Scanner;

public class Hello_World {
          
    public static void main(String[] args) {
        double x, y, r;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite a nota 1: ");
        x = teclado.nextDouble();
        
        System.out.println("Digite a nota 2:");
        y = teclado.nextDouble();
        
        r = (x+y)/2;
        
        System.out.println("Sua média foi: " + r);
        
        if (r>=7) {
            System.out.println("Parabens voce foi aprovado");
        }
        else{
            System.out.println("Voce foi reprovado");
        }
    }
    
}
