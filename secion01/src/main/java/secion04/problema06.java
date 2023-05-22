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
public class problema06 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingresa un número entero positivo: ");
    int numero = scanner.nextInt();
    double logaritmoBase2 = Math.log(numero)/Math.log(2);
    System.out.println("El logaritmo base 2 de " + numero + " es: " + logaritmoBase2);
}

}
