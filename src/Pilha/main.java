package Pilha;

public class main {
    public static void main(String[] args) {
        Pilha pilha = new Pilha();

        pilha.empilha(new Filme("Filme","Genero"));
        pilha.empilha(new Filme("Filme1","Genero1"));
        System.out.println();
        pilha.lista();

        System.out.println();
        System.out.println();

        pilha.remove();
        pilha.lista();
    }
}
