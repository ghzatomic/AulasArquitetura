package br.com.caiopaulucci.padroesdeprojetos.proxy;
/**
 * Objeto real
 */
public class PessoaImpl implements Pessoa {
      private String nome;
      private String id;
 
      public PessoaImpl(String id,String nome) {
            this.id       = id;
            this.nome = nome;
            // apenas para simular algo...
            System.out.println("Retornou a pessoa do banco de dados ->  " + nome);
      }
 
      public String getNome() {
            return nome;
      }
      public String getId() {
            return this.id;
      }
}
 
