package br.com.caiopaulucci.padroesdeprojetos.prototype;

public class Snippet {
	public static void main(String[] args) {
	    FiestaPrototype prototipoFiesta = new FiestaPrototype();
	 
	    CarroPrototype palioNovo = prototipoFiesta.clonar();
	    palioNovo.setValorCompra(27900.0);
	    CarroPrototype palioUsado = prototipoFiesta.clonar();
	    palioUsado.setValorCompra(21000.0);
	 
	    System.out.println(palioNovo.exibirInfo());
	    System.out.println(palioUsado.exibirInfo());
	}
}

