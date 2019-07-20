package colecciones;

import herencia.Pokemon;
import java.util.ArrayList;

public class Colecciones {

    public static void main(String[] args) {
        
        //declaro una lista de objetos genericos
        ArrayList lista = new ArrayList();
        
        //con el método add, agrego elementos a lista lista
        lista.add("hola");
        lista.add(3);
        lista.add("mensaje");
        
        //con el método get obtengo el objeto en esa poscion
        System.out.println(lista.get(0));
        System.out.println(lista.get(1));
        System.out.println(lista.get(2));
        
        //declaro una lista para objetos tipo Pokemon
        //ArrayList<TipoDeObjeto> nombreLista = new ArrayList<>();
        // <> se llama operador diamante
        ArrayList<Pokemon> pokemons = new ArrayList<>();
        pokemons.add(new Pokemon("Pikachu", 20));
        pokemons.add(new Pokemon("Chikorita", 20));
        pokemons.add(new Pokemon("Charizard", 25));
        pokemons.add(new Pokemon("Bolbasor", 25));
        pokemons.add(new Pokemon("Miutwo", 55));
        
        System.out.println(pokemons.get(1).getNombre());
        
        System.out.println("----------------------");
        
        for (int i = 0; i < pokemons.size(); i++) {
            System.out.println(pokemons.get(i).getNombre());
        }
        
        System.out.println("++++++++++++++++++");
        
        //foeach
        // TipoDeObjeto nombreTemporal : Lista
        for(Pokemon pokemon : pokemons){
            System.out.println(pokemon.getAtaque());
        }
        
        
    }
    
}
