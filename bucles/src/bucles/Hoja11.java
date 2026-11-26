package bucles;
import java.util.Scanner;
public class Hoja11 {
	public static void main(String[] args) {
		 Scanner teclado = new Scanner(System.in) ;
		 String nombre ;
		 int cantidad=1 ; 
		 double precio ;
		 double totaldelafactura;
		 while (cantidad!=0) {
			 
		 // Escribiendo lo que me va a pedir el programa
			 System.out.println("Escribe el nombre del articulo");
		    nombre = teclado.nextLine(); 
		  
		    
			System.out.println("Escribe la cantidad");
			cantidad = teclado.nextInt();

			
			System.out.println("Escribe el precio");
			precio = teclado.nextDouble();
			teclado.nextLine();
				
			totaldelafactura = precio * cantidad;
			System.out.println("Total de la factura " + totaldelafactura);	
		
		 }
		 
		 teclado.close();

	}

}

