package herencia;

public class Pelea {

    public static void main(String[] args) {
        
        Charmander charmander = new Charmander("Charmander", 25);
        Pikachu pikachu = new Pikachu(50);
        
        boolean salir = true;
                
        while(salir){
            
            charmander.vida(pikachu, pikachu.ataqueRapido());
            pikachu.vida(charmander, charmander.ataqueRapido());
            
            if(charmander.vida <= 0 ){
                System.out.println("Perdio " + charmander.getNombre());
                salir = false;
            }else if(pikachu.vida <= 0){
                System.out.println("Perdio " + pikachu.getNombre());
                salir = false;
            }
            
        }
    }
    
}
