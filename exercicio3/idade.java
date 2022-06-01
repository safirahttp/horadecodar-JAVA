// Escreva um programa em Java em que o usuário informe o seu nome e em seguida o programa perguntará a idade do usuário. Agora o programa deve exibir a mensagem "Olá, [NomeDoUsuario], sua idade é [idade]". //

import java.util.Scanner;

public class idade {
    public static void main (String[] args) {
        String nome;
        int idade = 0;
        Scanner in = new Scanner(System.in);

        System.out.println ("Qual é o seu nome?");
        nome = in.next();

        System.out.println ("Qual é a sua idade?");
        idade = in.nextInt();

        System.out.println ("\n\tOlá " + nome + ", você tem " + idade + " anos.");
    }
}