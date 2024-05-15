
package ejecutor;
import java.util.Scanner;
public class Ejecutor {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
            System.out.print("Ingrese la cantidad de productos: ");
            int productos = scanner.nextInt();

            System.out.print("Ingrese el precio del producto: ");
            double precio = scanner.nextDouble();
            

            productos producto1 = new productos(precio, productos);

            double descuentoAplicado = producto1.calcularDescuento(productos, precio);
            double precioFinal = producto1.calcularPrecioFinal();

            System.out.printf("Descuento aplicado: %.2f%%\n", descuentoAplicado * 100);
            System.out.printf("Precio final con el descuento: $%.2f\n", precioFinal);

        
      
    }
    
}
