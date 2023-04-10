/************************************************
 * Autor: Cristopher Alexis Zarate Valencia		*
 * Fecha de creación: 8 abr. 2023				*
 * Fecha de modificación: 10 abr. 2023			*
 * Descripción: Un número de cuatro cifras es feliz si los dos primeros dígitos son mayores que
		los dos últimos dígitos. Por ejemplo, 5613 es feliz porque 56 es mayor que 12.
		Un número de cuatro cifras es creciente si cada dígito es mayor al anterior. Por
		ejemplo, 1569 es creciente 1 < 5 < 6 < 9 (o 9 > 6 > 5 > 1). Todo número que
		es feliz y creciente se dice que es un número muy feliz. Todo número que no es
		feliz ni creciente se dice que es infeliz. Haga un programa que tome como
		entrada un número de cuatro dígitos e imprima el tipo de número encontrado,
		según la clasificación descrita.
 ************************************************/
package instruc_control;

import java.util.Iterator;
import java.util.Scanner;

/**
 * @author cristopher
 *
 */
public class Ejercicio7 {
	public static void main(String[] args) {
		String s = new String();
		Scanner rd = new Scanner(System.in);
		boolean esFeliz = false,esCreci = false;
		
		do {
			s = rd.nextLine();
			if(s.length() != 4) {
				System.out.println("Tiene que tener 4 digitos");
			}
		}while(s.length() != 4);
			
		if (Integer.parseInt(s.substring(0,2)) > Integer.parseInt(s.substring(2,4)) ) {
			esFeliz = true;
		}
		for (int i = 1; i < s.length()-1; i++) {
			if(s.charAt(i-1) > s.charAt(i)) {
				esCreci = false;
				break;
			}
		}
		
		if(esFeliz && esCreci) {
			System.out.println("El número es muy feliz ");
		}else {
			System.out.println("El número es infeliz");
		}
	}
}
