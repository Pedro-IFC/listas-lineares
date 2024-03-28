package atividade1;
import nodo.Nodo;

public class Primeira <T extends Comparable<T>>{
	private Nodo<T> start = null;
	public void removeEnd() {
		Nodo<T> nodoFinal = start;
		if(nodoFinal.getProx()!=null) {
			while(nodoFinal.getProx().getProx()!=null) {
				nodoFinal=nodoFinal.getProx();
			}
			nodoFinal.setProx(null);
		}else {
			this.setStart(null);
		}
	}
	public void removeStart() {
		if(start.getProx()!=null) {
			this.setStart(start.getProx());
		}else {
			this.setStart(null);
		}
	}
	public void removeFirstOccurrenceByValue(T dado) {
		if(!isEmpty()) {
	        if(start.getDado()==dado) {
	        	start = start.getProx();
	        }else {
	        	Nodo<T> aux = start;
	        	while(aux.getProx()!=null) {
	        		if(aux.getProx().getDado()==dado) {
		        		aux.setProx(aux.getProx().getProx());
	        		}
	        		if(aux.getProx()!=null) {
			        	aux=aux.getProx();
	        		}
	        	}
	        }
		}
	}
	public void getBy(T dado) {
		if(!isEmpty()) {
			Nodo<T> aux = start;
			int i = 0;
			do {
				if(aux.getDado().equals(dado))
					System.out.println("    Index: "+i+", value: "+aux);
				aux = aux.getProx();
				i++;
			}while(aux!=null);
		}
	}
	public int countBy(T dado) {
		int i = 0;
		if(!isEmpty()) {
			Nodo<T> aux = start;
			do {
				T auxd = aux.getDado();
				if(auxd.compareTo(dado)==0)
					i++;
				aux = aux.getProx();
			}while(aux!=null);
		}
		return i;
	}
	public int countBiggerThan(T dado) {
		int i = 0;
		if(!isEmpty()) {
			Nodo<T> aux = start;
			do {
				if(aux.getDado().compareTo(dado)>0)
					i++;
				aux = aux.getProx();
			}while(aux!=null);
		}
		return i;
	}
	public int count() {
		int i = 0;
		if(!isEmpty()) {
			Nodo<T> aux = start;
			do {
				aux = aux.getProx();
				i++;
			}while(aux!=null);
		}
		return i;
	}
	public void list() {
		System.out.println("==========================================");
		if(!isEmpty()) {
			Nodo<T> aux = start;
			do {
				System.out.println(aux);
				aux = aux.getProx();
			}while(aux!=null);
		}else {
			System.out.println("Lista vazia");
		}
	}
	public void add(Nodo<T> nodo) {
		if(!isEmpty()){
			Nodo<T> aux = start;
			while(aux.getProx()!=null) {
				aux = aux.getProx();
			}
			aux.setProx(nodo);
		}else {
			this.setStart(nodo);
		}
	}
	public void add(T dado) {
		Nodo<T> nodo = new Nodo<T>(dado);
		if(!isEmpty()){
			Nodo<T> aux = start;
			while(aux.getProx()!=null) {
				aux = aux.getProx();
			}
			aux.setProx(nodo);
		}else {
			this.setStart(nodo);
		}
	}
	public Primeira() {
	}
	public boolean isEmpty() {
		return start==null;
	}
	public Primeira(T dado) {
		this.start = new Nodo<T>(dado);
	}

	public Primeira(Nodo<T> start) {
		this.start = start;
	}

	public Nodo<T> getStart() {
		return start;
	}

	public void setStart(Nodo<T> start) {
		this.start = start;
	}
	
}
