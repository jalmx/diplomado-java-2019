package args;

public class Argumentos {

    public static double suma(double[] numeros) {
        double suma = 0;

        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }
        return suma;
    }

    public static double suma2(double... numeros) {
        double suma = 0;

        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }
        return suma;
    }

    public static double[] valores(double n1, double n2) {
        double[] valores = {n1, n2};
        return valores;
    }

    public static void main(String[] args) {
        double[] nums = {3.2,3.2,3.2,3.2,3.2,3.2};
        
        System.out.println(Argumentos.suma(nums));
        System.out.println(Argumentos.suma2(nums));
        System.out.println("-----------");
        System.out.println(Argumentos.suma2(3.2,3.2,3.2,3.2,3.2,3.2));
                
        double[] n2 = Argumentos.valores(12, 26);
        
        System.out.println(n2[0]);
        System.out.println(n2[1]);
        
        System.out.println(Argumentos.valores(12, 26)[1]);
    }
}
