package atividade4;

public class Main {

	public static void main(String[] args) {
		ListaEncadeada<Integer> l = new ListaEncadeada<Integer>();
		l.insertStart(1);
		l.insertStart(3);
		l.insertStart(4);
		l.insertStart(2);
		l.insertStart(5);
		l.showList();
		ListaEncadeada<Integer> l2 = new ListaEncadeada<Integer>();
		l2.insertStart(2);
		l2.insertStart(7);
		l2.insertStart(3);
		l2.showList();
		System.out.println("União: ");
		Conjuntos.union(l, l2).showList();
		System.out.println("Diferença: ");
		Conjuntos.diff(l, l2).showList();
		System.out.println("Intersecção: ");
		Conjuntos.inter(l, l2).showList();
	}

}
