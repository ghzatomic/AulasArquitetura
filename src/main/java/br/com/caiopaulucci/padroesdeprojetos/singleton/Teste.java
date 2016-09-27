package br.com.caiopaulucci.padroesdeprojetos.singleton;

public class Teste {

	public static void main(String[] args) {
	    System.out.println(FabricaDeCarro.getInstancia().criarCarroFiat());
	    System.out.println(FabricaDeCarro.getInstancia().criarCarroFord());
	    System.out.println(FabricaDeCarro.getInstancia().criarCarroVolks());
	    System.out.println(FabricaDeCarro.getInstancia().criarCarroVolks());
	    System.out.println(FabricaDeCarro.getInstancia().criarCarroVolks());
	    System.out.println(FabricaDeCarro.getInstancia().criarCarroVolks());
	    System.out.println(FabricaDeCarro.getInstancia().gerarRelatorio());
	}
}
