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
public class problema08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa la base: ");
        double base = scanner.nextDouble();
        System.out.print("Ingresa el exponente: ");
        double exponente = scanner.nextDouble();
        double resultado = Math.pow(base, exponente);
        System.out.println(base + " elevado a la " + exponente + " es igual a " + resultado);
    }
}


