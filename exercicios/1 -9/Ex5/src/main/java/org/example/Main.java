package org.example;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;
//Faça um Programa que converta metros para centímetros.
public class Main {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.0");
        df.setRoundingMode(RoundingMode.HALF_UP);

        double centmeter;
        double meter;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantos metros você deseja converter");
        meter = scanner.nextDouble();

        centmeter = 100 * meter;

        System.out.println("A conversão de "
                + meter+ " metros é: "+df.format(centmeter)
                + " centimetros");
    }
}