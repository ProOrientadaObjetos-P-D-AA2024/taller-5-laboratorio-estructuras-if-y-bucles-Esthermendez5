package eje2empleados;
import java.util.Scanner;

public class Ejecutor {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.println("Ingrese el numero de empleados que desea");
        int cantEmpleados= tcl.nextInt();
        Empleado[] empleados = new Empleado[cantEmpleados];
        int cantidadEmpleados = 0;
        
        while (true) {
            System.out.println("\nSeleccione una opción:");
            System.out.println("Ingrese 1 para agregar un empleado");
            System.out.println("Ingrese 2 para mostrar información de los empleados");
            System.out.println("Ingrese 3 para calcular aumento de salario");
            System.out.println("ingrese 4 para salir del programa");
            int opc = tcl.nextInt();
         
            tcl.nextLine(); 

            switch (opc) {
                case 1:
                    if (cantidadEmpleados < empleados.length) { 
                        System.out.print(" Ingrese el nombre del empleado: ");
                        String nombreEmpleado = tcl.nextLine();
                        System.out.print(" Ingrese la edad del empleado: ");
                        int edad = tcl.nextInt();
                        System.out.print(" Ingrese el salario del empleado: ");
                        double salario = tcl.nextDouble();
                        empleados[cantidadEmpleados] = new Empleado(nombreEmpleado, salario, edad);
                        cantidadEmpleados++;
                        
                    } else {
                        System.out.println("No se puede agregar más empleados");
                    }
                    break;
                case 2:
                    System.out.println("\nMostrar información de los empleados:");
                    System.out.println("------------------");
                    for (int i = 0; i < cantidadEmpleados; i++) {
                        System.out.println(empleados[i].mostrarInformacion());
                    }
                    break;
                case 3:
                    double sumaSalarios = 0;
                    for (int i = 0; i < cantidadEmpleados; i++) {
                        sumaSalarios += empleados[i].getSalario();
                    }
                    double salarioPromedio = sumaSalarios / cantidadEmpleados;

                    System.out.print("\nIngrese el porcentaje de aumento salarial: ");
                    double porcentaje = tcl.nextDouble();

                    for (int i = 0; i < cantidadEmpleados; i++) {
                        if (empleados[i].getSalario() < salarioPromedio) {
                            double nuevoSalario = empleados[i].getSalario() * (1 + porcentaje / 100);
                            empleados[i].setSalario(nuevoSalario);
                            System.out.println("Nuevo salario de " + empleados[i].getNombre() + ": " + nuevoSalario);
                        }
                    }
                    break;
                case 4:
                    System.out.println("Salió del programa");
                    tcl.close();
                    System.exit(0);
                break;
            }
        }
    }
}
