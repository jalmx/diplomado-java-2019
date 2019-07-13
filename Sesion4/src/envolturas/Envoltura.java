package envolturas;

public class Envoltura {
    
    public static void main(String[] args) {
        
        int x = 2; //primitivo
        
        Integer entero = new Integer(2);
        
        System.out.println(x);
        System.out.println(entero);
        
        Double doble = new Double("3.2");
        
        System.out.println(doble.toString());
        
        double valor = Double.parseDouble("56.43");
        double suma = 3 + valor;
        
        System.out.println(suma);
        
    }
    
}
