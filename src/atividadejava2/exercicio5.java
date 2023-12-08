package atividadejava2;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		int codigo;
		int quantidade;
		
		System.out.println("*** **Cardápio** ***");
		System.out.println("1: Cachorro- quente R$10.00");
		System.out.println("2: X-Salada R$15.00");
		System.out.println("3: X-Bacon R$18.00");
		System.out.println("4: Bauro R$12.00");
		System.out.println("5: Refrigerante R$8.00");
		System.out.println("6: Suco de laranja R$13.00");
		
		System.out.println("\n Digite o codigo do produto desejado:");
		codigo = leia.nextInt();
		
		System.out.println("\n Digite a quantidade desejada:");
		quantidade = leia.nextInt();
		
		switch (codigo) {
		case 1: System.out.println("O total do seu pedido de Cachorro-quente é: R$" +  10 * quantidade);
		break;
	
		case 2: System.out.println("O total do seu pedido de X-Salada é: R$" +   15 * quantidade );
		break;
		
		case 3: System.out.println("O total do seu pedido de X-Bacon é: R$" +   18 * quantidade);
		break;
		
		case 4: System.out.println("O total do seu pedido de Bauro é: R$" +  12 * quantidade );
		break;
		
		case 5: System.out.println("O total do seu pedido em Refrigerante é: R$" +  8 * quantidade);
		break;
		
		case 6: System.out.println("O total do seu pedido em Suco de Laranja  é: R$" +  13 * quantidade );
		break;
		}
		

	}

}
