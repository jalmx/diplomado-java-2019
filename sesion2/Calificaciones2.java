import java.util.Scanner; //importando la lib Scanner para leer desde teclado

public class Calificaciones2{

    public static void main(String[] a){

        Scanner leer = new Scanner(System.in);//creando objeto Scanner
        int calificacion;

        System.out.println("Cuánto tuviste de calificación? ");
        calificacion = leer.nextInt();

        if(calificacion < 6 && calificacion >= 0){
            System.out.println("Lastima Margarito");
        }
        if(calificacion >= 6 && calificacion < 7){
            System.out.println("De panzazo");
        }
        if(calificacion >= 7 && calificacion < 8){
            System.out.println("Echale más punch");
        }
        if(calificacion >= 8 && calificacion < 9){
            System.out.println("Bien, puedes mejorar");
        }
        if(calificacion >= 9 && calificacion < 10){
            System.out.println("Muy bien, te falto tantito");
        }
        if(calificacion == 10){
            System.out.println("Excelente, con toda la actitud");
        }
        if(calificacion>10 || calificacion < 0){
            System.out.println("Calificación no posible");
        }
    }
}
