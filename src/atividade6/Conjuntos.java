package atividade6;

import nodo.Nodo;

public class Conjuntos {
	public static <T extends Comparable<T>> ListaCircular<T> union(ListaCircular<T> l1, ListaCircular<T> l2) {
		ListaCircular<T> n = new ListaCircular<T>();
		Nodo<T> nodoAtual = l1.getInicial();
		do {
			if(n.getLastOcurrency(nodoAtual.getDado())==null) {
				n.inserirFim(nodoAtual.getDado());
			}
			nodoAtual=nodoAtual.getProx();
		}while(nodoAtual!=l1.getInicial());
		nodoAtual = l2.getInicial();
		do {
			if(n.getLastOcurrency(nodoAtual.getDado())==null) {
				n.inserirFim(nodoAtual.getDado());
			}
			nodoAtual=nodoAtual.getProx();
		}while(nodoAtual!=l2.getInicial());
		return n;
	}
	public static <T extends Comparable<T>> ListaCircular<T> diff(ListaCircular<T> l1, ListaCircular<T> l2) {
		ListaCircular<T> n = new ListaCircular<T>();
		Nodo<T> nodoAtual = l1.getInicial();
		do {
			if(l2.getLastOcurrency(nodoAtual.getDado())==null) {
				n.inserirFim(nodoAtual.getDado());
			}
			nodoAtual=nodoAtual.getProx();
		}while(nodoAtual!=l1.getInicial());
		nodoAtual = l2.getInicial();
		do{
			if(l1.getLastOcurrency(nodoAtual.getDado())==null) {
				n.inserirFim(nodoAtual.getDado());
			}
			nodoAtual=nodoAtual.getProx();
		}while(nodoAtual!=l2.getInicial());
		return n;
	}
	public static <T extends Comparable<T>> ListaCircular<T> inter(ListaCircular<T> l1, ListaCircular<T> l2) {
		ListaCircular<T> n = new ListaCircular<T>();
		Nodo<T> nodoAtual = l1.getInicial();
		do{
			if(l2.getLastOcurrency(nodoAtual.getDado())!=null && n.getLastOcurrency(nodoAtual.getDado())==null) {
				n.inserirFim(nodoAtual.getDado());
			}
			nodoAtual=nodoAtual.getProx();
		}while(nodoAtual!=l1.getInicial());
		nodoAtual = l2.getInicial();
		do{
			if(l1.getLastOcurrency(nodoAtual.getDado())!=null && n.getLastOcurrency(nodoAtual.getDado())==null) {
				n.inserirFim(nodoAtual.getDado());
			}
			nodoAtual=nodoAtual.getProx();
		}while(nodoAtual!=l2.getInicial());
		return n;
	}
}
