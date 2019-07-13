
package estatico;

public class LeyOhm {
    
    //NO SE NECESITA CREAR UN INSTANCIA PARA OCUPAR EL MÉTODO
    
    public static double PI = 3.1416;
    private static int valor = 1;
    private int valor2 = 1;
    
    
    public static void calcularVoltaje(double corriente, double resistencia){
        System.out.println("El voltaje es " + corriente * resistencia );
    }   
    
    public void algo(){
        System.out.println(++valor);
    }
    
    public void algo2(){
        System.out.println(++valor2);
    }
}
