package interruptores;

import java.util.Scanner;

public class ProgramInterruptores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		for (i=0;i<=14;i++) {
			if (i==12) {
				break;
			}
			if (i%2==0) {
				System.out.println("multiplos de 2 ="+i);
			}
		}
		
		//***** BREAK
		System.out.println("\n\n****** Break ******\n\n");
		for (i=0;i<=14;i++) {
			if (i==12) {
				continue;
			}
			if (i%2==0) {
				System.out.println("multiplos de 2 ="+i);
			}
		}
		
		//**** desafio java iniciante
		
		Scanner leitor = new Scanner(System.in);
    	int N = leitor.nextInt();
    	int A = leitor.nextInt() + leitor.nextInt();
        //TODO: Complete o If com a condição que soluciona o problema.
    	if (    A > N    )
    		System.out.println("Deixa para amanha!");
    	else
    		System.out.println("Farei hoje!");
    	leitor.close();
    

	}

}
