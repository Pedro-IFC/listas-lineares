package atividade3;

public class TerceiraMain {

	public static void main(String[] args) {
		Terceira<Integer> t = new Terceira<Integer>();
		t.inserirInicio(2);
		t.inserirInicio(3);
		t.inserirInicio(4);
		t.inserirInicio(5);
		t.showList();
		System.out.println("Maior: " + t.maior());
		System.out.println("Menor: " + t.menor());
		System.out.println("Média: " + t.media());
	}
}
