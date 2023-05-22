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
public class problema02 {
   public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingresa el valor del radio: ");
    double radio = scanner.nextDouble();
    var perimetro = 2*Math.PI*(radio);
    System.out.println("El perímetro de la circunferencia es: " + perimetro);
}
}


