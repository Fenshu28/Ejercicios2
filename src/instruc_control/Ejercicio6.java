/************************************************
 * Autor: Cristopher Alexis Zarate Valencia		*
 * Fecha de creación: 8 abr. 2023				*
 * Fecha de modificación: 10 abr. 2023			*
 * Descripción: Desarrolle un programa que reciba como entrada un número entre 1 y 12 e
		imprima el nombre del mes correspondiente. Tome teniendo en cuenta, posibles
		valores erróneos en la entrada.
 ************************************************/
package instruc_control;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

/**
 * @author cristopher
 *
 */
public class Ejercicio6 {
	public static void main(String[] args) {
		int numMes;
		Scanner rd = new Scanner(System.in);
		
		System.out.println("Escriba el número de mes:");
		numMes = rd.nextInt();
		
		if(numMes >= 1 && numMes <= 12) {
			System.out.println("El nombre del mes es " + LocalDate.of(1, numMes, 1).getMonth().getDisplayName(TextStyle.FULL, new Locale("es", "ES")));
		}else {
			System.out.println(numMes + " no es un número de mes válido.");
		}
		
	}
}
