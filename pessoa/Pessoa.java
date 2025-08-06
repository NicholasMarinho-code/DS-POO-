package pessoa;
public class Pessoa {
   
    //Atributos
    
    int idPessoa;
   String nome;
   int idade;
   String profissao;

   //Métodos
   
   public void falar(){
       System.out.println("A " + nome + " esta falando"  );
   }
      public void trabalhar(){
       System.out.println("A " + nome + " esta trabalhando"  );
   }
         public void estudar(){
       System.out.println("A " + nome + " esta estudando"  );
   }
}
