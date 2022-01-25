package cognizant.aplicacao;

import cognizant.aplicacao.dominio.Calculadora;
import cognizant.aplicacao.dominio.Mensagem;

public class Program {
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
