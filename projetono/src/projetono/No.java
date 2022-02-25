package projetono;

public class No<T> {
	
	//private String conteudo;
	private T conteudo;
	private No<T> proximoNo;
	
	
	public No(T conteudo) {
		this.proximoNo = null;
		this.conteudo = conteudo;
	}


	public T getConteudo() {
		return conteudo;
	}


	public void setConteudo(T conteudo) {
		this.conteudo = conteudo;
	}


	public No<T> getProximono() {
		return proximoNo;
	}


	public void setProximono(No<T> proximoNo) {
		this.proximoNo = proximoNo;
	}


	@Override
	public String toString() {
		return "no [conteudo=" + conteudo + "]";
	}
	
	
	
	

}
