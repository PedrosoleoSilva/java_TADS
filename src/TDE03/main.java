package TDE03;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();

        System.out.println("Digite o seu nome");
        pessoa.nome= scanner.next();
        System.out.println("Digite a sua idade");
        pessoa.idade = scanner.nextDouble();
        System.out.println("Digite o seu genero");
        pessoa.genero = scanner.next();
        System.out.println("Digite o seu cpf");
        pessoa.cpf = scanner.next();
        System.out.println("Digite o seu RG");
        pessoa.rg = scanner.next();

        System.out.println(pessoa.nome+"\n"+pessoa.idade+"\n"+pessoa.genero+"\n"+pessoa.cpf+"\n"+pessoa.rg);
    }
}
