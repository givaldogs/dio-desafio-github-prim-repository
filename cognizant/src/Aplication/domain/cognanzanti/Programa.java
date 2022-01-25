package Aplication.domain.cognanzanti;

import Aplication.cognazanti.Calculadora;
import Aplication.cognazanti.Mensagem;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculadora.Somar(5, 10);
		Calculadora.Subtrair(1800, 80);
		Calculadora.Multiplicar(8, 7);
		Calculadora.Dividir(10, 5);

		System.out.println("------------------------------------------------------------------------------------");
		Mensagem.MsgDoDia(20);

	}
}
