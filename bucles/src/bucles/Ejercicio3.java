package bucles;
import java.util.Scanne 
public class Ejercicio5 {
public static void main(String[] args) {
        String respuesta;

        do {
            System.out.print "¿Quieres salir?" (S/N): ";
            respuesta = teclado.nextLine();
        // El bucle se repite mientras la respuesta NO sea "S" ni "s"
        } while (!respuesta.equalsIgnoreCase("S)");

        System.out.println("Programa finalizado con éxito.");
        teclado.close();
    }
}

