package br.com.caiopaulucci.padroesdeprojetos.proxy;
import java.util.ArrayList;
import java.util.List;
 
public class ProxyExample {
      public static void main(String[] args) {
            List<Pessoa> pessoas = new ArrayList<Pessoa>();
           
            //Cria cada Proxy para encapsular o acesso a classe "PessoaImpl"
            pessoas.add(new ProxyPessoa("A"));
            pessoas.add(new ProxyPessoa("B"));
            pessoas.add(new ProxyPessoa("C"));
            
            System.out.println("Nome: " + pessoas.get(0).getNome()); // busca do banco de dados
            System.out.println("Nome: " + pessoas.get(1).getNome()); // busca do banco de dados
            System.out.println("Nome: " + pessoas.get(0).getNome()); // j� buscou esta pessoa... apenas retorna do cache...
            
            //A terceira pessoa nunca ser� consultada no banco de dados (melhor performance - lazy loading)
            System.out.println("Id da 3� - " + pessoas.get(2).getId());//pode imprimir o ID do objeto, e o proxy nao ser� inicializado.
      }
}