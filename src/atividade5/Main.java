package atividade5;

public class Main {

	public static void main(String[] args) {
		ListaEncadeada<Integer> l = new ListaEncadeada<Integer>();
		l.insertStart(1);
		l.insertStart(3);
		l.insertStart(5);
		l.insertStart(6);
		l.showList();
		System.out.println("==========================");
		l.showListInvert();
	}

}
