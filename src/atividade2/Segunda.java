package atividade2;
import nodo.Produto;
public class Segunda {
	private Produto inicial;
	private Produto fim;
	public void aplicarDesconto(Double desconto) {
		if(isEmpty())
			return ;
		desconto = (100-desconto)/100;
		Produto ProdutoAtual = this.getInicial();
		do {
			ProdutoAtual.setPreco(ProdutoAtual.getPreco()*desconto);
			ProdutoAtual=ProdutoAtual.getProx();
		}while(ProdutoAtual!=null && ProdutoAtual!=getInicial());
	}
	public void countEstoqueBiggerThan(int val) {
		if(isEmpty())
			return ;
		Produto ProdutoAtual = this.getInicial();
		do {
			ProdutoAtual=ProdutoAtual.getProx();
			if(ProdutoAtual.getEstoque()>val)
				System.out.println("["+ProdutoAtual.getCod()+"] " + ProdutoAtual.getEstoque());
		}while(ProdutoAtual!=null && ProdutoAtual!=getInicial());
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
			Produto ProdutoAtual = inicial;
			do {
				ProdutoAtual=ProdutoAtual.getProx();
			}while(ProdutoAtual.getProx()!=fim);
			ProdutoAtual.setProx(inicial);
			fim = ProdutoAtual;
		}
	}
	public void removerInicio() {
		if(isEmpty())
			return ;
		if(inicial==fim) {
			inicial =null;
			fim=null;
		}else {
			Produto atual = inicial.getProx();
			fim.setProx(atual);
			inicial = atual;
		}		
	}
	public int count() {
		if(isEmpty())
			return 0;
		Produto ProdutoAtual = this.getInicial();
		int order = 0;
		do {
			ProdutoAtual=ProdutoAtual.getProx();
			order++;
		}while(ProdutoAtual!=null && ProdutoAtual!=getInicial());
		return order;
	}
	
	public boolean isEmpty() {
		return inicial ==null;
	}
	public void showList(){
		if(!isEmpty()) {
			System.out.println("==========================");
			Produto ProdutoAtual = this.getInicial();
			int order = 0;
			do {
				System.out.println("Produto ["+order+"]: " + ProdutoAtual);
				ProdutoAtual=ProdutoAtual.getProx();
				order++;
			}while(ProdutoAtual!=getInicial());
		}else {
			System.out.println("==========================");
			System.out.println("Sem nada");
		}		
	}
	
	public void inserirFim(Produto novoProduto) {
		if(inicial==null) {
			inicial=novoProduto;
			inicial.setProx(inicial);
			fim = inicial;
		}else {
			fim.setProx(novoProduto);
			novoProduto.setProx(inicial);
			fim = novoProduto;
		}
	}
	public void inserirInicio(Produto novoProduto) {
		if(inicial==null) {
			inicial=novoProduto;
			inicial.setProx(inicial);
			fim = inicial;
		}else {
			novoProduto.setProx(inicial);
			inicial = novoProduto;
			fim.setProx(inicial);
		}
	}
	
	public Segunda() {
		inicial = null;
		fim = null;
	}
	public Produto getFim() {
		return fim;
	}

	public void setFim(Produto fim) {
		this.fim = fim;
	}

	public Produto getInicial() {
		return inicial;
	}
	public void setInicial(Produto inicial) {
		this.inicial = inicial;
	}
}
