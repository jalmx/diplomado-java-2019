
package variable.globales;

public class Variables {

    public static int variable1 = 3;//variable global
    
    public static void main(String[] args) {
    
        System.out.println(variable1);
        
        int i ;
        
        for ( i = 0 /*es variable local*/; i < 10; i++) {
            System.out.println("valor de i: \" " + i);
        }
        
        for(i = 0; i <10; i++){
            System.out.println("----");
            
            for(int u =0; u<10; u++){
                System.out.println(u);
            }
            
            double u = 3.2;
        }
       
        System.out.println(variable1);
        sumar();
    }
    
    public static void sumar(){
        System.out.println(variable1++);
        for (int i = 0; i < 10; i++) {
            System.out.println("for dentro de suma: " + i);
        }
    }
    
}
