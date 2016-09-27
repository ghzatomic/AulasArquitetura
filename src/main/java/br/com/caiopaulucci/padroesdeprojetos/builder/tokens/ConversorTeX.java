package br.com.caiopaulucci.padroesdeprojetos.builder.tokens;

public class ConversorTeX extends ConversorTexto {
	public void converterCaractere(char c) {
		System.out.print("Caractere Tex");
	}

	public void converterParagrafo() {
		System.out.print("Paragrafo Tex");
	}

	public void converterFonte(Fonte f) {
		System.out.print("Fonte Tex");
	}
}
