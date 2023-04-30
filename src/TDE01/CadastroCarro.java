package TDE01;

public class CadastroCarro {
    public static void main(String[] args) {
        Carro carro = new Carro(); //faz instaciamneto da classe carro segundo nome e de uma variavel(carro)

        carro.Cor = "Vermeçho"; //acesso ao objeto da classe carro
        carro.nrPortas = 4;
        carro.potencia = 2.0;

     imprimi(carro);
    }

    static void imprimi(Carro carro){ //metodo, dentro(passa o objeto)
        System.out.println("Carro da cor = "+carro.Cor+" com "+carro.nrPortas+" " +
                "portas"+" e a potencia "+carro.potencia);
    }


}
