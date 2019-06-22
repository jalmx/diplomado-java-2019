public class Calificaciones{

    public static void main(String[] a){
        int calificacion = 11;

        if(calificacion < 6){
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
