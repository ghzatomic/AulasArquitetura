package br.com.caiopaulucci.padroesdeprojetos.abstractfactory;

public class Cliente {
	public static void main(String[] args) {
		WidgetFactory factory = WidgetFactory.obterFactory();

		Botao botao = factory.criarBotao();
		botao.desenhar();
	}
}