package br.com.caiopaulucci.padroesdeprojetos.factorymethod;

public class Main {

	public static void main(String[] args) {
		Fabrica appX = new MinhaFabricaX();
		Fabrica appY = new MinhaFabricaY();

		Documento doc = appX.criaDocumento();
		doc.gravar();

		doc = appY.criaDocumento();
		doc.gravar();

	}

}
