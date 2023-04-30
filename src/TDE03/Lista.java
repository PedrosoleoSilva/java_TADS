package TDE03;

import java.util.ArrayList;
import java.util.List;

public class Lista {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("Azul");
        lista.add("Verde");

        lista.stream().forEach(System.out::println);
        System.out.println();
        System.out.println();
        lista.remove(1);
        lista.stream().forEach(System.out::println);
    }
}
