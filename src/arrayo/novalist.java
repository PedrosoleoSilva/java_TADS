package arrayo;

import java.util.Scanner;

public class novalist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] list = new int[5];
        int maior=0;
        for (int i = 0; i < list.length; i++) {
            System.out.println("Digite");
            list[i] = scanner.nextInt();
        }
        for (int i =0; i<5; i++){
            if (i==0){
                maior = list[i];
            }
            if(maior < list[i]){
                maior = list[i];
            }
        }
        System.out.println("Maior ="+maior);
    }
}
