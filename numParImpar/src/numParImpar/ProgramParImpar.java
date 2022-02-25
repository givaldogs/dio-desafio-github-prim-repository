package numParImpar;

import java.util.Scanner;

public class ProgramParImpar {
	/*
	 * Faca um programa que peca N numeros inteiros, calcule e mostre a quantidade
	 * de numeros pares e a quantidade numeros impares
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe a quantidade de numeros que vai digitar:");
		int n =0, i=0, numPar=0, numImpar=0;
		n = sc.nextInt();
		if (n > 99) return;
		int[] numeros;
		numeros = new int[n];
		for (i=0;i<n;i++) {
			System.out.println("Informe o numero # "+(i+1));
			//numeros[i]=0;
			numeros[i] = sc.nextInt();
			if (numeros[i] % 2 == 0) {
				numPar +=1;
			}
			else {
					numImpar +=1;
				}
			}
		sc.close();
		System.out.println("Quantidade de numeros pares   eh: "+ numPar);
		System.out.println("Quantidade de numeros impares eh: "+ numImpar);
		}
	}

