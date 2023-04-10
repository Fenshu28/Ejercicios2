/************************************************
 * Autor: Cristopher Alexis Zarate Valencia		*
 * Fecha de creación: 8 abr. 2023				*
 * Fecha de modificación: 10 abr. 2023			*
 * Descripción: Escriba un programa que, 
 * 		dadas las longitudes de los catetos 
 * 		de un triángulo rectángulo, calcule 
 * 		la longitud de su hipotenusa.
 ************************************************/
package datosbasicos;

import java.util.Scanner;

/**
 * @author cristopher
 *
 */
public class Ejercicio5 {
	public static void main(String[] args) {
		Scanner rd = new Scanner(System.in);
		float cat1,cat2;
		
		System.out.println("Ingresa el primer cateto: ");
		cat1 = rd.nextFloat();
		System.out.println("Ingresa el segundo cateto: ");
		cat2 = rd.nextFloat();
		
		System.out.println("La longitud de la hipotenusa es " + Math.sqrt(Math.pow(cat1,2) + Math.pow(cat2,2)));
		
	}
}
