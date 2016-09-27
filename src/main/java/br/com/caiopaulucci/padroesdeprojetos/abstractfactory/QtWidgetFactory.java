package br.com.caiopaulucci.padroesdeprojetos.abstractfactory;

public class QtWidgetFactory extends WidgetFactory {
	public Botao criarBotao() {
		return new BotaoQt();
	}
}