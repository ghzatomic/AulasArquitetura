package br.com.caiopaulucci.padroesdeprojetos.builder.tokens;

public class ConversorPDF extends ConversorTexto {
	public void converterCaractere(char c) {
		System.out.print("Caractere PDF");
	}

	public void converterParagrafo() {
		System.out.print("Par�grafo PDF");
	}

	public void converterFonte(Fonte f) {
		System.out.print("Fonte PDF");
	}
}
