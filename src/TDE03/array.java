package TDE03;

public class array {
    public static void main(String[] args) {
        int[] lista = new int[10];

        for (int i =0; i< lista.length;i++){
            lista[i] = i;
        }
        imprimi(lista);

    }
    static void imprimi(int[] lista){
        for (int i =0; i < lista.length; i++){
            System.out.println("Valor da posição "+i+" = "+lista[i]);
        }
    }

}
