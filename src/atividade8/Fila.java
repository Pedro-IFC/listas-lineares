package atividade8;
import nodo.Nodo;
public class Fila <T extends Number>{
	private Nodo<T> inicio;
	private Nodo<T> fim;
	private int limite;
	private int tamanho = 0;
	
	public void showList() {
		if(!isEmpty()) {
			Nodo<T> aux = inicio;
			int pos =0;
			do {
				System.out.println("["+pos+"]:"+ aux.getDado());
				aux = aux.getProx();
			}while(aux!=null);
		}
	}
	public T remover() {
		if(!isEmpty()) {
			T valor = inicio.getDado();
			inicio = inicio.getProx();
			tamanho--;
			if(isEmpty())
				fim = null;
			return valor;
		}else {
			return null;
		}
	}
	public void inserir(T dado) {
		if(temEspaco()) {
			Nodo<T> novoItem = new Nodo<T>(dado);
			if(isEmpty()) {
				inicio = novoItem;
				fim = novoItem;
			}else {
				fim.setProx(novoItem);
				fim=novoItem;
			}
			tamanho++;
		}
	}
	public T getInicio() {
		if(!isEmpty())
			return this.inicio.getDado();
		System.out.println("Está vazio");
		return null;
	}
	public Nodo<T> getInicial() {
		if(!isEmpty())
			return this.inicio;
		return null;
	}
	public boolean isEmpty() {
		return tamanho==0;
	}
	public boolean temEspaco() {
		return limite>tamanho;
	}
	public void setInicio(Nodo<T> inicio) {
		this.inicio = inicio;
	}
	public Nodo<T> getFim() {
		return fim;
	}
	public void setFim(Nodo<T> fim) {
		this.fim = fim;
	}
	public int getLimite() {
		return limite;
	}
	public void setLimite(int limite) {
		this.limite = limite;
	}
	public int getTamanho() {
		return tamanho;
	}
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	public Fila(int limite) {
		super();
		this.limite = limite;
	}
	
}
