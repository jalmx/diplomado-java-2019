import java.util.*;

public class Sexo{

    public static void main(String[] a){
        Scanner patito = new Scanner(System.in);

        System.out.println("Qué sexo eres?");
        System.out.println("1) Hombre");
        System.out.println("2) Mujer");

        int sexo = patito.nextInt();

        if(sexo == 1){
            System.out.println("Eres un macho alfa lomo plateado");
        }else{
            if(sexo == 2){
                System.out.println("Eres una linda señorita");
            }else{
                System.out.println("Eres no binario");
            }
        }

    }//termina el método main
}//termina la clase
