public class Aritmetica{

    public static void main(String[] perrito){
        int valor1 = 15;
        int valor2 = 4;

        int suma =  valor1 + valor2;//aquí estoy sumando
        int resta = valor1 - valor2;//aquí estoy restando
        int multiplicacion = valor1 * valor2;//aquí estoy multiplicando
        double division = (double)valor1 / (double)valor2;//aquí estoy dividiendo
        double residuo = (double) valor1 % (double)valor2;//aquí estoy obteniendo el residuo de la división
        // CASTING
        System.out.println("La suma de " + valor1 + " y " + valor2 + " es: "+ suma );
        System.out.println("La resta de " + valor1 + " y " + valor2 + " es: "+ resta );
        System.out.println("La multiplicación de " + valor1 + " y " + valor2 + " es: "+ multiplicacion );
        System.out.println("La division de " + valor1 + " y " + valor2 + " es: "+ division );
        System.out.println("El residuo de " + valor1 + " y " + valor2 + " es: "+ residuo );
    }
}
