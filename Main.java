import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Producto> inventario = new ArrayList<>();

        while (true) {
            System.out.println("\n=== GESTOR DE PRODUCTOS ===");
            System.out.println("1. Agregar producto");
            System.out.println("2. Modificar producto");
            System.out.println("3. Eliminar producto");
            System.out.println("4. Listar productos");
            System.out.println("5. Salir");

            try {
                // Leer la opción seleccionada por el usuario
                System.out.print("Ingrese la opción deseada: ");
                int opcion = scanner.nextInt();
                scanner.nextLine();

                switch (opcion) {
                    case 1:
                        // Agregar producto al inventario
                        System.out.print("\nIngrese el nombre del producto: ");
                        String nombre = scanner.nextLine();
                        System.out.print("Ingrese el precio del producto: ");
                        double precio = scanner.nextDouble();
                        System.out.print("Ingrese la cantidad en stock del producto: ");
                        int cantidadEnStock = scanner.nextInt();

                        Producto nuevoProducto = new Producto(nombre, precio, cantidadEnStock);
                        inventario.add(nuevoProducto);
                        System.out.println("\nProducto agregado al inventario: " + nuevoProducto);
                        break;

                    case 2:
                        // Modificar producto existente en el inventario
                        System.out.print("\nIngrese el índice del producto a modificar: ");
                        int indiceModificar = scanner.nextInt();

                        if (indiceModificar < 0 || indiceModificar >= inventario.size()) {
                            throw new IndexOutOfBoundsException("Índice inválido.");
                        }

                        Producto productoModificar = inventario.get(indiceModificar);
                        System.out.println("\nProducto seleccionado para modificar: " + productoModificar);
                        System.out.print("Ingrese el nuevo nombre del producto: ");
                        String nuevoNombre = scanner.nextLine();
                        System.out.print("Ingrese el nuevo precio del producto: ");
                        double nuevoPrecio = scanner.nextDouble();
                        System.out.print("Ingrese la nueva cantidad en stock del producto: ");
                        int nuevaCantidadEnStock = scanner.nextInt();

                        productoModificar.setNombre(nuevoNombre);
                        productoModificar.setPrecio(nuevoPrecio);
                        productoModificar.setCantidadEnStock(nuevaCantidadEnStock);
                        System.out.println("\nProducto modificado exitosamente: " + productoModificar);
                        break;

                    case 3:
                        // Eliminar producto del inventario
                        System.out.print("\nIngrese el índice del producto a eliminar: ");
                        int indiceEliminar = scanner.nextInt();

                        if (indiceEliminar < 0 || indiceEliminar >= inventario.size()) {
                            throw new IndexOutOfBoundsException("Índice inválido.");
                        }

                        Producto productoEliminar = inventario.get(indiceEliminar);
                        inventario.remove(productoEliminar);
                        System.out.println("\nProducto eliminado del inventario: " + productoEliminar);
                        break;

                    case 4:
                        // Listar productos en el inventario
                        System.out.println("\n=== INVENTARIO DE PRODUCTOS ===");
                        if (inventario.isEmpty()) {
                            System.out.println("El inventario está vacío.");
                        } else {
                            for (int i = 0; i < inventario.size(); i++) {
                                System.out.println(i + ": " + inventario.get(i));
                            }
                        }
                        break;

                    case 5:
                        // Salir del programa
                        System.out.println("\nGracias por utilizar el gestor de productos. Hasta luego.");
                        return;

                    default:
                        System.out.println("\nOpción inválida.");
                }
            } catch (InputMismatchException e) {
                // Si el usuario ingresa un valor no numérico, mostrar mensaje de error
                System.out.println("\nDebe ingresar un valor numérico para la opción.");
                scanner.nextLine();
            } catch (IndexOutOfBoundsException e) {
                // Si el usuario ingresa un índice inválido, mostrar mensaje de error
                System.out.println("\n" + e.getMessage());
                scanner.nextLine();
            }
        }
    }
}
