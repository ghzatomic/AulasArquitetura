package br.com.caiopaulucci.padroesdeprojetos.abstractfactory;

public abstract class WidgetFactory {
	public static WidgetFactory obterFactory() {

		if (Configuracao.obterInterfaceGraficaAtual() == ConfiguracoesDisponiveis.MotifWidget) {
			return new MotifWidgetFactory();
		} else {
			return new QtWidgetFactory();
		}
	}

	public abstract Botao criarBotao();
}