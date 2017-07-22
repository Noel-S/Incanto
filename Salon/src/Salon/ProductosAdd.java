package Salon;

/**
 *
 * @author Noel
 */
public class ProductosAdd {
    private String producto;
    private int cantidad;

    public ProductosAdd(String producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public String getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }
    
    
}
