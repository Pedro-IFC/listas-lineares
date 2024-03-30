package atividade5;
import nodo.Nodo;
public class ListaEncadeada <T> {
	private Nodo<T> inicio;
	public void showListInvert(){
		showListInvert(inicio);
	}
	public void showListInvert(T dado){
		Nodo<T> aux = getFirstOcurrency(dado);
		if(aux==null) {
			return ;
		}
		showListInvert(aux.getProx());
		System.out.println("nodo: " + aux.getDado());
	}
	public void showListInvert(Nodo<T> aux){
		if(aux==null) {
			return ;
		}
		showListInvert(aux.getProx());
		System.out.println("nodo: " + aux.getDado());
	}
	public void showList(){
		if(!isEmpty()) {
			System.out.println("==========================");
			Nodo<T> nodoAtual = this.getInicio();
			while(nodoAtual!=null) {
				System.out.println("nodo: " + nodoAtual.getDado());
				nodoAtual=nodoAtual.getProx();
			}
		}else {
			System.out.println("==========================");
			System.out.println("Sem nada");
		}		
	}
	public int count() {
	 	int i=0;
	 	Nodo<T> nodoAtual = this.getInicio();
		while(nodoAtual!=null) {
			nodoAtual=nodoAtual.getProx();
			i++;
		}
		return i;
	}
	public void removeEnd() {
		Nodo<T> nodoFinal = this.getInicio();
		if(nodoFinal.getProx()!=null) {
			while(nodoFinal.getProx().getProx()!=null) {
				nodoFinal=nodoFinal.getProx();
			}
			nodoFinal.setProx(null);
		}else {
			this.setInicio(null);
		}
	}
	public void removeStart() {
		if(this.getInicio().getProx()!=null) {
			this.setInicio(this.getInicio().getProx());
		}else {
			this.setInicio(null);
		}
	}
	public void removeFirstOccurrenceByValue(T dado) {
		if(!isEmpty()) {
	        if(this.getInicio().getDado()==dado) {
	        	inicio = inicio.getProx();
	        }else {
	        	Nodo<T> aux = this.getInicio();
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
	public Nodo<T> getLastOcurrency(T dado) {
		Nodo<T> nodoAtual = this.getInicio();
		Nodo<T> find = null;
		while(nodoAtual!=null) {
			if(nodoAtual.getDado()==dado) {
				find = nodoAtual;
			}
			nodoAtual=nodoAtual.getProx();
		}
		return find;
	}
	public Nodo<T> getFirstOcurrency(T dado) {
		Nodo<T> nodoAtual = this.getInicio();
		while(nodoAtual!=null) {
			if(nodoAtual.getDado()==dado) {
				return nodoAtual;
			}
			nodoAtual=nodoAtual.getProx();
		}
		return null;
	}
	public void removeByValue(T dado) {
		if(!isEmpty()) {
			Nodo<T> nodoAtual = this.getInicio();
			Nodo<T> nodoAnterior = null;
	        while (nodoAtual != null) {
	            if (nodoAtual.getDado() == dado) {
	                if (nodoAnterior == null) {
	                    this.removeStart();
	                    nodoAtual = this.getInicio();
	                } else {
	                    nodoAnterior.setProx(nodoAtual.getProx());
	                    nodoAtual.setProx(null);
	                    nodoAtual = nodoAnterior.getProx();
	                }
	            } else {
	                nodoAnterior = nodoAtual;
	                nodoAtual = nodoAtual.getProx();
	            }
	        }
		}
	}
	public void insertEnd(T dado) {
		
		Nodo<T> nodoFinal = this.getInicio();
		if(nodoFinal!=null) {
			Nodo<T> novoNodo = new Nodo<T>(dado);
			while(nodoFinal.getProx()!=null) {
				nodoFinal=nodoFinal.getProx();
			}
			
			nodoFinal.setProx(novoNodo);
		}else {
			insertStart(dado);
		}
	}
	
	public void insertStart(T dado) {
		Nodo<T> novoNodo = new Nodo<T>(dado);
		novoNodo.setProx(getInicio());
		this.setInicio(novoNodo);
	}
	
	public ListaEncadeada() {
		this.inicio = null;
	}
	
	public boolean isEmpty() {
		return inicio ==null;
	}
	
	public Nodo<T> getInicio() {
		return inicio;
	}

	public void setInicio(Nodo<T> inicio) {
		this.inicio = inicio;
	}

	@Override
	public String toString() {
		return "ListaEncadeada [inicio=" + inicio + "]";
	}
	
}
