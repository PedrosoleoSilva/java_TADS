package TDE03;

public class arrayObjeto {
    public static void main(String[] args) {
        Pessoa [] pessoas = new Pessoa[10]; //array de objeto
        Pessoa pessoa = new Pessoa();
        pessoa.nome = "Jose";
        pessoa.genero = "Mac";
        pessoa.idade = 23;
        pessoa.cpf = "123454321";
        pessoa.rg = "765432554";

        pessoas[0] = pessoa;

        Pessoa pessoa2 = new Pessoa();
        pessoa2.nome = "Leo";
        pessoa2.genero = "Masc";
        pessoa2.idade = 28;
        pessoa2.cpf = "9457892937";
        pessoa2.rg = "09875300034";
        pessoas[1] = pessoa2;


        for (int i = 0; i<pessoas.length; i++){
            pessoa = pessoas[i];
            System.out.println(pessoa.nome+ pessoa.idade);
        }
    }
}
