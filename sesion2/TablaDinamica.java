import java.util.Scanner;

public class TablaDinamica{

    public static void main(String... args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Qué tabla quieres conocer?");
        int tabla = sc.nextInt();

        for(int x = 1; x<= 10; x++){
            int resultado = tabla * x;
            System.out.printf("%d x %d = %d\n",tabla, x, resultado);
        }

    }
}
