package br.com.caiopaulucci.padroesdeprojetos.facade;
public class Cpu {

	public void start() {
		System.out.println("inicializa��o inicial");
	}
	public void execute() {
		System.out.println("executa algo no processador");
	}
	public void load() {
		System.out.println("carrega registrador");
	}
	public void free() {
		System.out.println("libera registradores");
	}
}

