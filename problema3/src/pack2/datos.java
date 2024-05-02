package pack2;
public class datos {
    
    private String cedula;
    private String marca;
    private int anio;
    private double valor;
    private double valormatricula;

    public datos(String cedula, String marca, int anio, double valor) {
        this.cedula = cedula;
        this.marca = marca;
        this.anio = anio;
        this.valor = valor;
        this.valormatricula=calcular();
    }
    
    private double calcular(){
        return (2024-anio)*0.002;
    }
    
    public String toString(){
        return "Cedula: "+cedula+"\nMarca: "+marca+"\nAnio de fabricacion: "+anio
                +"\nvalor del vehiculo: "+valor+"\nVAlor de matricula: "+valormatricula;
    }
    
}
