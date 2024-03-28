package atividade2;

import nodo.Produto;

public class SegundaMain {

	public static void main(String[] args) {
		Produto p = new Produto(2, 2.34, 3);
		Produto p2 = new Produto(3, 20.0, 100);
		Segunda listC = new Segunda();
		listC.inserirInicio(p);
		listC.inserirInicio(p2);
		listC.showList();
		listC.aplicarDesconto(10.0);
		listC.showList();
		System.out.println("Nº de produtos com estoque maior do que 100: ");
		listC.countEstoqueBiggerThan(99);
	}

}
