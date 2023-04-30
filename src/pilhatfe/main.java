package pilhatfe;

public class main {
    public static void main(String[] args) {
        Pilha pilha = new Pilha();

        pilha.addfilmes(new Filme("01","01"));
        pilha.addfilmes(new Filme("02","02"));
        pilha.addfilmes(new Filme("03","03"));
        pilha.list();
        System.out.println();
        System.out.println();

        pilha.remove();
        pilha.list();







    }
}
