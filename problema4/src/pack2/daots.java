package pack2;

public class daots {
    //datos cliente
    private String nombres;
    private String apellidos;
    private String cedula;
    //datos banco
    private String Banco;
    private int numsucursal;
    private double valorcheque;
    private double comision;

    public daots(String nombres, String apellidos, String cedula, String Banco, int numsucursal, double valorcheque) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.cedula = cedula;
        this.Banco = Banco;
        this.numsucursal = numsucursal;
        this.valorcheque = valorcheque;
        this.comision = calcularcomision();
    }
    
    private double calcularcomision(){
        return valorcheque*0.003;
    }
    
    public String toString(){
        return "Nombres: "+nombres+"\nApellidos: "+apellidos+"\nCedula: "+cedula+"\nBanco: "+Banco+"\nNumero de sucurslaes: "
                +numsucursal+"\nVAlor del cheque: "+valorcheque+"\nComision del Banco: "+comision;
    }
}
