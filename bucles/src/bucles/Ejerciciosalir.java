package bucles; 

import java.util.Scanner; 

public class Ejerciciosalir { 
    public static void main(String[] args) { 
        Scanner teclado = new Scanner(System.in); 
        String respuesta; 
        
        do { 
            System.out.print("¿Quieres salir? (S/N): "); 
            respuesta = teclado.nextLine(); 
            
        // El bucle se repite MIENTRAS la respuesta NO sea "S" (Ignorando mayúsculas)
        } while (!respuesta.equalsIgnoreCase("S")); 
        
        System.out.println("Programa finalizado con éxito."); 
        teclado.close(); // Se cierra al final de todo el programa
    } 
}
