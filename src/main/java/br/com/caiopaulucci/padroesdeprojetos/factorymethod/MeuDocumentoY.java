package br.com.caiopaulucci.padroesdeprojetos.factorymethod;

/**
 * Esta classe concreta cont�m a implementa��o de um tipo de documento
 * espec�fico.
 */
class MeuDocumentoY extends Documento {

	@Override
	void gravar() {
		System.out.println("Gravar personalizado Y");
	}

}