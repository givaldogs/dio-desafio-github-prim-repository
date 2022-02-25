package fila;

public class ProgramFila {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Fila <String> minhaFila = new Fila<>();

		System.out.println("minhaFila " + minhaFila);

		minhaFila.enqueue("primeiro");
		minhaFila.enqueue("Segundo");
		minhaFila.enqueue("Terceiro");
		minhaFila.enqueue("Quarto");
		
		System.out.println(minhaFila);

		System.out.println("\n-----> dequeue " + minhaFila.dequeue());
		System.out.println("\n" + minhaFila);

		minhaFila.enqueue("Ultimo da Fila");
		System.out.println(minhaFila);
		

		System.out.println("\n-----> First " + minhaFila.first());
		System.out.println(minhaFila);
		


	}

}
