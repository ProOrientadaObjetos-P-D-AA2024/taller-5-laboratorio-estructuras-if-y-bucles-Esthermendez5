
package ejecutor;

public class productos {
    private double precio;
    private int productos;

    public productos (double precio, int productos) {
        this.precio = precio;
        this.productos = productos;
    }

    public double calcularDescuento(int productos, double precio) {
        if (precio >= 1000 && productos >= 10) {
            return 0.1;
        } else {
            return 0.05;
        }
    }

    public double calcularPrecioFinal() {
        precio= precio*productos;
        double descuento = calcularDescuento(productos, precio);
        descuento=precio * descuento;
        return precio- descuento;
    }
}
