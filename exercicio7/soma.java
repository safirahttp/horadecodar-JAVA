// Faça um programa que leia  3 valores (considere que não serão informados valores iguais) e escrever a soma dos 2 maiores. //

import java.util.Scanner;

public class soma {
    public static void main (String[] args) {
        double numAnt = 0;
        double soma = 0;
        Scanner entrada = new Scanner(System.in);
        
        for (int i = 0; i < 3; i++) {
            System.out.println ("Digite um número: ");
            double num = entrada.nextDouble();

            if (num > numAnt) {
                soma += num;
            }
            numAnt = num;
        }

        System.out.println ("A soma dos 2 maiores números é " + soma);
        entrada.close();
    }
}