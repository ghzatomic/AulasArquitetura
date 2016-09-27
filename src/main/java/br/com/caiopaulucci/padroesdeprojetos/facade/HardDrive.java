package br.com.caiopaulucci.padroesdeprojetos.facade;
public class HardDrive {
	public String read(int startPosition, int size) {
		System.out.println("l� dados do HD");
		return "DADOS !! :D";
	}
	public void write(int position, String info) {
		System.out.println("escreve dados no HD");
	}
}

