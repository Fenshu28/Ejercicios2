/************************************************
 * Autor: Cristopher Alexis Zarate Valencia		*
 * Fecha de creación: 6 abr. 2023				*
 * Fecha de modificación: 10 abr. 2023			*
 * Descripción: Realice un programa que imprima “Capicúa” si un número de entrada de cuatro
		dígitos es capicúa, o “No lo es” en caso contrario. Un número es capicúa si se
		escribe igual al derecho y al revés. Por ejemplo, 1551 es un número capicúa.
 ************************************************/
package instruc_control;

import java.util.Scanner;

/**
 * @author cristopher
 *
 */
public class ejercicio3 {
	public static void main(String[] args) {
		Scanner rd = new Scanner(System.in);
		String s = new String();
		int band = 0;
		
		System.out.println("Ingresa un número: ");
		s = rd.nextLine();
		
		for (int i = 0,j = s.length()-1; i < s.length()/2; i++, j--) {
			if(s.charAt(i) != s.charAt(j)) {
				band = 1;
				break;
			}
			
		}
		
		if(band != 1) {
			System.out.println("Capicúa");
		}else {
			System.out.println("No lo es");
		}
	}
}
