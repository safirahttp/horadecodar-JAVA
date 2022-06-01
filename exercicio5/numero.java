// Faça um programa que leia um valor informado pelo usuário e diga se o valor informado é positivo, negativo ou zero. //

import java.util.Scanner;

public class numero {
    public static void main (String[] args) {
        Double numero;
        Scanner in = new Scanner(System.in);

        System.out.println ("Informe um número para saber se ele é positivo, negativo ou zero: ");
        numero = in.nextDouble();

        if (numero == 0) {
            System.out.printf ("O número informado foi %f e ele é igual a zero.", numero);
        } else if (numero < 0) {
            System.out.printf ("O número informado foi %f e ele é negativo.", numero);
        } else {
            System.out.printf ("O número informado foi %f e ele é positivo.", numero);
        }
    }
}