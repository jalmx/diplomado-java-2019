public class Conversiones{

    public static void main(String[] args){
        //Conversión de pulgadas a centimetros

        double pulgadas = 1;
        double centimetros = 2.54;

        double cantidad = 5;//pulgadas

        double calculo = (cantidad * centimetros)/pulgadas;

        System.out.println("Conversión de pulgadas a centímetros");
        System.out.println(cantidad+ " pulgadas es en centimetros: " +calculo +"cm");
        System.out.println("---------------------");

        calculo = (cantidad * pulgadas)/centimetros;
        System.out.println("Conversión de centímetros a pulgadas");
        System.out.println(cantidad+ " cm es en pulgadas: " +calculo +"in");
    }
}
