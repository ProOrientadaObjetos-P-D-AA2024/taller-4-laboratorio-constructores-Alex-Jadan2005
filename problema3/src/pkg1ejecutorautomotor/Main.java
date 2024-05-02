package pkg1ejecutorautomotor;

import pack2.datos;

public class Main {
    public static void main(String[] args) {
        
        //objeto
        datos uno=new datos("3050092331","Toyota",1994,3000.5);
        datos dos=new datos("3050092631","Mercedes",2006,25000);
        
        //imprimir
        System.out.println("=======================\nDATOS\n=======================\n"
                +uno.toString());
        
        System.out.println("\n=======================\n"
                +dos.toString());
        
    }
    
}
