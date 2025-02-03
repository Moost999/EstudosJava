package EstruturaCondicional;

import javax.sound.midi.SysexMessage;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio8 {
//Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb.
// Em seguida, calcule e
//mostre o valor que esta pesgitsoa deve pagar de Imposto de Renda, segundo a tabela abaixo.


    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double salario;
        double imposto = 0.0;
        salario = sc.nextDouble();

        if(salario <= 2000.0){
            imposto = 0.0;
        } else if (salario <= 3000.0){
            imposto = (salario - 2000.0) * 0.8;
        } else if (salario <= 4500.0) {
            imposto = (salario - 3000.0) * 0.18 + 1000 * 0.08;
        } else {
            imposto = (salario - 4500.0) * 0.28 + 1500 * 0.18 + 1000.0 * 0.08;
        }
        if(imposto == 0.0){
            System.out.println("Isento");
        }else {
            System.out.printf("R$ %.2f%n",imposto);
        }
    }
}
