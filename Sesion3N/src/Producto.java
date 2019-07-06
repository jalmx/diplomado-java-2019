
public class Producto {
    //variables globales
    private String nombre;
    private double precio;
    private int cantidad;
    
    public void setNombre(String nombre){
        //nombre es una variable local
        this.nombre = nombre;
    }
    
    public void setPrecio(double precio){
        this.precio = precio;
    }
    
    public void setCantidad(int cantidad){
        this.cantidad = cantidad;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public double getPrecio(){
        return this.precio;
    }
    
    public int getCantidad(){
        return this.cantidad;
    }
    
    public void description(){
        System.out.println(
                this.getNombre() + " cuesta " + getPrecio() + " hay " +
                 getCantidad() + " en stock" );
    }
}
