package Trabalho;

public class Cor {
    public String[] cores = new String[10];

    public Cor(){
        cores[0] ="Azul calcinha";
        cores[1] ="Marrom";
        cores[2] ="Preto Brilhante";
        cores[3] ="Branco Fosco";
        cores[4] ="Rosa";
        cores[5] ="Vermelho";
        cores[6] ="Roxo";
    }
    public void ListarCoresCadastradas(){
        for (int i =0; i< cores.length;i++){
            if (cores[i] != null){
                System.out.println("COD = "+i+" COR = "+cores[i]);
            }
        }
    }
    public String getCor(int cod){

        return cores[cod];
    }



}
