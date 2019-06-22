public class SegundaLey{
    public static void main(String[] args){
        //Ejercicio de la segunda ley de Newton

        // F = m a

        double masa = 2.5; //kg
        double acelaracion = 10; //m/s^2

        double fuerza = masa * acelaracion;//resolviendo el problema 1

        System.out.println("La fuerza resultante es: "+ fuerza + "N generada a partir de una masa de " + masa + "kg y  una aceleración de " + acelaracion + "m/s^2");

        System.out.println("--------------------------------");

        //segundo ejercicio
        acelaracion = 12.6;
        fuerza = masa * acelaracion;
        System.out.println("La fuerza resultante es: "+ fuerza + "N generada a partir de una masa de " + masa + "kg y  una aceleración de " + acelaracion + "m/s^2");
    }
}
