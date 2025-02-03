package EstruturaCondicional;

import java.util.Scanner;

public class Exercicio2 {
//   Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        if(x % 2 == 0){
            System.out.print("PAR");
        }
        else {
            System.out.print("IMPAR");
        }
    }
}
