package Pilhatde;

public class main {
    public static void main(String[] args) {
        Pilha pilha = new Pilha();

        pilha.empilha(new Filme("filme1","genero1"));
        pilha.empilha(new Filme("filme2","genero2"));
        pilha.empilha(new Filme("filme3","genero3"));
        pilha.lista();
        System.out.println();
        System.out.println();
        pilha.desempilha();
        pilha.lista();
    }

}
