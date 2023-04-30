package Trabalho;

import java.util.ArrayList;

public class Carro {

    public void setCor(String cor) {
        if( cor != null){
            this.cor = cor;
        }

    }

    public void setModelo(String modelo) {
//        if(modelo != null){
//            this.modelo = modelo;
//        }

    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }


    String cor;
    String modelo;
    String tipoCombustivel;
    String potencia;
    //Carro[] lista = new Carro[10];
    // public ArrayList<String> listacarros = new ArrayList<>();

}
