package atividade6;

public class Main {

	public static void main(String[] args) {
		System.out.println("Lista 1: ");
		ListaCircular<Integer> l = new ListaCircular<Integer>();
		l.inserirFim(2);
		l.inserirFim(1);
		l.inserirFim(25);
		l.inserirFim(8);
		l.showList();
		l.order();
		l.showList();
		
		System.out.println("Lista 2: ");
		ListaCircular<Integer> l2 = new ListaCircular<Integer>();
		l2.inserirFim(8);
		l2.inserirFim(39);
		l2.inserirFim(45);
		l2.inserirFim(2);
		l2.showList();
		l2.order();
		l2.showList();
		
		System.out.println("União: ");
		ListaCircular<Integer> u = Conjuntos.union(l2, l);
		u.showList();
		System.out.println("União ordenada: ");
		u.order();
		u.showList();
	}

}
