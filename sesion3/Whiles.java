import java.util.Scanner;
public class Whiles{

    public static void main(String[] args){

        int tabla = 9;
        int count = 1;

        System.out.println("WHILE");
        while(count <= 10){
            System.out.println(tabla * count);
            count++;
        }
        System.out.println("--------------------");

        System.out.println("DO-WHILE");
        count = 1;
        do{
            System.out.println(tabla * count);
            count++;
        }while(count <= 10);

        System.out.println("-------------------------------");

        Scanner sc = new Scanner(System.in);
        System.out.println("Dar el valor de la tabla");
        tabla = sc.nextInt();
        System.out.println("Dar el limite de la tabla");
        int limit = sc.nextInt(); //recibo el límite de mi tabla
        count = 1; //reset al contador

        while(count <= limit){
            System.out.printf("%d X %d = %d\n", tabla, count, tabla * count);
            count++;
        }

    }
}
