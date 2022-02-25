package tabuada;

import java.util.Scanner;

public class ProgramTabuada {
	/*
	 * Desenvolva um gerador de tabuada capaz de gerar a tabuada de qualquer numero
	 * inteiro entre 1 a 10 O usuario deve informar de qual numero ele deseja ver a
	 * tabuada. A saida deve ser conforme o exemplo TABUADA DE 5: 5 X 1 = 5 5 X 2 =
	 * 10 ... 5 X 10 = 50
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int numTabuada = 0, i = 0, resultado = 0;
		Boolean t= true;
		String flag = "N";
		while (t) {
			System.out.println("Informe o numero da tabuada entre 1 a 10: ");
			numTabuada = sc.nextInt();
			if (numTabuada == 0) {
				return;
			}
			if (numTabuada < 0 || numTabuada > 10) {
				System.out.println("Numero invalido");
			}	else {
					t=false;
					flag = "S";
				}

			}
		sc.close();
		if (flag == "N") return;
		System.out.println("TABUADA DO "+numTabuada);
		for (i=0;i<10;i++) {
			System.out.println(numTabuada + " x " + (i+1) + " = " + (numTabuada * (i+1)) );
		
		}

	}

}
