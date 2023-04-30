package fila;

public class main {
    public static void main(String[] args) {
        Fila fila = new Fila();

        fila.addFila(new Pessoa("ZE","1234543"));

        System.out.println();
        fila.listaTudo();

        fila.addFila(new Pessoa("ZE2","1234543"));
        fila.addFila(new Pessoa("ZE3","1234543"));
        System.out.println();

        fila.listaTudo();

        fila.removeFila();
        fila.listaTudo();
    }
}
