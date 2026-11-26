package bucles; 

import java.util.Scanner; 

public class Ejerciciomejora { 
    public static void main(String[] args) { 
        Scanner teclado = new Scanner(System.in); 
        char respuesta; 
        
        do { 
            System.out.print("¿Quieres salir? (S/N): "); 
            respuesta = teclado.nextLine().charAt(0); 
            
        // El bucle se repite MIENTRAS la respuesta NO sea "S" (Ignorando mayúsculas)
        } while (respuesta != 's'); 
        
        
        System.out.println("Programa finalizado con éxito."); 
        teclado.close(); // Se cierra al final de todo el programa
    } 
}
