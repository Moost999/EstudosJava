package EstruturaSequencial;

import java.util.Scanner;

public class Exercicios
{


//    Faça um programa para ler o valor do raio de um círculo,
//    e depois mostrar o valor da área deste círculo com quatro
//    casas decimais conforme exemplos.
//
//    Fórmula da área: area = π . raio2
//
//    Considere o valor de π = 3.14159
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double raio, area, pi =3.14159;

        raio = scanner.nextDouble();
        area = pi * raio * raio;
        System.out.printf("A=%.4f%n", area);

        scanner.close();
    }
}
