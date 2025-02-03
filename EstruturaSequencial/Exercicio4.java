package EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args){
//        Fazer um programa que leia o número de um funcionário,seu número de horas trabalhadas,
//        o valor que recebe por hora e calcula o salário desse funcionário.
//        A seguir, mostre o número e o salário do funcionário, com duas casas decimais.
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int numeroFun;
        int horasTrabalhadadas;
        double valorPorHora;

        double salary;

        numeroFun = sc.nextInt();
        horasTrabalhadadas = sc.nextInt();
        valorPorHora = sc.nextDouble();

        salary = horasTrabalhadadas * valorPorHora;

        System.out.printf("Number", numeroFun);
        System.out.printf("salary %.2f%n", salary);




    }
}
