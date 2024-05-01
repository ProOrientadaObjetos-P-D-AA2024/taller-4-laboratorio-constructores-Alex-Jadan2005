package ejecutorcheques;
import pack2.daots;
public class Ejecutorcheques {
    public static void main(String[] args) {
        System.out.println("DAtos de Cheque");
        
        //objetos
        daots uno=new daots("Willian Alex","Jadan.U","3050092331","Loja",200,30.5);
        daots dos=new daots("Adriana Elizabeth","Jadan.U","3050092631","Pichincha",300,105.5);
        //imprimir
        System.out.println("============================\n1° Cliente\n"+uno.toString());
        System.out.println("============================\n2° Cliente\n"+dos.toString());
    }
    
}
