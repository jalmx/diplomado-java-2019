
public class Perro {
    
    private String nombre = "Patricio";
    private String raza = "Electrico";
    
    public void ladrar(){
        System.out.println(nombre + " dice gua gua!!! de raza " + raza);
    }
    
    public void correr(int velocidad){
        System.out.println(nombre + " corre a " + velocidad + " km/h");
    }
    
    public void jugar(String juguete){
        System.out.println(nombre + " juega con " + juguete);
    }
}
