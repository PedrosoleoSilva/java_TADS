package tdefila;

public class main {
    public static void main(String[] args) {
        Fila fila = new Fila();
        fila.addFila(new Pessoa("ze","14752225500"));
        fila.addFila(new Pessoa("ze1","14752225500"));
        fila.addFila(new Pessoa("ze2","14752225500"));
        fila.listaTudo();
        System.out.println();
        System.out.println();
        fila.removeFila();
        fila.listaTudo();
    }
}
