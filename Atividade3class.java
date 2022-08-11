package Aula2;

import java.util.Scanner;

public class Atividade3class {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("==== PROGRAMA DE CALCULO DE MEDIAS ====");
		System.out.println();
		System.out.println("Escola Fuctura de Tecnologia");
		System.out.println("Digite o nome do aluno: ");
		String aluno = input.next();
		System.out.println("Digite a materia avaliada: ");
		String materia = input.next();
		System.out.println("Digite a nota da primeira prova: ");
		Double primeira = input.nextDouble();
		System.out.println("Digite a nota da segunda prova: ");
		Double segunda = input.nextDouble();
		Double media = ((primeira + segunda)/2);
		System.out.println("Sua media e " + media);
		
		input.close();

	}

}
