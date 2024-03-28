package atividade4;

import nodo.Nodo;

public class Conjuntos {
	public static <T> ListaEncadeada<T> union(ListaEncadeada<T> l1, ListaEncadeada<T> l2) {
		ListaEncadeada<T> n = new ListaEncadeada<T>();
		Nodo<T> nodoAtual = l1.getInicio();
		while(nodoAtual!=null) {
			if(n.getLastOcurrency(nodoAtual.getDado())==null) {
				n.insertEnd(nodoAtual.getDado());
			}
			nodoAtual=nodoAtual.getProx();
		}
		nodoAtual = l2.getInicio();
		while(nodoAtual!=null) {
			if(n.getLastOcurrency(nodoAtual.getDado())==null) {
				n.insertEnd(nodoAtual.getDado());
			}
			nodoAtual=nodoAtual.getProx();
		}
		return n;
	}
	public static <T> ListaEncadeada<T> diff(ListaEncadeada<T> l1, ListaEncadeada<T> l2) {
		ListaEncadeada<T> n = new ListaEncadeada<T>();
		Nodo<T> nodoAtual = l1.getInicio();
		while(nodoAtual!=null) {
			if(l2.getLastOcurrency(nodoAtual.getDado())==null) {
				n.insertEnd(nodoAtual.getDado());
			}
			nodoAtual=nodoAtual.getProx();
		}
		nodoAtual = l2.getInicio();
		while(nodoAtual!=null) {
			if(l1.getLastOcurrency(nodoAtual.getDado())==null) {
				n.insertEnd(nodoAtual.getDado());
			}
			nodoAtual=nodoAtual.getProx();
		}
		return n;
	}
	public static <T> ListaEncadeada<T> inter(ListaEncadeada<T> l1, ListaEncadeada<T> l2) {
		ListaEncadeada<T> n = new ListaEncadeada<T>();
		Nodo<T> nodoAtual = l1.getInicio();
		while(nodoAtual!=null) {
			if(l2.getLastOcurrency(nodoAtual.getDado())!=null && n.getLastOcurrency(nodoAtual.getDado())==null) {
				n.insertEnd(nodoAtual.getDado());
			}
			nodoAtual=nodoAtual.getProx();
		}
		nodoAtual = l2.getInicio();
		while(nodoAtual!=null) {
			if(l1.getLastOcurrency(nodoAtual.getDado())!=null && n.getLastOcurrency(nodoAtual.getDado())==null) {
				n.insertEnd(nodoAtual.getDado());
			}
			nodoAtual=nodoAtual.getProx();
		}
		return n;
	}
}
