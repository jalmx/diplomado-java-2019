package lista;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Lista {

    public static void main(String[] args) {

        HashMap<String, String> mapa = new HashMap<>();

        mapa.put("name", "Alejandro");
        mapa.put("phone", "92112345678");
        mapa.put("email", "yo@yo.com");

        System.out.println( mapa.get("email") );
        System.out.println( mapa.get("name") );
        System.out.println( mapa.get("phone") );

        List<String> miLista = new ArrayList<>();

        miLista.add("Elemento 1");
        miLista.add("Elemento 2");

        //foreach
        // Tipo nombreTemp : lista
        for (String valor : miLista) {
            System.out.println(valor);
        }

    }
}
