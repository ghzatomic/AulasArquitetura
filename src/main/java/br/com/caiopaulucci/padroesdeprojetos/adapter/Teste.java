package br.com.caiopaulucci.padroesdeprojetos.adapter;
public class Teste {

	public static void main(String args[]) {
		TomadaDeTresPinos t3 = new TomadaDeTresPinos();
		
		AdapterTomada a = new AdapterTomada(t3);
		a.ligarNaTomadaDeDoisPinos();
	}

}