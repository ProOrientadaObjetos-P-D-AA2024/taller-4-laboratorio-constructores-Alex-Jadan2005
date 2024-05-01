package pack2;
public class datos {
    private String nombre;
    private double materia1;
    private double materia2;
    private double materia3;
    private double promedio;
    private String estado;

    // Constructor
    public datos(String nombre, double materia1, double materia2, double materia3) {
        this.nombre = nombre;
        this.materia1 = materia1;
        this.materia2 = materia2;
        this.materia3 = materia3;
        this.promedio = calcularPromedio();
        this.estado = (promedio >= 6.5) ? "Aprobado" : "Reprobado";
    }

    private double calcularPromedio() {
        return (materia1 + materia2 + materia3)/3;
    }
    
    public String toString() {
        return "Nombre del Estudiante: "+nombre+"\nCalificaciones\nMateria 1: "+materia1+
                "\nMateria 2: "+materia2+"\nMateria3: "+materia3+"\nPromedio: "+promedio+
                "\nEstado: "+estado;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEstado() {
        return estado;
    }

}
