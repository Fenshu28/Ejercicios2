/************************************************
 * Autor: Cristopher Alexis Zarate Valencia		*
 * Fecha de creación: 8 abr. 2023				*
 * Fecha de modificación: 10 abr. 2023			*
 * Descripción: Escribir un programa que pida
 * 		al usuario dos números y muestre por 
 * 		pantalla su división. Si el divisor es
 * 		cero, el programa debe mostrar un mensaje
 * 		de error.
 ************************************************/
package instruc_control;

import java.util.Scanner;

/**
 * @author cristopher
 *
 */
public class Ejercicio1 {
	public static void main(String[] args) {
		Scanner rd = new Scanner(System.in);
		float dividendo,divisor;
		System.out.println("Digita el dividendo: ");
		dividendo = rd.nextFloat();
		System.out.println("Digita el divisor: ");
		divisor = rd.nextFloat();
		
		if(divisor == 0) {
			System.out.println("El divisor deve ser diferente a 0.");
		}else {
			System.out.println("La división es " + dividendo / divisor);
		}
	}
}
