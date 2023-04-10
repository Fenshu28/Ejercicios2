/************************************************
 * Autor: Cristopher Alexis Zarate Valencia		*
 * Fecha de creación: 8 abr. 2023				*
 * Fecha de modificación: 10 abr. 2023			*
 * Descripción: Escribir un programa 
 * 		que pida al usuario dos números enteros
 * 		 y muestre por pantalla el siguiente
 * 		mensaje:“<n> entre <m> da un
 * 		cociente <c> y un resto <r>”
 ************************************************/
package datosbasicos;

import java.util.Scanner;

public class Ejercicio4 {
	
	public static void main(String[] args) {
		Scanner rd = new Scanner(System.in);
		int n,m,r;
		float c;
		System.out.println("Digite un numero numerador");
		n = rd.nextInt();
		System.out.println("Digite un numero donominador");
		m = rd.nextInt();
		
		c = n/m;
		r = n%m;
		
		System.out.println(n + " entre "+ m +" da un cociente "+ c +
				" y un resto " + r);
	}
}
