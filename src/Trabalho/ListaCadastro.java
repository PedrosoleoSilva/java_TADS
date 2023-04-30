package Trabalho;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaCadastro {
        Scanner scanner = new Scanner(System.in);
        public List<Carro> listcar = new ArrayList<>();

    public void inicia(){
        System.out.println("SEJA BEM VINDO AO SISTEMA DE CADASTRO DE CARROS");
        System.out.println("1-CADASTRAR UM NOVO CARRO      ||        2-LISTAR TODOS OS CARROS CADASTRADOS        ||       3- ENCERRAR");
        System.out.println("R = ");

        switch (scanner.nextInt()) {
            case 1: {
                cadastro();
                break;
            }
            case 2: {
                listaCarros();
                break;
            }
            case 3: {
                Fim();
                break;
            }
        }
    }
    public  void cadastro() {
        Carro carro = new Carro();
        Scanner scanner = new Scanner(System.in);
        Cor cor = new Cor();
        Combustivel tipoCombustivel = new Combustivel();
        Integer digite = 0;


        System.out.println("Qual modelo do seu Carro");
        System.out.println("R = ");
        carro.modelo = scanner.next();

        System.out.println("Digite a potencia do seu carro");
        System.out.println("R = ");
        carro.potencia = scanner.next();

        System.out.println("Digite o cod da cor do seu Carro");
        cor.ListarCoresCadastradas();
        System.out.println("R = ");
        carro.cor = cor.getCor(scanner.nextInt());

        System.out.println("Digite o cod do tipo de Combustivel");
        tipoCombustivel.listaCombustivel();
        System.out.println("R = ");
        carro.tipoCombustivel = tipoCombustivel.getTipoCombustivel(scanner.nextInt());



        System.out.println("Deseja salvar esse Cadastro");


        System.out.println("MODELO....................." + carro.modelo);
        System.out.println("POTENCIA..................."+carro.potencia);
        System.out.println("COR........................" + carro.cor);
        System.out.println("COMBUSTIVEL................" + carro.tipoCombustivel);
        System.out.println("1-SIM       ||        2-NÃO");
        digite = scanner.nextInt();

        if (digite == 1) {
            System.out.println("VEICULO FOI SALVO COM SUCESSO!");

           listcar.add(carro);
            inicia();
        } else if (digite == 2) {
            System.out.println("O VEICULO NÃO SERÁ SALVO!");
        }

    }
    public  void listaCarros() {
        for(Carro carro : listcar){
            if(carro != null){
                System.out.println("LISTA DOS ATRIBUTOS DOS CARROS");
                System.out.println("MODELO....................." + carro.modelo);
                System.out.println("POTENCIA..................."+carro.potencia);
                System.out.println("COR........................" + carro.cor);
                System.out.println("COMBUSTIVEL................" + carro.tipoCombustivel);
            }
            inicia();
        }
    }
    public  void Fim() {

        System.out.println("OBRIGADO PELA UTILIZAÇÃO DO SISTEMA.");
        System.out.println("SISTEMA FINALIZADO!");
    }
//    public void salva(){
//        Carro carro = new Carro();
//        for (int i =0; i<10 ;i++){
//            listacarros[i] = carro;
//        }
//    }
}