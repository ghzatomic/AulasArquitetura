package br.com.caiopaulucci.padroesdeprojetos.builder.tokens;

public class Token {

	private Tipo tipo;
	private char caractere;
	private Fonte fonte;
	
	public static enum Tipo {
		CARACTERE,PARAGRAFO,FONTE;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public char getCaractere() {
		return caractere;
	}

	public void setCaractere(char caractere) {
		this.caractere = caractere;
	}

	public Fonte getFonte() {
		return fonte;
	}

	public void setFonte(Fonte fonte) {
		this.fonte = fonte;
	}
	
	
}
