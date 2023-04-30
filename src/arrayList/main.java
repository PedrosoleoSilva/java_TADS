package arrayList;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Cor cor = new Cor();
        Scanner scanner = new Scanner(System.in);
        for(int i =0; i<4; i++){
            System.out.println("Qual a cor");
            cor.cadastraCor(scanner.next());
        }
        cor.lista();

        System.out.println("Digite o cod da cor");
        cor.getCor(scanner.nextInt());
    }


}
