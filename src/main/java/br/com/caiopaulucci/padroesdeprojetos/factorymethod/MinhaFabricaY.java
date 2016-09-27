package br.com.caiopaulucci.padroesdeprojetos.factorymethod;

/**
 * Esta classe concreta cont�m a implementa��o de uma aplica��o capaz de
 * manipular documentos do tipo MeuDocumento.
 */
class MinhaFabricaY implements Fabrica {

	/**
	 * Uma implementa��o do Factory Method. Este m�todo � especializado na
	 * cria��o de documentos do tipo MeuDocumento
	 */
	public Documento criaDocumento() {
		return new MeuDocumentoY();
	}
}
