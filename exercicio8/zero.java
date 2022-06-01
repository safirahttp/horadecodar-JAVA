// Faça um para ler 2 valores informados pelo usuário e se o segundo valor informado for ZERO, deve ser lido um novo valor, ou seja, para o segundo valor não pode ser aceito o valor zero nem negativo e imprimir o resultado da divisão do primeiro valor lido pelo segundo valor lido. //

import java.util.Scanner;

public class zero {
    public static void main (String[] args) {
        Double num1, num2, res;
        Scanner in = new Scanner(System.in);

        System.out.println ("informe o primeiro número: ");
        num1 = in.nextDouble();

        System.out.println ("Informe o segundo número: ");
        num2 = in.nextDouble();

        while(num2 <= 0) {
            System.out.println ("O Segundo numero deve ser maior que 0 (zero): ");
            num2 = in.nextDouble();
        }
        res = num1/num2;
        System.out.printf ("%f dividido por %f é = %f", num1, num2, res);
    }
}