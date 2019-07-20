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
public class Pikachu extends Electrico {

//    public Pikachu(String nombre, int ataque) {
//        // super es igual al this, pero con la referencia hacia el padre o superclase
//        super(nombre, ataque);//llamo al constructor de la clase padre
//        System.out.println("Se construye un " + nombre);
//        System.out.println("Con un ataque de " + ataque);
//    }

    public Pikachu(int ataque) {//sobre escribir al constructor padre
        super("Pikachu");
        System.out.println("Se construye un Pikachu");
        System.out.println("Con un ataque de "+ ataque );
    }

    @Override
    public int ataqueRapido() {
        // super.ataqueRapido();
        System.out.println("Ataque eléctrico");
        return this.getAtaque();
    }

    public int impacTrueno() {
        System.out.println("Impac Trueno!!!!! >:) ");
        return getAtaque() + new Random().nextInt(6);
    }

    @Override
    public String toString() {
        return super.toString() + " " + getNombre();
    }

}
