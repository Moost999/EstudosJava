package EstruturaCondicional;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args){

//  Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item.
//  A seguir, calcule e mostre o valor da conta a pagar.


        Scanner sc = new Scanner(System.in);
        int codigo;
        double preco;
        int qtd;

        codigo = sc.nextInt();
        qtd = sc.nextInt();
        double resultadoTotal;

        if(codigo == 1){
            preco = 4;
            resultadoTotal = qtd * preco;

            System.out.printf("Total R% %.2f%n", resultadoTotal);
        }
        else if(codigo == 2){
            preco = 4.50;
            resultadoTotal = qtd * preco;

            System.out.printf("Total R$ %.2f%n", resultadoTotal);
        } else if (codigo == 3) {
            preco = 5.0;
            resultadoTotal = qtd * preco;
        }
    }
}
