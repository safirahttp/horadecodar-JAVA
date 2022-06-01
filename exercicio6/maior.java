// Faça um programa para ler 3 valores (considere que não serão informados valores iguais) e escrever o maior deles. //

import java.util.Scanner;

public class maior {
    public static void main (String[] args) {
        int num = 0;
        int maior = 0;
        Scanner in = new Scanner(System.in);
        
        for (int i = 1; i <= 3; i++) {
            System.out.printf ("Informe um %dº número: ", i);
            num = in.nextInt();
            if (num > maior) {
                maior = num;
            }
        }
        System.out.printf ("O maior número informado foi %d\n", maior);
    }
}