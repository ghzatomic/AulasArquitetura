package br.com.caiopaulucci.padroesdeprojetos.abstractfactory;

public class MotifWidgetFactory extends WidgetFactory {
	public Botao criarBotao() {
		return new BotaoMotif();
	}
}