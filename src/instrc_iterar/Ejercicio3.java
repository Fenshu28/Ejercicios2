/************************************************
 * Autor: Cristopher Alexis Zarate Valencia		*
 * Fecha de creación: 10 abr. 2023				*
 * Fecha de modificación: 10 abr. 2023			*
 * Descripción: Escriba un programa que calcule el valor 𝑛 aproximado de usando la serie
 ************************************************/
package instrc_iterar;

import java.util.Iterator;
import java.util.Scanner;

/**
 * @author labingsw07
 *
 */
public class Ejercicio3 {
	public static void main(String[] args) {
		Scanner rd =  new Scanner(System.in);
		double n,pi=0;
		
		System.out.println("Ingrese n ");
		n = rd.nextInt();
		
		for (int i = 1,j=1; i <= n; i+=2,j++) {
			if(j%2 == 0)
				pi -= 4/i;
			else
				pi += 4/i;
		}
		
		System.out.println("PI es " + pi);
		
	}
}
