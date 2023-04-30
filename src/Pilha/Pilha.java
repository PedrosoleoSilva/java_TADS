package Pilha;

import java.util.ArrayList;
import java.util.List;

public class Pilha {
    public List<Filme> filmes = new ArrayList<>();
    public void empilha(Filme filme){

        filmes.add(filme);
    }
    public void remove(){

        filmes.remove(filmes.size()-1);
    }
    public void lista(){

        filmes.forEach(System.out::println);
    }

}
