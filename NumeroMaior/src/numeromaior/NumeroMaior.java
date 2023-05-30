/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeromaior;

import java.util.Scanner;

public class NumeroMaior {

    public static void main(String[] args) {
        double x, y, z, r;

        Scanner num = new Scanner(System.in);

        System.out.println("Digite um numero:");
        x = num.nextDouble();

        System.out.println("Digite outro numero:");
        y = num.nextDouble();

        System.out.println("Digite um ultimo numero:");
        z = num.nextDouble();

        if (x > y &  x > z) {
            r = x;

        } else {
            if (z > x & z > y) {
                r = z;
            } else {
                r = y;
            }
        }
        
        System.out.println("O maior numero é :" + r);

    }

}
