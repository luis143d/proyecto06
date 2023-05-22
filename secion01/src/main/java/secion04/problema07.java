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
public class problema07 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingresa un número: ");
    int numero = scanner.nextInt();
    int valorAbsoluto = Math.abs(numero);
    System.out.println("El valor absoluto de " + numero + " es: " + valorAbsoluto);
}

}
