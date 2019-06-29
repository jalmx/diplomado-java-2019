import java.util.Scanner;

public class Calculadora{

    public static void main(String... args){
        Scanner sc = new Scanner(System.in);
        System.out.printf(
            "***** Calculadora *******\nElige una opción\n1)Suma\n2)Restar\n"
        );
        int opcion = sc.nextInt();

        if(opcion == 1){
            System.out.print("Dar valor 1: ");
            double valor1 = sc.nextDouble();
            System.out.print("Dar valor 2: ");
            valor1 = valor1 + sc.nextDouble();
            System.out.printf("La suma es: %.2f\n", valor1);
        }else if(opcion == 2){
            System.out.print("Dar valor 1: ");
            double valor1 = sc.nextDouble();
            System.out.print("Dar valor 2: ");
            valor1 = valor1 - sc.nextDouble();
            System.out.printf("La suma es: %.2f\n", valor1);
        }
        System.out.println("Gracias por usar nuestra app :)");
    }
}
