package fatorial;

import java.util.Scanner;

public class ProgramFatorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int numTabuada = 0, i = 0, resultado = 0;
		Boolean t = true;
		String flag = "N";
		while (t) {
			System.out.println("Informe o numero para Fatorial: ");
			numTabuada = sc.nextInt();
			if (numTabuada == 0) {
				return;
			}
			if (numTabuada < 0 || numTabuada > 10) {
				System.out.println("Numero invalido");
			} else {
				t = false;
				flag = "S";
			}

		}
		sc.close();
		if (flag == "N")
			return;
		resultado =1;
		System.out.println("Fatorial " + numTabuada + "!");
		for (i = numTabuada; i >=1; i--) {
			resultado = resultado * i;
			// 5 X 4 X 3 X 2 X 1 ==> 
		}
		System.out.println("Fatorial de "+numTabuada +" eh = "+ resultado);

	}
}
