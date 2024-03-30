package atividade7;
import nodo.NodoPrioritario;
public class Fila <T>{
	private NodoPrioritario<T> inicio;
	private NodoPrioritario<T> fim;
	private int limite;
	private int tamanho = 0;
	public void showList() {
		if(!isEmpty()) {
			NodoPrioritario<T> aux = inicio;
			int pos =0;
			do {
				System.out.println("["+pos+"]:"+ aux);
				aux = aux.getProx();
				pos++;
			}while(aux!=null);
		}
	}
	public NodoPrioritario<T> remover() {
		if(!isEmpty()) {
			tamanho--;
			NodoPrioritario<T> maiorPri = inicio;
			inicio = inicio.getProx();
			return maiorPri;
		}else {
			return null;
		}
	}
	public void inserir(T dado, int prioridade) {
		if(temEspaco()) {
			NodoPrioritario<T> novoItem = new NodoPrioritario<T>(dado, prioridade);
			if(isEmpty()) {
				inicio = novoItem;
				fim = novoItem;
			}else{
				if(inicio.getPrioridade()>novoItem.getPrioridade()) {
					NodoPrioritario<T> aux = inicio;
					while(aux.getPrioridade()>novoItem.getPrioridade() && aux.getProx()!=null){
						aux = aux.getProx();
					}
					novoItem.setProx(aux.getProx());
					aux.setProx(novoItem);
				}else {
					novoItem.setProx(inicio);
					inicio=novoItem;
				}
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
	public boolean isEmpty() {
		return tamanho==0;
	}
	public boolean temEspaco() {
		return limite>tamanho;
	}
	public void setInicio(NodoPrioritario<T> inicio) {
		this.inicio = inicio;
	}
	public NodoPrioritario<T> getFim() {
		return fim;
	}
	public void setFim(NodoPrioritario<T> fim) {
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
