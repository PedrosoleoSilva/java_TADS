package Estudo;

import java.util.Scanner;

public class Cargo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome;
        String cargo;
        Double salario;

        System.out.println("Qual é o seu nome");
        nome = scanner.next();
        System.out.println("Qual é o seu cargo");
        cargo = scanner.next();
        if(!cargo.equals("Analista")  & !cargo.equals("Desenvolvedor")  & !cargo.equals("Gerente")){
            System.out.println("DIGITE UM CARGO EXISTENTE");
        }
        System.out.println("Qual é o seu salario");
        salario = scanner.nextDouble();

        if(cargo.equals("Analista")){
            System.out.println("É um analista");
        }
        if(cargo.equals("Desenvolvedor")){
            System.out.println("É um desenvolvedor");
        }
        if(cargo.equals("Gerente")){
            System.out.println("É um gerennte");
        }

    }
}
