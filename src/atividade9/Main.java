package atividade9;

public class Main {
	public static void main(String[] args) {
		ListaEncadeadaFunc lf = new ListaEncadeadaFunc();
		lf.inserirInicio("Pedro", 2330.43);
		lf.inserirInicio("Igor", 2330.43);
		lf.inserirInicio("André", 1130.43);
		lf.inserirInicio("Daniel", 1930.43);
		lf.inserirFinal("Lucas", 1330.43);
		lf.showList();
		/*a) O nome do funcionário que tem o maior salário (em caso de empate
		mostrar todos quepossuem o referido salário);*/
		System.out.println("Maiores salarios: ");
		lf.getFuncMaiorSalario(lf.getMaiorSalario());
		/*b) A média salarial de todos os funcionários juntos;*/
		System.out.println("\nMédia salarial :" + lf.mediaSalario());
		/*c) A quantidade de funcionários com salário superior a um valor fornecido pelo usuário. Caso
		nenhum funcionário satisfaça essa condição, mostrar mensagem.*/
		System.out.println("\nQt de funcionarios com salario >1400" + lf.countFuncMaiorSalario(1400.00));
	}
}
