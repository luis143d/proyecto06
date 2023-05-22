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
public class demostracion {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
    System.out.println("Ingrese el primer número: ");
        int num1 = input.nextInt();
    System.out.println("Ingrese el segundo número: ");
        int num2 = input.nextInt();
    System.out.println("Ingrese el tercer número: ");
        int num3 = input.nextInt();
    System.out.println("Ingrese el cuarto número: ");
        int num4 = input.nextInt();
    int max = Math.max(num1, Math.max(num2, Math.max(num3, num4)));
    System.out.println("El número mayor es: " + max);
}
}
