package ejecutorprofesor;

import pack2.datos;

public class Ejecutorprofesor {
    public static void main(String[] args) {

        System.out.println("=================================\nDatos de Profesores\n=================================");
        
        //crear objetos
        datos uno = new datos("Alex","Jadan", 400, "3050092331");
        datos dos = new datos("Diego","Quezada", 450, "3050092631");
        
        //imprimir datos
        System.out.println("1° Profesor: \n"+uno.toString());
        System.out.println("2° Profesor: \n"+dos.toString());


    }

}
