/************************************************
 * Autor: Cristopher Alexis Zarate Valencia		*
 * Fecha de creación: 10 abr. 2023				*
 * Fecha de modificación: 10 abr. 2023			*
 * Descripción: Escribir un programa que pida números positivos al usuario. Mostrar el número
		cuya sumatoria de dígitos fue mayor y la cantidad de números cuya sumatoria
		de dígitos fue menor que 10. Utilizar una o más funciones, según sea necesario.
 ************************************************/
package funciones;

import java.util.Scanner;

/**
 * @author cristopher
 *
 */
public class Ejercicio5 {
	static Scanner rd = new Scanner(System.in);
	public static void main(String[] args) {
		int n[] = new int[50];
		leer(n);
		
				
	}
	
	public static int numMayorDiez(int n[]) {
		int aux = 0, numMay = 0;
		for (int i = 0; i < n.length; i++) {
			if() {
				
			}
		}
		
	}
	
	public static int sumDig(int i) {
		String s = String.valueOf(i);
		int val = 0;
		
		for (int j = 0; j < s.length(); j++) {
			val += Integer.parseInt( s.substring(j-1,j) );
		}
		
		return val;
	}
	
	public static void leer(int n[]) {
		int i = 0;
		System.out.println("Ingresa el número: ");
		do {			
			n[i] = rd.nextInt();
			i++;
		}while(n[i-1] <= 0);
	}
	
}
