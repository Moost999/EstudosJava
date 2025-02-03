package EstruturaCondicional;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args){
//        Leia a hora inicial e a hora final de um jogo.
//        A seguir calcule a duração do jogo, sabendo que o mesmo pode
//        começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.

        Scanner sc = new Scanner(System.in);
        int horaInicial = sc.nextInt();
        int horaFinal = sc.nextInt();

        int duração;
        if(horaInicial <  horaFinal){
            duração = horaInicial - horaFinal;
        }
        else {
            duração = 24 - horaInicial + horaFinal;
        }
        System.out.printf("O Jogo Durou " + duração + "horas");

    }
}
