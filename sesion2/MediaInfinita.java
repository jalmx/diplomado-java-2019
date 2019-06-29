import java.util.Scanner;

public class MediaInfinita{

    public static void main(String... a){
        Scanner sc = new Scanner(System.in);

        int total=0;
        double suma = 0;

        System.out.println("Para salir del programa dar el valor de \"-1\" ");

        for( ; ; ){ // for infinito
            System.out.printf("Dar el valor %d: ", total+1);
            double valor = sc.nextDouble();

            if(valor == -1){
                break;// rompo el for
            }

            suma +=valor;
            total++;
        }

        if(total != 0){
            double resultado = suma / total;
            System.out.printf("El resultado es %.2f\n", resultado);
        }else{
            System.out.printf("No hay datos\n");
        }

    }
}
