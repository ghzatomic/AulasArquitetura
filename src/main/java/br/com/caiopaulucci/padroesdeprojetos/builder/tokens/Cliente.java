package br.com.caiopaulucci.padroesdeprojetos.builder.tokens;

import java.util.List;

public class Cliente {

	public static void main(String[] args) {

		ConversorTexto conversor;
		if (args[0].equals("pdf")) {
			conversor = new ConversorPDF();
		} else if (args[0].equals("tex")) {
			conversor = new ConversorTeX();
		} else {
			conversor = new ConversorASCII();
		}
		LeitorRTF leitor = new LeitorRTF(conversor);

		leitor.lerRTF();
	}
}