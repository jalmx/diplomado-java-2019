import java.util.Random;
import java.util.Scanner;

public class Colores{

    public static void main(String[] a){

        String[][] datos={
            {"Jose", "Alejandro", "Fidel", "Guillermo", "Eduardo", "Mateos"},
            {"Rojo", "Verde", "Amarrillo", "Rosa bebé", "Rosa mexicano", "Palo de rosa","Salmon","Azul"}
        };

        for(int i = 0; i < datos[0].length; i++){
            System.out.printf("El color favorito de %s es %s\n",
                    datos[0][i],
                    datos[1][new Random().nextInt(datos[1].length)]
                );
        }

        String parejas[][] = new String[2][2];
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < parejas.length; i++){
            for(int j = 0; j < parejas[i].length; j++){
                System.out.print("Dar nombre: ");
                parejas[i][j] = sc.nextLine();
            }
        }

        for(int i = 0; i < new Random().nextInt(100); i++){
            System.out.printf(
                "%s se da besitos con %s\n",
                parejas
                    [new Random().nextInt(parejas.length)]
                    [new Random().nextInt(parejas.length)],
                parejas
                    [new Random().nextInt(parejas.length)]
                    [new Random().nextInt(parejas.length)]
                );
        }
    }
}
