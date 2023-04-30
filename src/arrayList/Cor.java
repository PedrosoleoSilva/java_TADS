package arrayList;

import java.util.ArrayList;

public class Cor {
    public ArrayList<String> listCor = new ArrayList<>();

    public void cadastraCor(String cor){

        listCor.add(cor);
    }
    public void lista(){
//        listCor.forEach(System.out::println); //forma 1

//        for(String cor : listCor){ //forma 2
//            System.out.println(cor);
//        }
        for (int i =0; i< listCor.size();i++){ //forma 3
            System.out.println(listCor.get(i));
        }
    }
    public void getCor(int cod){
        System.out.println(listCor.get(cod));
    }
    }

