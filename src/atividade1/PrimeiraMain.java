package atividade1;

import nodo.Nodo;
/*
 *Construa um algoritmo que receba, como parâmetro, o endereço do primeiro do nodo 
 *de uma lista encadeada e um valor.
 * O algoritmo deve retornar: 
 * o número total de nodos da lista;
 * o número de nodos da lista que possuem em seu conteúdo o valor passado como parâmetro e sua  respectiva posição 
 * na lista; 
 * e o número de nodos que possuem em seu conteúdo valores maiores do 
 * que o valor passado como parâmetro.
 */
public class PrimeiraMain {

	public static void main(String[] args) {
		Nodo<Integer> n = new Nodo<Integer>(1);
		Primeira<Integer> p = new Primeira<Integer>();
		p.add(n);
		p.add(2);
		p.add(3);
		p.add(2);
		System.out.println("Nº Total de nodos: [" + p.count() + "]");
		System.out.println("Nº Total de nodos > 2: [" + p.countBiggerThan(2) + "]");
		System.out.println("Nodos iguais a 2: { ");
		p.getBy(2);
		System.out.println("}");
	}

}
