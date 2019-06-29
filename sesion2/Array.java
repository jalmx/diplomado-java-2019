public class Array{

    public static void main(String[] a){

        int miArreglo[] = new int[4];

        miArreglo[0] = 2;//guardando el valor 2 en la posición 0 del array
        miArreglo[1] = 9;
        miArreglo[2] = 56;
        miArreglo[3] = 21;

        System.out.printf("En la posición %d del array tiene: %d\n",0 , miArreglo[0]);
        System.out.printf("En la posición %d del array tiene: %d\n",1 , miArreglo[1]);
        System.out.printf("En la posición %d del array tiene: %d\n",2 , miArreglo[2]);
        System.out.printf("En la posición %d del array tiene: %d\n",3 , miArreglo[3]);
        System.out.println("-------------------------");

        miArreglo[2] = 20;//cambiando el valor de la posición 2

        for(int x = 0; x < miArreglo.length; x++){
            System.out.printf("En la posición %d del array tiene: %d\n",x , miArreglo[x]);
        }

        int miArreglo2[] = {5,3,8,3,1};
        System.out.println("El largo del array es: " + miArreglo2.length);

        for(int x = 0; x < miArreglo2.length; x++){
            System.out.printf("En la posición %d del array tiene: %d\n",x , miArreglo2[x]);
        }
    }
}
