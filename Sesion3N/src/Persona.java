
public class Persona {

    public String name;
    public int age;

    public void saludar() {
        System.out.println("Hola me llamo " + name);
    }

    public void decirEdad() {
        System.out.println("Tengo " + age + " años");
    }

    public void calcularEdadY(int bornYear) {

        int edad = 2019 - bornYear;
        System.out.println("Tienes " + edad + " años");

        if (edad >= 30) {
            System.out.println("Ya estás veterano");
        }
    }

    public void cenar(String comida, String bebida, int hora) {
        System.out.println("Voy a comer unas " + comida + " con una "
                + bebida + " a las " + hora);

    }
    
    public int calcularEdad(int bornYear){
        int edad = 2019 - bornYear;
        return edad;
    }
}
