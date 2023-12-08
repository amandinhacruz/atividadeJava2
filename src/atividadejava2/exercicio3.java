package atividadejava2;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nome;
		int idade;
		boolean primeiraDoacao = false; 
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Qual é o seu nome?");
		nome = leia.nextLine();
		
		System.out.println("Quantos anos você tem?");
		idade = leia.nextInt();
		
		System.out.println("É sua primeira vez doando sangue?");
		primeiraDoacao = leia.nextBoolean();
		
		if (idade >= 18 && idade <=60) {
			System.out.println(nome + " está apto para doar sangue!");
		}
		else if (idade >= 60 && idade  <=69 && primeiraDoacao == true ) {
				System.out.println(nome + " está apto para doar sangue!");
		} else {
			System.out.println( nome + " não está apto para doar sangue!");
		}

	}

}
