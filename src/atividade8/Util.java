package atividade8;

import nodo.Nodo;

public class Util {
	public static <T extends Number> Fila<T> getPar(Fila<T> f){
		Fila<T> par = new Fila<T>(f.getLimite());
		if(!f.isEmpty()) {
			Nodo<T> aux = f.getInicial();
			do {
				if(aux.getDado().floatValue()%2==0)
					par.inserir(aux.getDado());
				aux = aux.getProx();
			}while(aux!=null);
		}
		return par;
	}
	public static <T extends Number> Fila<T> getImpar(Fila<T> f){
		Fila<T> impar = new Fila<T>(f.getLimite());
		if(!f.isEmpty()) {
			Nodo<T> aux = f.getInicial();
			do {
				if(aux.getDado().floatValue()%2!=0)
					impar.inserir(aux.getDado());
				aux = aux.getProx();
			}while(aux!=null);
		}
		return impar;
	}
}
