import java.util.Scanner;

public class Media{

    public static void main(String... a){
        Scanner sc = new Scanner(System.in);

        System.out.println("Cuántos datos tienes?");
        int total = sc.nextInt();

        double suma = 0;

        for(int x =0; x < total; x++){
            System.out.printf("Dar el valor %d: ", x+1);
            suma += sc.nextDouble();
        }

        double resultado = suma / total;

        System.out.printf("El resultado es %.2f\n", resultado);
    }
}
