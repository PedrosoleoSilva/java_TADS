package Trabalho;

public class Combustivel {
    public String[] arrayCombustivel = new String[4];

    public Combustivel(){
        arrayCombustivel[0] = "Diesel";
        arrayCombustivel[1] = "Etanol";
        arrayCombustivel[2] = "Gasolina comum";
        arrayCombustivel[3] = "Gasolina aditivada";
    }
    public void listaCombustivel(){
        for (int i = 0; i< arrayCombustivel.length; i++){
            if (arrayCombustivel[i] != null){
                System.out.println("COD = "+i+" TIPO ="+arrayCombustivel[i]);
            }
        }
    }
    public String getTipoCombustivel(int cod){
       return arrayCombustivel[cod];
    }

}
