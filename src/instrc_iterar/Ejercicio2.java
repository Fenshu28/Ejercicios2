/************************************************
 * Autor: Cristopher Alexis Zarate Valencia		*
 * Fecha de creación: 10 abr. 2023				*
 * Fecha de modificación: 10 abr. 2023			*
 * Descripción: Escribir un programa que pida al usuario un número entero y muestre por
		pantalla si es un número primo o no.
 ************************************************/
package instrc_iterar;

import java.util.Scanner;

/**
 * @author labingsw07
 *
 */
public class Ejercicio2 {
	public static void main(String[] args) {
		Scanner rd = new Scanner(System.in);
		int num;
		
		do {
			System.out.println("ingrese el número");
			num = rd.nextInt();
			if(num<2)
				System.out.println("Debe ser un número mayor que 1.");
		}while (num<2);
		
		if(num%num == 0 && num%1 == 0) {
			System.out.println("Es primo");
		}else {
			System.out.println("No es primo");
		}
		
	}
}
