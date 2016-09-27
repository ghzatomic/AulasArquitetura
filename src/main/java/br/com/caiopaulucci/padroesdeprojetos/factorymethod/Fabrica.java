package br.com.caiopaulucci.padroesdeprojetos.factorymethod;

/**
 * Abstra��o de uma Fabrica capaz de Criar documentos.
 */
interface Fabrica {

	/**
	 * Abstra��o do Factory Method
	 */
	Documento criaDocumento();

}