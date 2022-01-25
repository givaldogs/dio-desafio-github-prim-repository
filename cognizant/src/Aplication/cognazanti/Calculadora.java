package Aplication.cognazanti;

public class Calculadora {

	public static void Somar(double n1, double n2) {
		double resultado = n1 + n2;
		// System.out.println("A soma eh igual a " + resultado);
		System.out.printf("A soma eh igual a %.2f%n", resultado);

	}

	public static void Subtrair(double n1, double n2) {
		double resultado = n1 - n2;
		System.out.printf("A subtracao eh igual a %.2f%n", resultado);

	}
	
	public static void Multiplicar(double n1, double n2) {
		double resultado = n1 * n2;
		System.out.printf("A multiplicacao eh igual a %.2f%n", resultado);

	}

	public static void Dividir(double n1, double n2) {
		double resultado = n1 / n2;
		System.out.printf("A divisao eh igual a %.2f%n", resultado);

	}


}
