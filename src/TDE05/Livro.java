package TDE05;

import TDE03.Lista;

import java.util.Arrays;
import java.util.List;

public class Livro {
    String titulo;
    String editora;
    Livro[] lista = new Livro[10];
    int i =0;
    public Livro(String titulo, String editora){
        this.titulo = titulo;
        this.editora = editora;
    }
    public void add(Livro livro){
       lista[i] = livro;
       i++;
    }
    public  void list(){
        for (Livro livro : lista){
            if(livro != null){
                System.out.println(livro);
            }

        }
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", editora='" + editora + '\'' +
                ", lista="  +
                '}';
    }
}
