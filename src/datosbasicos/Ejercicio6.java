/************************************************
 * Autor: Cristopher Alexis Zarate Valencia		*
 * Fecha de creación: 9 abr. 2023				*
 * Fecha de modificación: 10 abr. 2023			*
 * Descripción: Escriba un programa que lea 
 * 		un número de cuatro dígitos y muestre
 * 		en pantalla el número escrito en 
 * 		reverso. Por ejemplo, si el número
		salida debería ser 2345.
 ************************************************/
package datosbasicos;

import java.util.Scanner;

/**
 * @author cristopher
 *
 */
public class Ejercicio6 {
	public static void main(String[] args) {
		Scanner rd = new Scanner(System.in);
		String num = new String();
		String numRev = new String();
		
		System.out.println("Escribe el número que deseas voltear:");
		num = rd.nextLine();
		
		for (int i = num.length()-1; i >= 0; i--) {
			System.out.print(num.charAt(i));
		}
		
	}
}
