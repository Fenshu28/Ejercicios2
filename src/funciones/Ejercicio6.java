/************************************************
 * Autor: Cristopher Alexis Zarate Valencia		*
 * Fecha de creación: 10 abr. 2023				*
 * Fecha de modificación: 10 abr. 2023			*
 * Descripción: Solicitar números al usuario hasta que ingrese el cero. Por cada uno, mostrar la
		suma de sus dígitos (utilizando una función que realice dicha suma).
 ************************************************/
package funciones;

import java.util.Scanner;

/**
 * @author cristopher
 *
 */
public class Ejercicio6 {
	public static void main(String[] args) {
		Scanner rd = new Scanner(System.in);
		int nums;
		
		System.out.println("Ingresa los números");
		do {
			nums = rd.nextInt();
			if(nums == 0) {
				break;
			}
			System.out.println("Suma de los dígitos " + sumDig(nums));
		}while(nums > 0);
		
	}
	
	public static int sumDig(int i) {
		String s = new String();
		s = String.valueOf(i);
		int val = 0;
		
		for (int j = 0; j < s.length(); j++) {
			val += Integer.parseInt( s.substring(j,j+1) );
		}
		
		return val;
	}
}
