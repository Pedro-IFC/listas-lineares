package atividade3;
import nodo.Nodo;

public class Terceira <T extends Comparable<T>>{
	private Nodo<T> inicial;
	private Nodo<T> fim;
	public Float media() {
		if(inicial!=null) {
			int i=0;
			Nodo<T> aux = inicial;
			Float somaTotal=0f;
			do {
				somaTotal = somaTotal + Float.parseFloat(aux.getDado().toString());
				aux = aux.getProx();
				i++;
			}while(aux!=inicial);
			return somaTotal/i;
		}
		return null;
	}
	public T menor() {
		if(inicial!=null) {
			T menor = inicial.getDado();
			Nodo<T> aux = inicial;
			do {
				if(aux.getDado().compareTo(menor)<0)
					menor = aux.getDado();
				aux = aux.getProx();
			}while(aux!=inicial);
			return menor;
		}
		return null;
	}
	public T maior() {
		if(inicial!=null) {
			T maior = inicial.getDado();
			Nodo<T> aux = inicial;
			do {
				if(aux.getDado().compareTo(maior)>0)
					maior = aux.getDado();
				aux = aux.getProx();
			}while(aux!=inicial);
			return maior;
		}
		return null;
	}
	public int buscarNodo(T dado) {
		int pos=0;
		if(!isEmpty()) {
			Nodo<T> nodoAtual = this.getInicial();
			do {
				if(nodoAtual.getDado()==dado) {
					return pos;
				}
				nodoAtual=nodoAtual.getProx();
				pos++;
			}while(nodoAtual!=inicial);
		}
		return -1;
	}
	public void deleteComValor(T dado) {

		if(inicial==null) {
			return ;
		}else if(inicial.getDado()==dado) {
			removerInicio();
			return;
		}else{
			Nodo<T> aux = inicial;
			do {
				if(aux.getProx().getDado()==dado) {
					if(aux.getProx()==fim) {
						removerFim();
					}
					aux.setProx(aux.getProx().getProx());
					return;
				}
				aux=aux.getProx();
			}while(aux!=inicial);
		}
	}
	public void deleteAll() {
		inicial=null;
	}
	public void removerFim() {
		if(isEmpty())
			return ;
		
		if(inicial==fim) {
			inicial =null;
			fim=null;
		}else {
			Nodo<T> nodoAtual = inicial;
			do {
				nodoAtual=nodoAtual.getProx();
			}while(nodoAtual.getProx()!=fim);
			nodoAtual.setProx(inicial);
			fim = nodoAtual;
		}
		
			
	}
	public void removerInicio() {
		if(isEmpty())
			return ;
		if(inicial==fim) {
			inicial =null;
			fim=null;
		}else {
			Nodo<T> atual = inicial.getProx();
			fim.setProx(atual);
			inicial = atual;
		}		
	}
	public int count() {
		if(isEmpty())
			return 0;
		Nodo<T> nodoAtual = this.getInicial();
		int order = 0;
		do {
			nodoAtual=nodoAtual.getProx();
			order++;
		}while(nodoAtual!=null && nodoAtual!=getInicial());
		return order;
	}
	
	public boolean isEmpty() {
		return inicial ==null;
	}
	public void showList(){
		if(!isEmpty()) {
			System.out.println("==========================");
			Nodo<T> nodoAtual = this.getInicial();
			int order = 0;
			do {
				System.out.println("nodo ["+order+"]: " + nodoAtual.getDado());
				nodoAtual=nodoAtual.getProx();
				order++;
			}while(nodoAtual!=getInicial());
		}else {
			System.out.println("==========================");
			System.out.println("Sem nada");
		}		
	}
	
	public void inserirFim(T dado) {
		Nodo<T> novoNodo = new Nodo<T>(dado);
		if(inicial==null) {
			inicial=novoNodo;
			inicial.setProx(inicial);
			fim = inicial;
		}else {
			fim.setProx(novoNodo);
			novoNodo.setProx(inicial);
			fim = novoNodo;
		}
	}
	public void inserirInicio(T dado) {
		Nodo<T> novoNodo = new Nodo<T>(dado);
		if(inicial==null) {
			inicial=novoNodo;
			inicial.setProx(inicial);
			fim = inicial;
		}else {
			novoNodo.setProx(inicial);
			inicial = novoNodo;
			fim.setProx(inicial);
		}
	}
	
	public Terceira() {
		inicial = null;
		fim = null;
	}
	public Nodo<T> getFim() {
		return fim;
	}

	public void setFim(Nodo<T> fim) {
		this.fim = fim;
	}

	public Nodo<T> getInicial() {
		return inicial;
	}

	public void setInicial(Nodo<T> inicial) {
		this.inicial = inicial;
	}
	
}
