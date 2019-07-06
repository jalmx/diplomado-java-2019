
public class Main {

    public static void main(String[] args) {
        
        
      //tipo  nombre = new tipo();
        Car carritoCafe;//declarando que voy a usar una instancia de Car
        Car ponny;//declarando que voy a usar una instancia de Car
        
        carritoCafe = new Car();//estoy creando una instancia de Car
        ponny = new Car();//creando otra instancia de Car
        
        carritoCafe.acelerar(); //accedí a un método de mi instancia
        
        ponny.acelerar();
        carritoCafe.acelerar();
        
        System.out.println(carritoCafe.noPuerta ); //accediendo a un campo de mi instancia
        
        carritoCafe.frenar();
        carritoCafe.acelerar();
        
        for(int i = 0; i < 20; i++){
            carritoCafe.acelerar();
            if(i % 2 == 0 && i % 3 == 0){
                carritoCafe.frenar();
            }
        }
        System.out.println("El kilometraje es de " + carritoCafe.kilometraje);
    }
    
}
