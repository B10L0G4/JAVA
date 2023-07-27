package org.example;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

//  Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.

public class Main {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.0");
        df.setRoundingMode(RoundingMode.HALF_UP);

        double raio;
        double area;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Fornece o raio");
        raio = scanner.nextFloat();

        area  = Math.PI * (raio * raio);

        System.out.println("O raio fornecido é: "+ raio + "e sua área é: "+ df.format(area));
    }
}