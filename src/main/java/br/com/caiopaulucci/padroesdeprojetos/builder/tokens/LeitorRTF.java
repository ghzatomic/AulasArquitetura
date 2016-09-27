package br.com.caiopaulucci.padroesdeprojetos.builder.tokens;

import java.util.ArrayList;
import java.util.List;

public class LeitorRTF {

	private ConversorTexto conversor;

	LeitorRTF(ConversorTexto c) {
		this.conversor = c;
	}

	public void lerRTF() {

		List<Token> tokens = new ArrayList<Token>(); // Recuperar os tokens

		for (Token t : tokens) {
			if (t.getTipo() == Token.Tipo.CARACTERE) {
				conversor.converterCaractere(t.getCaractere());
			}
			if (t.getTipo() == Token.Tipo.PARAGRAFO) {
				conversor.converterParagrafo();
			}
			if (t.getTipo() == Token.Tipo.FONTE) {
				conversor.converterFonte(t.getFonte());
			}
		}
	}
}