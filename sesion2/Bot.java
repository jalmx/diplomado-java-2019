import java.util.Scanner;

public class Bot{

    public static void main(String[] a) throws Exception{

        String saludos[] = {
            "Hola",
            "Te amo",
            "Como estas"
        }

        Scanner sc = new Scanner(System.in);
        String nombre= "";
        int edad = 0;
        String hobby="";

        System.out.println("Hola, Me llamo Yiyo");
        System.out.println("Cuál es tu nombre");
        nombre =sc.nextLine();

        System.out.printf("Hola %s, que bonito nombre tienes, yo tengo igual otro amigo que se llama %s\n", nombre, nombre);

        System.out.println("Cuántos anios tienes?");
        edad = sc.nextInt();

        System.out.printf("WOW, yo tengo %d\n", edad +5);

        System.out.println("Cuál es tu hobby?");
        hobby = sc.nextLine();

        System.out.printf("Igual a mí me encanta %s\n", hobby);

        System.out.println("Quieres ser mi amigo? 1)Si, 2)No");
        int op = sc.nextInt();
        if(op == 1){
            System.out.println("Seremos los mejores amigos!! :D");
        }else{
            System.out.println("Te buscaré y te encontraré y te mataré!! >:)");
        }

    }
}
