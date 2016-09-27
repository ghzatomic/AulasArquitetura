package br.com.caiopaulucci.padroesdeprojetos.builder.nutricao;

public class InformacoesNutricionais {
	private int tamanhoPorcao;
	private int porcaoTotalDaEmbalagem;
	private int calorias;
	private int gorduraTotal;
	private int gorduraSaturada;
	private int gorduraTrans;
	private int sodio;
	private int colesterol;

	public InformacoesNutricionais(Builder builder) {
		tamanhoPorcao = builder.tamanhoPorcao;
		porcaoTotalDaEmbalagem = builder.porcaoTotalDaEmbalagem;
		calorias = builder.calorias;
		gorduraTotal = builder.gorduraTotal;
		gorduraSaturada = builder.gorduraSaturada;
		gorduraTrans = builder.gorduraTrans;
		sodio = builder.sodio;
		colesterol = builder.colesterol;
	}
	
	public static class Builder {
		// Parametros Obrigat�rios
		private final int tamanhoPorcao;
		private final int porcaoTotalDaEmbalagem;

		// Parametros Opcionais
		private int calorias;
		private int gorduraTotal;
		private int gorduraSaturada;
		private int gorduraTrans;
		private int sodio;
		private int colesterol;

		public Builder(int tamanhoPorcao,int porcaoTotalDaEmbalagem) {
			this.tamanhoPorcao = tamanhoPorcao;
			this.porcaoTotalDaEmbalagem = porcaoTotalDaEmbalagem;
		}

		public Builder calorias(int val) {
			calorias = val;
			return this;
		}

		public Builder gorduraTotal(int val) {
			gorduraTotal = val;
			return this;
		}

		public Builder gorduraSaturada(int val) {
			gorduraSaturada = val;
			return this;
		}

		public Builder gorduraTrans(int val) {
			gorduraTrans = val;
			return this;
		}

		public Builder sodio(int val) {
			sodio = val;
			return this;
		}

		public Builder colesterol(int val) {
			colesterol = val;
			return this;
		}
		
		public InformacoesNutricionais build(){
			return new InformacoesNutricionais(this);
		}

	}
	
}