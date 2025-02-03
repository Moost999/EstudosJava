package EstruturaSequencial;

import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args){
//        Fazer um programa para ler o código de uma peça 1, o número de peças 1,
//        o valor unitário de cada peça 1,
//        o
//        código de uma peça 2,
//        o número de peças 2 e o valor unitário de cada peça 2.
//        Calcule e mostre o valor a ser pago.

        Scanner sc = new Scanner(System.in);

        int cod1, cod2, qt1, qt2;
        double p1, p2;
        double resultado;
        cod1 = sc.nextInt();
        qt1 = sc.nextInt();
        p1 = sc.nextDouble();

        cod2 = sc.nextInt();
        qt2 = sc.nextInt();
        p2 = sc.nextDouble();

        resultado = qt1 * p1 + qt2 * p2;

        System.out.printf("Valor a Pagar: R$ %.2f%n", resultado);


    }
}
