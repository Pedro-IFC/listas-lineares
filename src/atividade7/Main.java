package atividade7;

public class Main {

	public static void main(String[] args) {
		Fila<Integer> f = new Fila<Integer>(10);
		f.inserir(4, 1);
		System.out.println("============");
		f.inserir(4, 0);
		f.inserir(4, 2);
		f.inserir(4, 3);
		f.inserir(4, 5);
		f.inserir(4, 1);
		f.inserir(4, -1);
		f.showList();
		System.out.println("Item removido: " + f.remover());
		System.out.println("============");
		f.showList();
		System.out.println("Item removido: " + f.remover());
		System.out.println("============");
		f.showList();
	}

}
