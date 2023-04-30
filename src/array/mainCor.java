package array;

import java.util.Scanner;

public class mainCor {
    public static void main(String[] args) {
        ArrayCor cor = new ArrayCor();

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++){
            System.out.println("Digite o nome cor");
            String cores = scanner.next();
            cor.cadastraCor(cores);
        }
        System.out.println("Cores Cadastradas");
        cor.listCor();
//
//        cor.cadastraCor("Azul");
    //   cor.listCor();
    }
}
