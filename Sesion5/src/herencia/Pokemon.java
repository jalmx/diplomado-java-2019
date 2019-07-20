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
public class Pokemon extends Object{
    
    private final String nombre;
    private final int ataque;
    protected int vida = 100;
    
    public Pokemon(String nombre, int ataque){
        
        if(nombre.isEmpty()){
            throw new PokemonException("Debe contener un nombre el POKEMON");
        }
        
        this.nombre = nombre;
        this.ataque = ataque;
        System.out.println("Se construye POKEMON: " + nombre);
    }
    
    protected String tipo = "Pokemon";
    
    public int ataqueRapido(){
        System.out.println("Atacando");
        return this.ataque;
    }

    public String getNombre() {
        return nombre;
    }

    public int getAtaque() {
        return ataque;
    }
    
    public int vida(Pokemon pokemon, int lesion){
        this.vida = pokemon.vida - lesion;
        return vida;
    }
            
    @Override
    public String toString(){
        return "Soy un lindo pokemon";
    }
}
