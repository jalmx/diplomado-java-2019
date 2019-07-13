package estatico;

public class PruebaOhm {

    public static void main(String[] args) {
        
        LeyOhm.calcularVoltaje(4, 4);
        
        System.out.println("El valor de PI es " + LeyOhm.PI);
        
        LeyOhm l1 = new LeyOhm();
        LeyOhm l2 = new LeyOhm();
        LeyOhm l3 = new LeyOhm();
        
        l1.algo();
        l1.algo2();
        
        l2.algo();
        l2.algo2();
        
        l3.algo();
        l3.algo2();
        
        
    }
    
}
