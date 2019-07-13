package objeto;

public class Auto {

    private String nombre;
    private String color;
    private boolean encendido;
    private double aceleracion;

    public Auto() {
        System.out.println("Se construye un auto basico");
    }

    public Auto(String nombre) {
        this.nombre = nombre;
        System.out.println("Se construye un auto con nombre");
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public void arrancar() {
        this.encendido = true;
    }

    public void apagar() {
        this.encendido = false;
    }

    public boolean isEncendido() {
        return this.encendido;
    }

    public void descripcion() {
        System.out.println("Mi carrito se llama " + getNombre() + " de color " + getColor()
                + " y esta " + isEncendido());
    }

    public void setAceleracion() {
        this.aceleracion++;
    }

    public void setAceleracion(int aceleracion) {
        this.aceleracion = aceleracion;
    }

    public void setAceleracion(double aceleracion) {
        this.aceleracion = aceleracion;
    }

    public void setAceleracion(String aceleracion) {
        this.aceleracion = Double.parseDouble(aceleracion);
    }

    public double getAceleracion() {
        return this.aceleracion;
    }
}
