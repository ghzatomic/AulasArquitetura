package br.com.caiopaulucci.padroesdeprojetos.bridge;
public class JanelaWindows implements JanelaImplementada {
 
    public void desenharJanela(String titulo) {
        System.out.println(titulo + " - Janela Windows");
    }
 
    public void desenharBotao(String titulo) {
        System.out.println(titulo + " - Bot�o Windows");
    }
 
}