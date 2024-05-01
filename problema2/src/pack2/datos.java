package pack2;
public class datos {
    
    private String nombre;
    private String apellido;
    private double sueldob;
    private double sueldot;
    private String cedula;

    
    public datos(String nombre, String apellido, double sueldob, String cedula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldob = sueldob;
        this.cedula = cedula;
    }
    

    

    public String toString() {
        return "=================\nDAtos\nNombre: "+nombre+"\nApellido: "+apellido+
                "\nCedula: "+cedula+"\nSueldo Basico: "+sueldob+"\nSueldo Total: "+sueldob*1.20;
    }
}
