package atividade10;
import java.util.Random;
public class Main {
	public static void main(String[] args) {
		Random rand = new Random();
		ListaCircular<Integer> l1 = new ListaCircular<Integer>();
		for(int i=0; i<100; i++) {
			l1.inserirFim(rand.nextInt(50));
		}
		l1.showList();
		ListaCircular<Integer> l2 = l1.order(); 
		
		l2.showList();
	}
}
