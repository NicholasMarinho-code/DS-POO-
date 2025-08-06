package pessoa;
public class Main_Pessoa {
    public static void main(String[] args) {
        
        Pessoa pessoa = new Pessoa();
        pessoa.idPessoa =1;
        pessoa.nome = "Nicholas";
        pessoa.idade = 16;
        pessoa.profissao = "Estudante";
        
        System.out.println("-------- Classe Pessoa ---------");
        System.out.println("-------- Número Identificador ---------" + pessoa.idPessoa);
        System.out.println("-------- Nome ---------" + pessoa.nome);
        System.out.println("-------- Idade ---------" + pessoa.idade );
        System.out.println("-------- profissao ---------" + pessoa.profissao);
        pessoa.estudar();                
     
        
        pessoa.idPessoa =2;
        pessoa.nome = "Jhonatan";
        pessoa.idade = 10;
        pessoa.profissao = "Escravo Junior";
        
        System.out.println("-------- Classe Pessoa ---------");
        System.out.println("-------- Número Identificador ---------" + pessoa.idPessoa);
        System.out.println("-------- Nome ---------" + pessoa.nome);
        System.out.println("-------- Idade ---------" + pessoa.idade );
        System.out.println("-------- profissao ---------" + pessoa.profissao);
        pessoa.trabalhar(); 
        
                
        pessoa.idPessoa =3;
        pessoa.nome = "Joseph";
        pessoa.idade = 39;
        pessoa.profissao = "Dinossauro";
        
        System.out.println("-------- Classe Pessoa ---------");
        System.out.println("-------- Número Identificador ---------" + pessoa.idPessoa);
        System.out.println("-------- Nome ---------" + pessoa.nome);
        System.out.println("-------- Idade ---------" + pessoa.idade );
        System.out.println("-------- profissao ---------" + pessoa.profissao);
        pessoa.falar(); 
    }
    
}
