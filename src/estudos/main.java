package estudos;

public class main {
    public static void main(String[] args) {
        fila fila = new fila();

        fila.add(new Pessoa("Leo","1234565432"));
        fila.add(new Pessoa("cassio","1234565432"));
        fila.add(new Pessoa("ronaldo","1234565432"));
        fila.lista();
        System.out.println();
        System.out.println();

        fila.remove();
        fila.lista();
    }



}
