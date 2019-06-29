import java.util.Scanner;

public class Media2{

    public static void main(String... a){
        Scanner sc = new Scanner(System.in);

        System.out.println("Cuántos datos tienes?");
        int total = sc.nextInt();

        double suma = 0;

        double datos[] = new double[total];

        for(int x =0; x < total; x++){
            System.out.printf("Dar el valor %d: ", x+1);
            double valor = sc.nextDouble();
            suma += valor;
            datos[x] = valor;
        }

        double media = suma / total;

        double sumDev = 0;
        for(int x =0; x< datos.length; x++){
            sumDev += Math.pow( datos[x]- media, 2 );
        }
        
        double desviacion = Math.sqrt(sumDev / datos.length);

        System.out.printf("La media es %.2f\n", media);
        System.out.printf("La desviación es %.2f\n", desviacion);
    }
}
