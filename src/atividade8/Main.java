package atividade8;

public class Main {

	public static void main(String[] args) {
		Fila<Integer> f = new Fila<Integer>(7);
		f.inserir(2);
		f.inserir(2);
		f.inserir(3);
		f.inserir(7);
		System.out.println("Pares: ");
		Util.getPar(f).showList();
		System.out.println("Impares: ");
		Util.getImpar(f).showList();
	}

}
