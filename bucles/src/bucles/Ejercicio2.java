package bucles;
import java.util.Scanner;

public class Hoja11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombre;
        int cantidad = 1;
        double precio;
        double totaldelafactura = 0; 

        while (cantidad != 0) {
            System.out.print("Escribe el nombre del articulo: "); 
            nombre = teclado.nextLine();

            System.out.print("Escribe la cantidad: "); // Corregido: sin el + cantidad
            cantidad = teclado.nextInt();

            // Si el usuario pone 0, rompemos el bucle antes de pedir el precio
            if (cantidad == 0) {
                break;
            }

            System.out.print("Escribe el precio: "); // Corregido: sin el + precio
            precio = teclado.nextDouble();
            
            // Limpieza del buffer del scanner
            teclado.nextLine(); 

            // Cálculo acumulativo
            double totalArticulo = precio * cantidad;
            totaldelafactura += totalArticulo; // Acumula sumando al total anterior

            // Mostrar el detalle tal como pide el ejemplo
            System.out.println("Artículo: " + nombre + ", Cantidad: " + cantidad + ", Precio: " + precio + ", Total: " + totalArticulo);
            System.out.println(); // Espacio en blanco para la siguiente vuelta
        }

        System.out.println("--------------------");
        System.out.println("Total de la factura: " + totaldelafactura);
        
        teclado.close();
    }
}
