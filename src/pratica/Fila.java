package pratica;

import java.util.ArrayList;
import java.util.List;

public class Fila {
    public List<Pessoa> pessoas = new ArrayList<>();

    public void addpessoa(Pessoa pessoa){
        pessoas.add(pessoa);
    }
    public void remove(){
        pessoas.remove(0);
    }
    public void listar(){
        pessoas.forEach(System.out::println);
    }
}
