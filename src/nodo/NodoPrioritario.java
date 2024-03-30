package nodo;

public class NodoPrioritario <T> {
	private int prioridade;
	private T dado;
	private NodoPrioritario<T>  prox;
	
	public NodoPrioritario(T dado) {
		this.dado = dado;
	}
	public NodoPrioritario(T dado, int prioridade) {
		this.dado = dado;
		this.prioridade=prioridade;
	}
	public NodoPrioritario(T dado, NodoPrioritario<T> prox, int prioridade) {
		this.dado = dado;
		this.prox = prox;
		this.prioridade=prioridade;
	}
	public int getPrioridade() {
		return prioridade;
	}
	public void setPrioridade(int prioridade) {
		this.prioridade = prioridade;
	}
	public NodoPrioritario<T> getProx() {
		return prox;
	}
	public void setProx(NodoPrioritario<T> prox) {
		this.prox = prox;
	}
	public T getDado() {
		return dado;
	}
	public void setDado(T dado) {
		this.dado = dado;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("NodoPrioritario [prioridade=");
		builder.append(prioridade);
		builder.append(", dado=");
		builder.append(dado);
		builder.append("]");
		return builder.toString();
	}
}
