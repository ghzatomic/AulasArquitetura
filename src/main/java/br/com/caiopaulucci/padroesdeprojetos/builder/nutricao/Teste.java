package br.com.caiopaulucci.padroesdeprojetos.builder.nutricao;

public class Teste {

	public static void main(String[] args) {
		
		InformacoesNutricionais infosnutri = new InformacoesNutricionais.Builder(200,8)
		.calorias(100)
		.gorduraTotal(30)
		.gorduraSaturada(50)
		.gorduraTrans(100)
		.sodio(35)
		.colesterol(100)
		.build();
		
	}

}
