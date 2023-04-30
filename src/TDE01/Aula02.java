package TDE01;

import java.util.Scanner;

public class Aula02 {
    public static void main(String[] args) { //deixa classe executavel//
        Scanner scanner = new Scanner(System.in); //para poder ler teclado
        double nota1, nota2, nota3 ,nota4, media; //variaveis//
        String nome;
        Calculadora calculadora = new Calculadora();

        System.out.println("Digite o seu nome");
        nome = scanner.next();
        System.out.println("Digite o valor da nota1 ");
        nota1 = scanner.nextDouble(); // sever para poder digitar no teclado
        System.out.println("Digite o valor da nota2 ");
        nota2 = scanner.nextDouble();
        System.out.println("Digite o valor da nota3 ");
        nota3 = scanner.nextDouble();
        System.out.println("Digite o valor da nota4 ");
        nota4 = scanner.nextDouble();

        media = calculadora.media(nota1,nota2,nota3,nota4);

        if(media >=70){
            System.out.println(nome+" Voce está Aprovado");
        }else if(media >= 65){
            System.out.println(nome+" Você está de Exame");
        }else if (media < 65){
            System.out.println(nome+" Você está Reprovado!");
        }

    }
}
