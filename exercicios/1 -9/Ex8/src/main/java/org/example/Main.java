package org.example;

//Faça um Programa que pergunte quanto você ganha por hora e o
// número de horas trabalhadas no mês.
// Calcule e mostre o total do seu salário no referido mês.

public class Main {

    public static void main(String[] args) {

        calculaHora salarioMaria = new calculaHora();
        salarioMaria.salarioPorHora();
        salarioMaria.horasTrabalhadas();
        salarioMaria.salarioMes();

        calculaHora salarioDante = new calculaHora();
        salarioDante.salarioPorHora();
        salarioDante.horasTrabalhadas();
        salarioDante.salarioMes();


}}