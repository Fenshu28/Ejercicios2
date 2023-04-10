/************************************************
 * Autor: Cristopher Alexis Zarate Valencia		*
 * Fecha de creación: 10 abr. 2023				*
 * Fecha de modificación: 10 abr. 2023			*
 * Descripción: Leer números enteros positivos de teclado, hasta que el usuario ingrese el
		número cero e informar cuál fue el mayor y el menor número ingresado.
 ************************************************/
package instrc_iterar;

import java.util.Scanner;

/**
 * @author cristopher
 *
 */
public class Ejercicio7 {
	public static void main(String[] args) {
		int aux,n=0;
		Scanner rd = new Scanner(System.in);
		
		System.out.println("ingresa números y finaliza con la insersión con un 0");
		do {
			aux = rd.nextInt();
			if(aux == 0) {
				break;
			}else if(aux > n) {
				n = aux;
			}			
		}while(aux > 0);
		
		System.out.println("El número mayor es " + n);
	}
}







