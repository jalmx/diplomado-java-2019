package envolturas;

import javax.swing.JOptionPane;

public class Suma {

    public static void main(String[] args) {
        
        String option = JOptionPane.showInputDialog(
                "Calculadora super chida\n1)Suma\n2)Resta\n3)Salir\n"
        );
        
        JOptionPane.showMessageDialog(null, "La option fue "+ option );
        
        String valor1 = JOptionPane.showInputDialog("Dar valor 1");        
        double a = Double.parseDouble(valor1);
        
        int valorEntero = Integer.parseInt("5");//pasa el 5 de string a numero entero
        
        String valor2 = JOptionPane.showInputDialog("Dar valor 2");
        double b = Double.parseDouble(valor2);
        
        double suma = a +b ;
        
        JOptionPane.showMessageDialog(null, "El resultado es " + suma);
    }
    
}
