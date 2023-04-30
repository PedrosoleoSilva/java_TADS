package estudos;

import java.util.ArrayList;
import java.util.List;

public class fila {
    public List<Pessoa> pessoas = new ArrayList<>();
    public void add(Pessoa pessoa){
        pessoas.add(pessoa);
    }
    public void remove(){
        pessoas.remove(0);
    }
    public void lista(){
        pessoas.forEach(System.out::println);
    }
}
