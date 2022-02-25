package projetono;

public class ProgramNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		No<String> no01 = new No<>("Conteudo no01");
		No<String> no02 = new No<>("Conteudo no02");
		No<String> no03 = new No<>("Conteudo no03");
		No<String> no04 = new No<>("Conteudo no04");
		no01.setProximono(no02);
		no02.setProximono(no03);
		no03.setProximono(no04);
		// n01 -> no02 -> no03 -> no04 -> null
		
		System.out.println(no01);
		System.out.println(no01.getProximono());
		System.out.println(no02);
		
		System.out.println("\n---------------------------\n");
		System.out.println(no01);
		System.out.println(no01.getProximono());
		System.out.println(no01.getProximono().getProximono());
		System.out.println(no01.getProximono().getProximono().getProximono());
		System.out.println(no01.getProximono().getProximono().getProximono().getProximono());
		
		
	}

}
