package nodo;

public class Nodo <T> {
	private T dado;
	private Nodo<T>  prox;
	public Nodo<T> getProx() {
		return prox;
	}
	public void setProx(Nodo<T> prox) {
		this.prox = prox;
	}
	public T getDado() {
		return dado;
	}
	public void setDado(T dado) {
		this.dado = dado;
	}
	public Nodo(T dado) {
		super();
		this.dado = dado;
	}
	public Nodo(T dado, Nodo<T> prox) {
		super();
		this.dado = dado;
		this.prox = prox;
	}
	public String toString() {
		return "Nodo [dado=" + dado + "]";
	}
}
