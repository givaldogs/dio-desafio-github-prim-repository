package listaEncadeada;

public class ListaEncadeada<T> {

	No<T> referenciaEntrada;

	public ListaEncadeada() {
		this.referenciaEntrada = null;
	}

	// @SuppressWarnings("unchecked")
	public void add(T conteudo) {
		No<T> novoNo = new No<>(conteudo);
//		System.out.println("novoNo -> " + novoNo);
		if (this.isEmpty()) {
			referenciaEntrada = novoNo;
			return;
		}

		No<T> noAuxiliar = referenciaEntrada;
//		System.out.println("antes do for--> " + this.size());
		for (int i = 0; i < this.size() - 1; i++) {
//			System.out.println("\n----I " + i + "--> " + this.size());
//			System.out.println(this.size() - 1 + "  menos");
			noAuxiliar = referenciaEntrada.getProximoNo();
		}
		noAuxiliar.setProximoNo(novoNo);
//		System.out.println("*** " + this.size());
	}

	public T get(int index) {
		return getNo(index).getConteudo();
	}

	private No<T> getNo(int index) {

		validaIndice(index);

		No<T> noAuxiliar = referenciaEntrada;
		No<T> noRetorno = null;
		for (int i = 0; i <= index; i++) {
			noRetorno = noAuxiliar;
			noAuxiliar = referenciaEntrada.getProximoNo();
		}
		return noRetorno;
	}

	public T remove(int index) {
		No<T> noPivor = this.getNo(index);
		if (index == 0) {
			referenciaEntrada = noPivor.getProximoNo();
			return noPivor.getConteudo();

		}
		No<T> noAnterior = this.getNo(index - 1);
		noAnterior.setProximoNo(noPivor.getProximoNo());
		return noPivor.getConteudo();

	}

	public int size() {
		int tamanhoLista = 0;

		No<T> referenciaAux = referenciaEntrada;

		while (true) {
			if (referenciaAux != null) {
 				tamanhoLista++;
				if (referenciaAux.getProximoNo() != null) {
					referenciaAux = referenciaAux.getProximoNo();
				} else {
					break;
				}

			} else {
				break;
			}

		}
		return tamanhoLista;
	}

	public boolean isEmpty() {
		return referenciaEntrada == null ? true : false;
	}

	private void validaIndice(int index) {
		if (index > size()) {
			int ultimoIndice = size() - 1;
			throw new IndexOutOfBoundsException("Nao existe conteudo no indice " + index + "desta lista "
					+ "Esta lista vai ate " + ultimoIndice + ".");

		}
	}

	@Override
	public String toString() {
		String strRetorno = "";
		No<T> noAuxiliar = referenciaEntrada;
		// System.out.println("referenciaEntrada => "+noAuxiliar);
		for (int i = 0; i < this.size(); i++) {
			// System.out.println("I = "+ i+" size =>"+this.size());
			strRetorno += "No{Conteudo= " + noAuxiliar.getConteudo() + "}--->";
			noAuxiliar = noAuxiliar.getProximoNo();
		}
		strRetorno += "null";

		return strRetorno;
	}

}
