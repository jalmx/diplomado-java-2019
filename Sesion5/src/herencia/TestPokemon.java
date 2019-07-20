/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author josef
 */
public class TestPokemon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Pikachu pikachu = new Pikachu(20); //creando instancia de Pikachu
        Charmander charmander = new Charmander("Charmander", 22);//creando instancia de Charmander
        
        pikachu.ataqueRapido();//llamo al método atacar
//        System.out.println(pikachu.tipo);//llamo al campo tipo
        pikachu.impacTrueno();
        
        charmander.ataqueRapido();//llamo al método atacar
//        System.out.println(charmander.tipo);//llamo al campo tipo
        charmander.lanzaLlamas();//llamo al método lanzaLlamas de Charmander
        
        Pokemon pokemon = new Pokemon("Huevo", 0);
       
        System.out.println(pokemon);
        System.out.println(pikachu);
        
    }
    
}
