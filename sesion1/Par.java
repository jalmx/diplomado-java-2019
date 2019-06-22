public class Par{

    public static void main(String[] args){

        int valor = 17;

        int residuo =  valor % 2;

        if( residuo == 0){
            System.out.println(valor + " El valor es par");
        }

        if( residuo != 0){
            System.out.println(valor + " El valor es impar");
        }

        if(valor > 10){
            System.out.println(valor + " es mayor a 10");
        }
    }

}
