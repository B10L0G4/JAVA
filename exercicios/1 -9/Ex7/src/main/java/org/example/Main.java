package org.example;

import java.util.Scanner;

// Faça um Programa que calcule a área de um quadrado, em
// seguida mostre o dobro desta área para o usuário.
public class Main {
    public static void main(String[] args) {

// a =l * l
        double lado;
        double area ;
        double areaElevada;
        Scanner scanner =new Scanner(System.in);
        System.out.println("Qual o valor da area a ser calculada? ");
        lado = scanner.nextFloat();

        area = lado * lado;
        areaElevada = area * 2;
        System.out.println("A area é: "+ area);
        System.out.println("O lado do quadrado mede "+ lado +", e a area do quadrodo ao quadrado é: "+ areaElevada);
    }
}