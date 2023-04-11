/************************************************
 * Autor: Cristopher Alexis Zarate Valencia		*
 * Fecha de creación: 10 abr. 2023				*
 * Fecha de modificación: 10 abr. 2023			*
 * Descripción: Haga una función para determinar si un punto (X, Y) está dentro de un
		rectángulo. El rectángulo es definido por la coordenada del vértice superior
		izquierdo, su altura y su ancho.
 ************************************************/
package funciones;

import java.util.Scanner;

/**
 * @author cristopher
 *
 */
public class Ejercicio3 {
	public static void main(String[] args) {
		Scanner rd = new Scanner(System.in);
		int x,y;
		
		System.out.println("Ingresa la x ");
		x = rd.nextInt();
		
		System.out.println("Ingresa la y");
		y = rd.nextInt();
		
		if(isOn(x,y)) {
			System.out.println("Esta dentro del rectangulo.");
		}else {
			System.out.println("No esta dentro del rectangulo.");
		}
	}
	
	public static boolean isOn(int x, int y) {
		int w=200,h=100;
		if (x < w && y < h) {
			return true;
		}
		return false;
	}
}
