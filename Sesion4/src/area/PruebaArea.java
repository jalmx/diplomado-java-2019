package area;


public class PruebaArea {

    public static void main(String[] args) {
        
        double radio = 3.4;
        
        double areaCirculo = Area.circulo(radio);
        double areaCirculo2 = Area.circulo2(radio);
        
        System.out.println("El área del circulo es: " + areaCirculo);
        System.out.println("El área del circulo es: " + areaCirculo2);
    }
    
}
