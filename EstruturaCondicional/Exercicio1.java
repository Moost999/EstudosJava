package EstruturaCondicional;

import java.awt.*;
import java.util.Scanner;

public class Exercicio1 {
//    Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        if(x < 0){
            System.out.print("Negativo");
        } else {
            System.out.print("Nao Negativo");
        }
        sc.close();
    }
}
