package Aplicacao;

import java.util.Random;
import java.util.Scanner;

public class Program {
	//Random random = new Random();
	//int numero = random.nextInt(100);
	// int[][] m = new int[4][4] // bidimensional
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int numero = 0, i = 0, numMaior = 0;
		int soma = 0;
		float media = 0;
		// i=0;
		// i +=1;
		do {
			System.out.println("Entre com o numero # " + (i + 1));
			numero = sc.nextInt();
			soma += numero;
			if (numero > numMaior) {
				numMaior = numero;
			}
			i += 1;
		} while (i < 5);
		System.out.println("valor do i " + i);
		media = (float) soma / i;
		System.out.println("O Numero maior digitado eh: " + numMaior);
		System.out.println("soma " + soma);
		System.out.printf("A media eh: %.2f%n", media);
		sc.close();
		
		int num = 5, count = 1;
        while(count <= 3) {
            ++count;
            num += count;
        }
        System.out.println(num);
        
        int ii, numi = 5;
        for (ii = 0; ii < 3; ii++) {
            numi += i;
            System.out.print(ii);
        }
	}

}
