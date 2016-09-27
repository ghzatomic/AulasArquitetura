package br.com.caiopaulucci.padroesdeprojetos.factorymethod;

/**
 * Esta classe concreta cont�m a implementa��o de um tipo de documento
 * espec�fico.
 */
class MeuDocumentoX extends Documento {

	void gravar() {
		System.out.println("Gravar personalizado X");
	}

}