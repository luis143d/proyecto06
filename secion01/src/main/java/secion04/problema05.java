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
public class problema05 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingresa el primer número: ");
    double numero1 = scanner.nextDouble();
    System.out.print("Ingresa el segundo número: ");
    double numero2 = scanner.nextDouble();
    double maximo = Math.max(numero1, numero2);
    System.out.println("El valor máximo es: " + maximo);
}
}
