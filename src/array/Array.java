package array;

public class Array {

    Integer[] array = new Integer[10];  //criar array
        public void addArray(){
//            array[0] =1;
//            array[1] =2;
//            array[2] =3;
//            array[3] =4;
//            array[4] =5;
//            array[5] =6;
//            array[6] =7;
//            array[7] =8;
//            array[8] =9;
//            array[9] =10;
            for(int i = 0; i < array.length; i++){
                array[i]= i+1;
            }
        }
        public void listaarray(){
            for (int i =0; i < array.length; i++){
                System.out.println("Valor do array = "+ array[i]);
            }
        }
        public Integer soma(Integer num1, Integer num2){
            int soma;
            soma = num1 + num2;
            return soma;
//            return num1 + num2; pode ser feito assim tambem
        }




}
