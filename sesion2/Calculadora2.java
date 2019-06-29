import java.util.Scanner;

public class Calculadora2{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("1) Sumar");
        System.out.println("2) Restar");
        int opcion = sc.nextInt();

        switch(opcion){
            case 1:
                System.out.print("Dar valor 1: ");
                double valor1 = sc.nextDouble();
                System.out.print("Dar valor 2: ");
                valor1 = valor1 + sc.nextDouble();
                System.out.printf("La suma es: %.2f\n", valor1);
                break;
            case 2:
                System.out.print("Dar valor 1: ");
                double valor2 = sc.nextDouble();
                System.out.print("Dar valor 2: ");
                valor2 = valor2 - sc.nextDouble();
                System.out.printf("La resta es: %.2f\n", valor2);
                break;
            default:// es opcional 
            System.out.println("La opción no es posible");
        }
        System.out.println("Tuviste el privilegio de usar mi app ;)");
    }
}
