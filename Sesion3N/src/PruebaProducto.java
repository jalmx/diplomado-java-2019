
public class PruebaProducto {

    public static void main(String[] args) {
        Producto producto = new Producto();
        
        producto.setNombre("Coquita de 3L");
        producto.setPrecio(38);
        producto.setCantidad(5);
        
        System.out.printf("Nombre del producto %s\n", producto.getNombre());
        System.out.printf("Cuesta %.2f\n", producto.getPrecio());
        System.out.printf("Hay %d en el refri\n", producto.getCantidad());
        
        producto.description();
        
    }
    
}
