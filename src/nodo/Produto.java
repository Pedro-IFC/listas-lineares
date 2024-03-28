package nodo;

public class Produto{
	private Produto prox;
	private int cod;
	private Double preco;
	private int estoque;
	public Produto getProx() {
		return prox;
	}
	public Produto(int cod, Double preco, int estoque) {
		super();
		this.cod = cod;
		this.preco = preco;
		this.estoque = estoque;
	}
	public void setProx(Produto prox) {
		this.prox = prox;
	}
	public int getCod() {
		return cod;
	}
	public void setCod(int cod) {
		this.cod = cod;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public int getEstoque() {
		return estoque;
	}
	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
	public String toString() {
		return "Produto [cod=" + cod + ", preco=" + preco + ", estoque=" + estoque + "]";
	}
}
