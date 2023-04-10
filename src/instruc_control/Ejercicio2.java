/************************************************
 * Autor: Cristopher Alexis Zarate Valencia		*
 * Fecha de creación: 7 abr. 2023				*
 * Fecha de modificación: 10 abr. 2023			*
 * Descripción: Para tributar un determinado impuesto se debe ser mayor de 16 años y tener
		unos ingresos iguales o superiores a 500$ mensuales. Escribir un programa que
		pregunte al usuario su edad y sus ingresos mensuales y muestre por pantalla si
		el usuario tiene que tributar o no.
 ************************************************/
package instruc_control;

import java.util.Scanner;

/**
 * @author cristopher
 *
 */
public class Ejercicio2 {
	public static void main(String[] args) {
		Scanner rd = new Scanner(System.in);
		int edad;
		float ingreso;
		System.out.println("Cual es tu edad:");
		edad = rd.nextInt();
		System.out.println("Cual es tu ingreso:");
		ingreso = rd.nextFloat();
		
		if(edad > 16 && ingreso >= 500) {
			System.out.println("Sí tiene que tributar");
		}else {
			System.out.println("No tiene que tributar");
		}
		
	}
}
