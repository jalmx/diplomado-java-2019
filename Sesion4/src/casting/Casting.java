
package casting;

public class Casting {

    public static void main(String[] args) {
        
        double doble = 4.3;
        
        System.out.println("el valor de mi variable es: " + doble);
        
        int entero = (int) doble; //casting 
        
        System.out.println("El nuevo valor de mi variable es: " + entero);
        
        char caracter = 'a';
        
        System.out.println("el caracter tiene: " + caracter);
        
        int c = caracter;
        
        System.out.println("el caracter tiene: " + caracter);
        
        int entero2 = 0;
        
        char c2 = (char) entero2;
        
        System.out.println("El valor del casteo de entero a char: " + c2);
        
        for (int i = 0; i < 256; i++) {
            System.out.println( (char) i );
        }
        
    }
    
}
