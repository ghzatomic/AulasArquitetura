package br.com.caiopaulucci.padroesdeprojetos.bridge;
public class JanelaAviso extends JanelaAbstrata {
 
    public JanelaAviso(JanelaImplementada j) {
        super(j);
    }
 
    @Override
    public void desenhar() {
        desenharJanela("Janela de Aviso");
        desenharBotao("Ok");
    }
 
}