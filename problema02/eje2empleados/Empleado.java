
package eje2empleados;


public class Empleado {
     private String nombreEmpleado;
    private double salario;
    private int edad;

    public Empleado(String nombreEmpleado, double salario, int edad) {
        this.nombreEmpleado = nombreEmpleado;
        this.salario = salario;
        this.edad = edad;
    }

    public String getNombre() {
        return nombreEmpleado;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getEdad() {
        return edad;
    }

    public String mostrarInformacion() {
        return "Nombre: " + nombreEmpleado + ", Salario: " + salario + ", Edad: " + edad;
    }
    
}
