package atividadejava2;

import java.util.Scanner;
public class exercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double n1;
		double n2;
		double soma, subtracao, multiplicacao, divisao;
		int opc;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o primeiro valor");
		n1 = entrada.nextDouble();
		
		System.out.println("Informe o segundo valor");
		n2 = entrada.nextDouble();
		
		System.out.println("*** **SELECIONE UMA OPERÇÃO** ***");
		System.out.println("1: somar ");
		System.out.println("2: subtrair ");
		System.out.println("3: multiplicar ");
		System.out.println("4: divisão ");
		opc = entrada.nextInt();
		
		switch(opc) {
		case 1:
			soma = n1+n2;
			System.out.println("A soma é: " + soma);
		break;
		
		case 2: 
			subtracao = n1-n2;
			System.out.println("O valor subtração é: " + subtracao);
	    break;
	    
		case 3:
			multiplicacao = n1*n2;
			System.out.println("O valor da multiplicação é: " + multiplicacao);
		break;
		
		case 4: 
			if (n1<n2) {
				System.out.println("Impossivel de realizar o calculo");
			} 
			else {
			divisao = n1/n2;
			System.out.println("O valor da divisão é: " + divisao);
			}
			break;
			
			default:
				System.out.println("Operação invalida");
		}
		
		

	}

}
