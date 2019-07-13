
package area;

public class Area {
    
    public static final double PI = 3.1416;
    
    private Area(){
        
    }
    
    public static double cuadrado(double lado){
        return Math.pow(lado, 2);
    }
    
    public static double circulo(double radio){
        double area = Math.PI * Math.pow(radio, 2);
        return area;
    }
    
    public static double circulo2(double radio){
        double area = Area.PI * Math.pow(radio, 2);
        return area;
    }
    
    public static double rectangulo(double base, double altura){
        return base * altura;
    }
}
