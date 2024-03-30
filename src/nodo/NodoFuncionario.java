package nodo;

public class NodoFuncionario {
	private String nome;
	private Double salario;
	private NodoFuncionario proximo;
	
	public NodoFuncionario(String nome, Double salario) {
		super();
		this.nome = nome;
		this.salario = salario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	public NodoFuncionario getProximo() {
		return proximo;
	}
	public void setProximo(NodoFuncionario proximo) {
		this.proximo = proximo;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("NodoFuncionario [nome=");
		builder.append(nome);
		builder.append(", salario=");
		builder.append(salario);
		builder.append("]");
		return builder.toString();
	}
	
}
