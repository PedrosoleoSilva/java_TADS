package TDE01;

import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        Scanner scanner = new Scanner(System.in);

        int valor, valor2;

        System.out.println("Digite valor1");
        valor = scanner.nextInt();
        System.out.println("Digite valor1");
        valor2 = scanner.nextInt();

        calculadora.soma(valor,valor2);
    }
}
