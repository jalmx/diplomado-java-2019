/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

import java.util.Random;

/**
 *
 * @author josef
 */
public class Charmander extends Pokemon{
    
    public Charmander(String nombre, int ataque){
        super(nombre,ataque);//llamo al constructor de la super clase (Pokemon)
        System.out.println("Se construye " + nombre);
        System.out.println("Con un ataque de "+ ataque);
    }
    
    public int lanzaLlamas(){
        System.out.println("Lanza llamas!!!!!!! >:)");
        return getAtaque() + new Random().nextInt(8);
    }
    
    @Override
    public int ataqueRapido(){
        System.out.println("Ataque de fuego");
        return getAtaque();
    }
    
}
