public class Producto {
    private String nombre;
    private double precio;
    private int cantidadEnStock;

    // Constructor de la clase Producto
    public Producto(String nombre, double precio, int cantidadEnStock) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadEnStock = cantidadEnStock;
    }

    // Getter para obtener el nombre del producto
    public String getNombre() {
        return nombre;
    }

    // Setter para asignar un nuevo nombre al producto
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter para obtener el precio del producto
    public double getPrecio() {
        return precio;
    }

    // Setter para asignar un nuevo precio al producto
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // Getter para obtener la cantidad en stock del producto
    public int getCantidadEnStock() {
        return cantidadEnStock;
    }

    // Setter para asignar una nueva cantidad en stock al producto
    public void setCantidadEnStock(int cantidadEnStock) {
        this.cantidadEnStock = cantidadEnStock;
    }

    // Método para agregar una cantidad específica al stock del producto
    public void agregarStock(int cantidad) {
        this.cantidadEnStock += cantidad;
    }

    // Método para restar una cantidad específica del stock del producto
    public void restarStock(int cantidad) {
        if (cantidad > this.cantidadEnStock) {
            throw new IllegalArgumentException("No hay suficiente stock disponible.");
        }
        this.cantidadEnStock -= cantidad;
    }

    // Método toString para imprimir el objeto Producto
    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", cantidadEnStock=" + cantidadEnStock +
                '}';
    }
}
