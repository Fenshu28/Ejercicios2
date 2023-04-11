/************************************************
 * Autor: Cristopher Alexis Zarate Valencia		*
 * Fecha de creación: 10 abr. 2023				*
 * Fecha de modificación: 10 abr. 2023			*
 * Descripción: Solicitar números al usuario hasta que ingrese el cero. Por cada uno, mostrar la
		suma de sus dígitos. Al finalizar, mostrar la sumatoria de todos los números
		ingresados y la suma de sus dígitos. Reutilizar la misma función realizada en el
		Ejercicio N°8.
 ************************************************/
package funciones;

import java.util.Scanner;

public class Ejercicio7 {
	static int n;
	public static void main(String[] args) {
		Scanner rd = new Scanner(System.in);
		int aux = 0,suma = 0,sumaDig = 0;
		System.out.println("Ingresa tus números: ");
		do {
			aux = rd.nextInt();
			
			if(aux == 0) {
				break;
			}
			suma += aux;
			sumaDig += sumDig(aux);
			System.out.println("La suma de sus dígitos es " + sumDig(aux));
			
		} while (aux > 0);
		
		System.out.println("Suma total de los números ingresados: " + suma);
		System.out.println("Suma toal de los dígitos: " + sumaDig);
		
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
