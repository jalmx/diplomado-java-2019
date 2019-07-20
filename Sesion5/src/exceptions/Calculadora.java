package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Bloque try-catch
//        try {
//            //aqui todo el codigo
//        } catch (Exception/*tipo de Exceptio*/ e /*de la exception*/) {
//            //aqui codigo que se ejecuta en caso que algo haya fallado 
//            //esto se ejecuta cuando sucede una Exception(Error)
//        }
        boolean salir;
        
        do {
            try {//inicia el bloque try
                System.out.println("Calculadora que solo divide");

                System.out.println("Dar un valor");
                int a = sc.nextInt();

                System.out.println("Dar el segundo valor");
                int b = sc.nextInt();

                double resultado = (double) a / b;

                System.out.println(resultado);

                salir = false;
                sc.close();

            } catch (InputMismatchException e) {//inicia el catch
//            e.printStackTrace();
                System.out.println("Solo se permiten digitos");
                System.out.println("Intente de nuevo");
                salir = true;
            }

        } while (salir);

    }

}
