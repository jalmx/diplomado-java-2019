package com.glosarioapp;//carpetas

import com.view.MainFrame;

public class Main {

    public static void main(String[] args) {
        MainFrame ventana = new MainFrame();//crea una instancia de la ventana
        ventana.setVisible(true);//hace visible mi ventana
        ventana.setLocationRelativeTo(null);//centra la ventana en la pantalla
    }
    
}
