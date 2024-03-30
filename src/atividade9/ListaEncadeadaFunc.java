package atividade9;

import nodo.NodoFuncionario;

public class ListaEncadeadaFunc {
	private NodoFuncionario inicio;
	public Double mediaSalario() {
		if(!this.isEmpty()) {
			Double sal = 0.00;
			NodoFuncionario nodoAtual = this.getInicio();
			int i = 0;
			while(nodoAtual!=null) {
				i++;
				sal += nodoAtual.getSalario();
				nodoAtual=nodoAtual.getProximo();
			}
			return sal/i;
		}
		return null;
	}
	public int countFuncMaiorSalario(Double sal) {
		if(!isEmpty()) {
			int i = 0;
			NodoFuncionario nodoAtual = this.getInicio();
			while(nodoAtual!=null) {
				if(nodoAtual.getSalario()>=sal) {
					i++;
				}
				nodoAtual=nodoAtual.getProximo();
			}
			return i;
		}else {
			return 0;
		}	
	}
	public void getFuncMaiorSalario(Double sal) {
		if(!isEmpty()) {
			System.out.println("==========================");
			NodoFuncionario nodoAtual = this.getInicio();
			while(nodoAtual!=null) {
				if(nodoAtual.getSalario()>=sal) {
					System.out.println("Func: " + nodoAtual);
				}
				nodoAtual=nodoAtual.getProximo();
			}
		}else {
			System.out.println("==========================");
			System.out.println("Sem nada");
		}	
	}
	public Double getMaiorSalario() {
		if(!this.isEmpty()) {
			Double sal = inicio.getSalario();
			NodoFuncionario nodoAtual = this.getInicio();
			while(nodoAtual!=null) {
				if(nodoAtual.getSalario()>sal)
					sal = nodoAtual.getSalario();
				nodoAtual=nodoAtual.getProximo();
			}
			return sal;
		}
		return null;
	}
	public void showList(){
		if(!isEmpty()) {
			System.out.println("==========================");
			NodoFuncionario nodoAtual = this.getInicio();
			while(nodoAtual!=null) {
				System.out.println("Func: " + nodoAtual);
				nodoAtual=nodoAtual.getProximo();
			}
		}else {
			System.out.println("==========================");
			System.out.println("Sem nada");
		}		
	}
	public int count() {
	 	int i=0;
		NodoFuncionario nodoAtual = this.getInicio();
		while(nodoAtual!=null) {
			nodoAtual=nodoAtual.getProximo();
			i++;
		}
		return i;
	}
	public void removeEnd() {
		NodoFuncionario nodoFinal = this.getInicio();
		if(nodoFinal.getProximo()!=null) {
			while(nodoFinal.getProximo().getProximo()!=null) {
				nodoFinal=nodoFinal.getProximo();
			}
			nodoFinal.setProximo(null);
		}else {
			this.setInicio(null);
		}
	}
	public void removeStart() {
		if(this.getInicio().getProximo()!=null) {
			this.setInicio(this.getInicio().getProximo());
		}else {
			this.setInicio(null);
		}
	}
	public void inserirFinal(String nome, Double salario) {
		
		NodoFuncionario nodoFinal = this.getInicio();
		if(nodoFinal!=null) {
			NodoFuncionario novoNodoFuncionario = new NodoFuncionario(nome, salario);
			while(nodoFinal.getProximo()!=null) {
				nodoFinal=nodoFinal.getProximo();
			}
			
			nodoFinal.setProximo(novoNodoFuncionario);
		}else {
			inserirInicio(nome, salario);
		}
	}
	
	public void inserirInicio(String nome, Double salario) {
		NodoFuncionario novoNodoFuncionario = new NodoFuncionario(nome, salario);
		novoNodoFuncionario.setProximo(getInicio());
		this.setInicio(novoNodoFuncionario);
	}
	
	public ListaEncadeadaFunc() {
		this.inicio = null;
	}
	
	public boolean isEmpty() {
		return inicio ==null;
	}
	
	public NodoFuncionario getInicio() {
		return inicio;
	}

	public void setInicio(NodoFuncionario inicio) {
		this.inicio = inicio;
	}

	@Override
	public String toString() {
		return "ListaEncadeada [inicio=" + inicio + "]";
	}
	
}
