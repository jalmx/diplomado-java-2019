package com.util;

public class Log {
    
    private Log(){}
    
    public static final void p(String messages){
        System.out.println(messages);
    }
    
    public static final void pf(String messages){
        System.out.printf(messages);
    }
   
}
