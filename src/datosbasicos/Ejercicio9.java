/************************************************
 * Autor: Cristopher Alexis Zarate Valencia		*
 * Fecha de creación: 9 abr. 2023				*
 * Fecha de modificación: 10 abr. 2023			*
 * Descripción: Escriba un programa que reciba
 * 		como entrada los coeficientes A, B y C
 * 		de una ecuación de segundo grado,
 * 		e imprima por pantalla los valores de x.
 * 		Asuma que la ecuación siempre tiene
 * 		solución en número reales. Recuerde que
 * 		la solución de una ecuación de
 * 		segundo viene dada por la formula general.
 ************************************************/
package datosbasicos;

import java.util.Scanner;

/**
 * @author cristopher
 *
 */
public class Ejercicio9 {
	public static void main(String[] args) {
		Scanner rd = new Scanner(System.in);
		float a,b,c;
		System.out.println("Ingrese el coeficiente a:");
		a = rd.nextFloat();
		System.out.println("Ingrese el coeficiente b:");
		b = rd.nextFloat();
		System.out.println("Ingrese el coeficiente c:");
		c = rd.nextFloat();
		
		System.out.println("Los valores de x son :");
		System.out.println("X1 = " + ( ( -b + Math.sqrt( Math.pow(b,2) - 4*(a*c) ) )/(2*a) ));
		System.out.println("X2 = " + ( ( -b - Math.sqrt( Math.pow(b,2) - 4*(a*c) ) )/(2*a) ));
	}
}
