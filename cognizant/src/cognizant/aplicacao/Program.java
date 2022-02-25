package cognizant.aplicacao;

import java.util.Scanner;

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
		
		int i1 = 10;
		int i2 = 20;
		
		Float f1 = 4.5f;
		Float f2 = 3.5f;
		
		
		System.out.println("i1 == i2 " + (i1==i2));
		System.out.println("i1 != i2 " + (i1!=i2));
		System.out.println("i1  > i2 " + (i1 > i2));
		System.out.println("i1 <= i2 " + (i1 <= i2));
		
		
		System.out.println("f1 == f2 " + (f1==f2));
		System.out.println("f1 != f2 " + (f1!=f2));
		System.out.println("f1  > f2 " + (f1 > f2));
		System.out.println("f1 <= f2 " + (f1 <= f2));
		System.out.println();
		
		int i, x, y, n, soma = 0;
		x =4;
		y =5;
		n =2;
		for (i =0; i<=n; i++) {
			System.out.println(" comeca ver numeros impares== "+i);
			
			
			while (x < y) {
				System.out.println("x "+ x);
				System.out.println("y "+ y);
				x += 1; 
				if(x %2 !=0) {
				 soma +=x;
						 
				}
				System.out.println("x "+ x);
				System.out.println("y "+ y);
			}
		}
		
		System.out.println("Soma igual a: " + soma);
			int nota1, nota2 = 0;
		boolean continua = true;
		Scanner sc = new Scanner(System.in);
		 while (continua) {
			System.out.println("Entre com a nota1 ");
			 nota1 = sc.nextInt();
			if (nota1 <1 || nota1> 10) {
				System.out.println("nota invalida");
			} else {
				System.out.println("Entre com a  nota2 ");
				 nota2 = sc.nextInt();
			}
			int media = (nota1 + nota2) / 6;
			 System.out.println("media da nota " + media);
			System.out.println("Novo Calculo 1-sim, 2-nao");
			int flag = sc.nextInt();
			if (flag == 2) {
				continua = false;
							
			}				
			}
		 
	}

}
