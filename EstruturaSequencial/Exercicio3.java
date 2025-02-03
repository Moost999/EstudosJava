package EstruturaSequencial;

import java.util.Scanner;
public class Exercicio3 {

//    Fazer um programa para ler quatro valores inteiros A, B, C e D.
//    A seguir, calcule e mostre a diferença do produto
//    de A e B pelo produto de C e D segundo a fórmula: DIFERENÇA = (A * B - C * D).

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int a,b,c,d;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();

        int resultado = (a * b - c * d);
        System.out.print(resultado);
    }
}
