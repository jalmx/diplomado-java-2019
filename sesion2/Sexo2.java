import java.util.*;

public class Sexo2{

    public static void main(String[] a){
        Scanner patito = new Scanner(System.in);

        System.out.println("Qué sexo eres?");
        System.out.println("1) Hombre");
        System.out.println("2) Mujer");

        int sexo = patito.nextInt();

        switch(sexo){
            case 1:
                System.out.println("Eres un macho alfa lomo plateado");
                break;
            case 2:
                System.out.println("Eres una linda señorita");
                break;
            default:
                System.out.println("Eres no binario");
        }
    }//termina el método main
}//termina la clase
