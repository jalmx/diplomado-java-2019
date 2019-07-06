
public class PruebaPersona {

    public static void main(String[] args) {
        
        Persona diego = new Persona();//creando instancia de Persona
        Persona guillermo = new Persona();//creando otra instancia de Persona
        
        diego.saludar();
        guillermo.saludar();
        
        diego.name = "Diegito";
        guillermo.name = "Memo";
        
        diego.saludar();
        guillermo.saludar();
        
        diego.age = 16;
        guillermo.age = 17;
                
        diego.decirEdad();
        guillermo.decirEdad();
        
        Persona persona = new Persona();
        
        persona.calcularEdadY(1989);
        persona.cenar(
                "empanadas de jamón con queso, bien preperadas", 
                "coquita",
                8
        );
        
        int edad = persona.calcularEdad(1989);
        System.out.println("Tienes " + edad + " de vejez");
             
    }
    
}
