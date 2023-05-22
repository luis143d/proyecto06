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
public class problema01 {
    public static void main(String[] args) {
        double lado;
        double area;
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese la longitud del lado del triángulo: ");
        lado = input.nextDouble();

        area = (Math.pow(lado, 2) * Math.sqrt(3)) / 4;

        System.out.println("El área del triángulo es: " + area);
    }
}


