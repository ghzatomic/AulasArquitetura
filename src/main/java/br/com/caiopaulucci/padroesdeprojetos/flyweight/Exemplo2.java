package br.com.caiopaulucci.padroesdeprojetos.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Exemplo2 {
	
	List<String> lista = null;

	public List<String> getLista() {
		if (lista == null){
			lista = new ArrayList<String>();
		}
		return lista;
	}

	public void setLista(List<String> lista) {
		this.lista = lista;
	}
	
}
