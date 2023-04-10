/************************************************
 * Autor: Cristopher Alexis Zarate Valencia		*
 * Fecha de creación: 10 abr. 2023				*
 * Fecha de modificación: 10 abr. 2023			*
 * Descripción: Escribir un programa que pida al usuario un número entero positivo y muestre
		por pantalla todos los números impares desde 1 hasta ese número.
 ************************************************/
package instrc_iterar;

import java.util.Scanner;

/**
 * @author labingsw07
 *
 */
public class Ejercicio1 {
	public static void main(String[] args) {
		Scanner rd = new Scanner(System.in);
		int num;
		
		do {
			System.out.println("ingrese el número");
			num = rd.nextInt();
			if(num<0)
				System.out.println("Debe ser un númeor entero positivo.");
		}while (num<0);
		
		for (int i = 1; i <= num; i++) {
			if(i%2 != 0)
				System.out.print(i + ",");
		}
	}
}
