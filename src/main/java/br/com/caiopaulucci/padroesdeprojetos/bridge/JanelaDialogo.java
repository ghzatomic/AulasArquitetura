package br.com.caiopaulucci.padroesdeprojetos.bridge;
public class JanelaDialogo extends JanelaAbstrata {
 
    public JanelaDialogo(JanelaImplementada j) {
        super(j);
    }
 
    @Override
    public void desenhar() {
        desenharJanela("Janela de Di�logo");
        desenharBotao("Bot�o Sim");
        desenharBotao("Bot�o N�o");
        desenharBotao("Bot�o Cancelar");
    }
 
}