/************************************************
 * Autor: Cristopher Alexis Zarate Valencia		*
 * Fecha de creación: 10 abr. 2023				*
 * Fecha de modificación: 10 abr. 2023			*
 * Descripción: Haga un algoritmo para una función que reciba dos parámetros N y K y que
		retorne los K dígitos más a la izquierda de N. Por ejemplo, extraerDigitos
		(542207, 2) debe retornar 54.
 ************************************************/
package funciones;

/**
 * @author cristopher
 *
 */
public class Ejercicio4 {
	public static void main(String[] args) {
		int k=1354889523,n=4;
		System.out.println("Extraido " + extrarNums(k,n));
	}
	
	public static String extrarNums(int k, int n) {
		String s = String.valueOf(k);
		
		return s.substring(0,n);		
	}
}
