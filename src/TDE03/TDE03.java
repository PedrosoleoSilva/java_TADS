package TDE03;

import java.util.Scanner;

public class TDE03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome;
        String cargo;
        double salario;

        System.out.println("Digite o seu nome ");
        nome=scanner.next();

        System.out.println("Digite o seu cargo ");
        cargo=scanner.next();

        if(cargo.equals("Analista") && cargo.equals("Desenvolvedor") && cargo.equals("Gerente")){
            System.out.println("Nao pode!");
        }

        System.out.println("Digite o seu salario ");
        salario = scanner.nextDouble();

        switch (cargo){
            case "Desenvolvedor" :{
                System.out.println("é um Desenvolvedor");
                salario= salario * 1.15;
                break;
            }
            case "Analista" :{
                System.out.println("é um Analista");
                salario= salario * 1.10;
                break;
            }
            case "Gerente" :{
                System.out.println("é um Gerente");
                salario= salario * 1.05;
                break;
            }
        }
//        if(cargo.equalsIgnoreCase("Desenvolvedor")){
//            System.out.println("é um Desenvolvedor");
//            salario= salario * 1.15;
//        } else if(cargo.equalsIgnoreCase("Analista")){
//            System.out.println("é um Analista");
//            salario= salario * 1.10;
//        }else if(cargo.equalsIgnoreCase("Gerente")){
//            System.out.println("é um Gerente");
//            salario= salario * 1.05;
//        }
        System.out.println("O "+nome+ " tem o salario atual "+salario);

    }
}
