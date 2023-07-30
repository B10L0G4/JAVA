package org.example;

import java.util.Scanner;

// Faça um Programa que peça as 4 notas bimestrais e mostre a média.

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nota Primeiro Bimestre");
        double notaPrimeiroBimestre = scanner.nextDouble();
        System.out.println("Nota Segundo Bimestre");
        double notaSegundoBimenstre = scanner.nextDouble();
        System.out.println("Nota Terceiro Bimestre");
        double notaTerceiroBimestre = scanner.nextDouble();
        System.out.println("Nota Quarto Bimestre");
        double notaQuartoBimenstre = scanner.nextDouble();



        double notasMedia;

        notasMedia = (notaPrimeiroBimestre + notaSegundoBimenstre + notaTerceiroBimestre
                + notaQuartoBimenstre)/4;

        System.out.println("Nota Final: " + notasMedia);



    }
}