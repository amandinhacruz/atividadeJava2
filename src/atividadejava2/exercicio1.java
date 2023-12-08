package atividadejava2;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Faça um algoritmo em Java que leia 3 valores inteiros A, B e C e imprima na tela se a soma de A + B é maior, menor ou igual a C.
		
		
		int nA = 2;
		int nB = 4;
		int nC = 5;
		
		int soma = (nA + nB);
		
		if(soma >= nC) {
			System.out.println("A soma é maior que o número C");
		}
		
		int nD = 2;
		int nE = 2;
		int nF = 5;
		
		int soma2 = (nD + nE);
		
		if(soma2 <= nF) {
			System.out.println("A soma é menor que o número C");
		}
		
		int nG = 2;
		int nH = 2;
		int nI = 4;
		
		int soma3 = (nG + nH);
		
		if(soma3 == nI) {
			System.out.println("A soma é igual que o número C");
		}
		
		

	}

}
