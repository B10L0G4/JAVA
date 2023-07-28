package org.example;

import java.util.Scanner;


public class calculaHora extends salarioDefinicao {

    Scanner scanner = new Scanner(System.in);

    public void salarioPorHora(){
        System.out.println("Qual o salario por hora a ser calculado?");
        salarioPorHora = scanner.nextDouble();
    }
    public void horasTrabalhadas () {
        System.out.println("Quantas horas foram trabalhadas por dia? ");

        horasTrabalhadas = scanner.nextDouble();
        horasTrabalhadas = (horasTrabalhadas * 5) * 4;

        System.out.println(" horas foram trabalhadas no mês " + horasTrabalhadas);

    }
    public void salarioMes() {
        salarioMes = salarioPorHora * horasTrabalhadas;
        System.out.println("Salario por hora é "
                + salarioPorHora +
                " você trabalhou " +
                horasTrabalhadas +
                " neste mês e seu salario é "
                +salarioMes);
    }




}
