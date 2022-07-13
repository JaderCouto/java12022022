
/*
Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido
e continue pedindo
até que o usuário informe um valor válido.
*/

import java.util.Scanner;

public class Exercicio2Nota {
    public static void main (String[] args){

        Scanner scan = new Scanner(System.in);

        int nota;

        System.out.println("Exercicios sobre estruturas de repetição - Exercício 2");
        System.out.println("Insira sua nota: ");
        nota = scan.nextInt();

        while  ((nota <= 0)&&(nota >= 10)) {
            System.out.println("Nota Inválida - Sua nota: "+nota);
            System.out.println("Insira sua nota: ");
            nota = scan.nextInt();
        }
    }

}
