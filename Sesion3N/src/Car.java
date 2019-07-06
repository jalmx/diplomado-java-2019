
public class Car {
    
    public int noPuerta = 2; //campo llamado noPuertas con un valor de 2
    private int aceleracion = 1;
    public long kilometraje = 10;
    
    public void acelerar(){
        System.out.println("Acelerando..." + aceleracion );
        incrementaAceleracion();
    }
    
    public void frenar(){
        System.out.println("Frenando!!!!");
        aceleracion--;
    }
    
    private void incrementaAceleracion(){
        aceleracion++;
        kilometraje+=20;
    }
}
