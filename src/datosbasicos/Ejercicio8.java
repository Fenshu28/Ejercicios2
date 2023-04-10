/************************************************
 * Autor: Cristopher Alexis Zarate Valencia		*
 * Fecha de creación: 8 abr. 2023				*
 * Fecha de modificación: 10 abr. 2023			*
 * Descripción: Escriba un programa que
 * 		dados la distancia recorrida por un
 * 		objeto y el tiempo que tomó el objeto
 * 		en recorrer esa distancia, calcule 
 * 		su velocidad.
 ************************************************/
package datosbasicos;

import java.util.Scanner;

/**
 * @author cristopher
 *
 */
public class Ejercicio8 {
	public static void main(String[] args) {
		Scanner rd = new Scanner(System.in);
		int dist,tiem;
		System.out.println("Ingrese la distancia: ");
		dist = rd.nextInt();
		System.out.println("Ingresa el tiempo: ");
		tiem = rd.nextInt();
		
		System.out.println("La velocidad que alcanzo fue " + dist/tiem + " m/s");
	}
}
