package listaEncadeada;

public class ProgramListaEncadeada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ListaEncadeada<String> minhaListaEncadeada = new ListaEncadeada<>();

		minhaListaEncadeada.add("teste1");  //0
		minhaListaEncadeada.add("teste2");  //1
		minhaListaEncadeada.add("teste3");  //2
		minhaListaEncadeada.add("teste4");  //3

		System.out.println(minhaListaEncadeada.get(0));
		System.out.println(minhaListaEncadeada.get(1));
		System.out.println(minhaListaEncadeada.get(2));
 		System.out.println(minhaListaEncadeada.get(3));

		System.out.println("\n" + minhaListaEncadeada);
//
	}

}
