/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package secion04;

import java.util.Scanner;

/**
 *
 * @author Murillo
 */
public class problema03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa la longitud del primer cateto: ");
        double cateto1 = scanner.nextDouble();
        System.out.print("Ingresa la longitud del segundo cateto: ");
        double cateto2 = scanner.nextDouble();

        double hipotenusa = Math.hypot(cateto1, cateto2);
        System.out.println("La hipotenusa del triángulo es: " + hipotenusa);
    }
}


