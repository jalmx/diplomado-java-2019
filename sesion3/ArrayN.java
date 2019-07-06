public class ArrayN{

    public static void main(String... a){

        int miArreglo[][] = new int[4][4];//un array de 4x4
        //4 filas y 4 columnas, está vacío

        //insertar información
        miArreglo[0][0] = 6;
        miArreglo[1][0] = 4;
        miArreglo[2][2] = 8;
        miArreglo[1][3] = 5;
        miArreglo[0][3] = 9;

     //System.out.println( miArreglo[0][0] );
     //System.out.println( miArreglo[1][1] );

      for(int i= 0; i < miArreglo.length; i++){//el primer for recorre las filas
            for(int j=0; j < miArreglo[i].length; j++){//segundo for recorre las columnas
                System.out.print( miArreglo[i][j] +" - ");
            }
            System.out.print("\n--------------------\n" );
        }

        System.out.print("\n*****************************\n" );

        //un array con datos iniciales
        int segundoArreglo[][] = {
            {4, 3, 7, 9},//fila uno
            {5, 7, 8, 1}//fila dos
            };

        for(int i= 0; i < segundoArreglo.length; i++){//el primer for recorre las filas
            for(int j=0; j < segundoArreglo[i].length; j++){//segundo for recorre las columnas
                System.out.print( segundoArreglo[i][j] +" - ");
            }
            System.out.print("\n--------------------\n" );
        }
        }//termina método main
}//termina clase
