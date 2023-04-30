package fila;

import java.util.ArrayList;
import java.util.List;

public class Fila {
    public List<Pessoa> pessoas = new ArrayList<>();

    public void addFila(Pessoa pessoa){

        pessoas.add(pessoa);
    }
    public void removeFila(){
        if (!pessoas.isEmpty()){
            System.out.println();
            System.out.println("Item a ser removido"+pessoas.get(0));
            pessoas.remove(0);
        }else{
            System.out.println("Fila está vazia!");
        }

    }
    public void listaTudo(){
        pessoas.forEach(System.out::println);
    }
}
