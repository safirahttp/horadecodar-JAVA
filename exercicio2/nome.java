// Escreva um programa em Java em que o usuário informe o seu nome e exiba a mensagem "Olá, [NomeDoUsuario]". //

import java.util.Scanner;

public class nome {
    public static void main (String[] args) {
        String nome;
        Scanner in = new Scanner(System.in);

        System.out.println ("Qual é o seu nome?");
        nome = in.next();

        System.out.println ("\n\tOlá " + nome);
    }
}