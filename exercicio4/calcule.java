// Considerando a figura acima, escreva um programa para cada forma que calcule e exiba em tela cada uma de suas respectivas áreas. O usuário irá informar os valores de cada variável. Crie um arquivo para cada fórmula e poste os  arquivos no GitHub. Link do repositório abaixo. //

import java.util.Scanner;

public class calcule {
	public static void main (String[] args) {	
	
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escolha uma opção \n1-Retangulo \n2-Quadradado \n3-Losango \n4-Trapézio \n5-Paralelogramo \n6-Triangulo \n7-Circulo");
		int calculo = entrada.nextInt();
		
		switch(calculo) {

        // retângulo //
		case 1:
			System.out.println("Informe a altura do retângulo:");
			double altura = entrada.nextDouble();
			System.out.println("Informe a base do retângulo:");
			double base = entrada.nextDouble();
			
			System.out.println("A área do retângulo é: " + base * altura);
			break;

        // quadrado //
		case 2:	
			System.out.println("Informe o valor dos lados");
			double lado = entrada.nextDouble();
			System.out.println("A área do quadrado é: " + Math.pow(lado, 2));
			break;

        // losango //
		case 3:
			System.out.println("Informe o valor da diagonal maior");
			double dMaior = entrada.nextDouble();
			System.out.println("Informe o valor da diagonal menor");
			double dMenor = entrada.nextDouble();
			System.out.println("A área do losango é: " + ((dMaior * dMenor)/2));
			break;

        // trapézio //
		case 4: 
			System.out.println("Informe o valor da base maior");
			double bMaior = entrada.nextDouble();
			System.out.println("Informe o valor da base menor");
			double bMenor = entrada.nextDouble();
			System.out.println("Informe o valor da altura");
			altura = entrada.nextDouble();
			System.out.println("A área do trapézio é: " + (((bMaior + bMenor)* altura)/2));
			break;

        // paralelograma //
		case 5:
			System.out.println("Informe a altura do paralelograma");
			altura = entrada.nextDouble();
			System.out.println("Informe a base do paralelograma");
			base = entrada.nextDouble();
			System.out.println("A área do paralelograma é: " + base * altura);
			break;

        // triângulo //
		case 6: 
			System.out.println("Informe a altura do triângulo");
			altura = entrada.nextDouble();
			System.out.println("Informe a base do triângulo");
			base = entrada.nextDouble();
			System.out.println("A área do triângulo é: " + (base * altura)/2);
			break;

        // círculo //
		case 7: 
			System.out.println("Informe o raio do círculo");
			double raio = entrada.nextDouble();
			System.out.println("A área da circunferência é: " + Math.PI * raio);
			break;

		default:
			System.out.println("Opção invalida!");
		}

		entrada.close();
		
	}
}