package ordemInversa;

public class ProgramOrdemInversa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] vetor = { -5, -6, 15, 50, 8, 4 };
		int i = 0;
		System.out.println("Tamanho do vetor eh " + vetor.length);
		while (i <= vetor.length-1) {
			System.out.println("Vetor[" + (i + 1) + "] " + vetor[i]);
			i++;
		}
		
		System.out.println("\n==== INVERSO =====\n");
				
		for(i=(vetor.length-1);i>=0;i--) {
			System.out.println("Vetor[" + i  + "] " + vetor[i]);
			
		}
		
	}
}
