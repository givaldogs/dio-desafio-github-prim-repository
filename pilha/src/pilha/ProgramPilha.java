package pilha;

public class ProgramPilha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pilha minhaPilha = new Pilha();
		minhaPilha.push(new No(01));
		minhaPilha.push(new No(02));
		minhaPilha.push(new No(03));
		minhaPilha.push(new No(04));
		minhaPilha.push(new No(05));
		minhaPilha.push(new No(06));
		System.out.println(minhaPilha);

		System.out.println(minhaPilha.pop());
		System.out.println(minhaPilha);
		
		minhaPilha.push(new No(99));
		System.out.println(minhaPilha);

	}

}
