/************************************************
 * Autor: Cristopher Alexis Zarate Valencia		*
 * Fecha de creación: 10 abr. 2023				*
 * Fecha de modificación: 10 abr. 2023			*
 * Descripción: Escribir una función que calcule el área de un círculo y otra que calcule el
		volumen de un cilindro usando la primera función.
 ************************************************/
package funciones;

/**
 * @author cristopher
 *
 */
public class Ejercicio1 {
	public static void main(String[] args) {
		int radio = 5,altura = 6;
		
		System.out.println("El de la base es " + Area(radio));
		System.out.println("El volumen del cilindro es " + Volumen(radio,altura));
	}
	
	public static double Area(int radio) {
		return Math.PI * Math.pow(radio, 2) / 2.0;
	}
	
 	public static double Volumen(int radio, int altura) {
		return Area(radio) * altura;
	}
}
