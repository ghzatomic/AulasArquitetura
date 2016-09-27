package br.com.caiopaulucci.padroesdeprojetos.proxy;
public class ProxyPessoa implements Pessoa {
      private String id;
 
      private Pessoa pessoa;//mesma interface
 
      public ProxyPessoa(String nome) {
            this.id = nome;
      }
 
      /**
       * M�todo comum da interface
       *
       * @see Pessoa#getNome()
       */
      public String getNome() {
            if (pessoa == null) {
                  //Apenas cria o objeto real quando chamar este m�todo
                  pessoa = PessoaDAO.getPessoaByID(this.id);
            }
            /** Delega para o objeto real **/
            return pessoa.getNome();
      }
 
      public String getId() {
            return this.id;
      }
}