package pilhatfe;

import java.util.ArrayList;
import java.util.List;

public class Pilha {

    public List<Filme> lisfilmes = new ArrayList<>();

    public void addfilmes(Filme filmes){
        lisfilmes.add(filmes);
    }
    public void remove(){
        lisfilmes.remove(lisfilmes.size()-1);
    }
    public void list(){
        lisfilmes.forEach(System.out::println);
    }
}
