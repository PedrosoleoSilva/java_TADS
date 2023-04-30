package arrayo;

import java.util.Scanner;

public class ted00 {
    public static void main(String[] args) {
        int [] lista = new int[5];
        Scanner scanner = new Scanner(System.in);

        for (int i =0; i< lista.length;i++){
            System.out.println("Digite um valor");
            lista[i] = scanner.nextInt();
        }
        for (int i : lista) {
            System.out.println(i);
        }
        for(int i = lista.length-1; i>=0; i--){
            System.out.println(i+1);
        }

    }
}
