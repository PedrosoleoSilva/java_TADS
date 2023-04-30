package array;

public class ArrayCor {
    String[] listacor = new String[50];
    Integer quantidade =0;

    public void cadastraCor(String cor){
        listacor[quantidade] = cor;
        quantidade++;
    }
    public void listCor(){
        for (int i =0; i< listacor.length;i++){
            if(listacor[i] !=null){
                System.out.println("COD = "+i+""+listacor[i]);
            }

        }
    }
}
