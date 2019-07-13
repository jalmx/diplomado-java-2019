/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objeto;

import java.util.Scanner;

/**
 *
 * @author josef
 */
public class PruebaAuto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Auto vochito = new Auto(null);
        Auto carretilla = new Auto("motito");
        
        carretilla.descripcion();
        
        vochito.setNombre("Mi garnachita");
        vochito.setColor("azul pistache");
        vochito.arrancar();
        vochito.descripcion();
//        vochito.apagar();
        vochito.descripcion();
        
        if(vochito.isEncendido()){
            System.out.println("Mi vochito está encendido");
        }else{
            System.out.println("Mi vochito está apagado");
        }
        
        
        vochito.setAceleracion();
        System.out.printf("La aceleracion es de %.2f\n", vochito.getAceleracion());
        
        vochito.setAceleracion(4);
        System.out.printf("La aceleracion es de %.2f\n", vochito.getAceleracion());
        
        vochito.setAceleracion(5.3);
        System.out.printf("La aceleracion es de %.2f\n", vochito.getAceleracion());
        
        vochito.setAceleracion("5");
        System.out.printf("La aceleracion es de %.2f\n", vochito.getAceleracion());
        
    }
    
}
