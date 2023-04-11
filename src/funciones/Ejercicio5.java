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
	static int t = 0;
	public static void main(String[] args) {
		int n[] = new int[50];
		leer(n);
		
		System.out.println("El número con la mayor suma de digitos es " + numDigMayor(n));
		System.out.println("La cantidad de números con la suma de sus digitos menor a 10 es " + numDigMenorDiez(n));
				
	}
	
	public static int numDigMenorDiez(int n[]) {
		int aux = 0,numMen = 0;
		for (int i = 0; i < t; i++) {
			if(sumDig(n[i]) < 10) {
				numMen = sumDig(n[i]);
				aux ++;
			}
		}
		return aux;
	}
	
	public static int numDigMayor(int n[]) {
		int aux = 0,numMay = 0;
		for (int i = 0; i < t; i++) {
			if(sumDig(n[i]) > numMay) {
				numMay = sumDig(n[i]);
				aux = n[i];
			}
		}
		return aux;
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
	
	public static void leer(int n[]) {
		
		System.out.println("Ingresa los números ");
		do {			
			n[t] = rd.nextInt();
			t++;
		}while(n[t-1] > 0);
		t--;
	}
	
}




