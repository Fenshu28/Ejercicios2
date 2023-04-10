/************************************************
 * Autor: Cristopher Alexis Zarate Valencia		*
 * Fecha de creación: 10 abr. 2023				*
 * Fecha de modificación: 10 abr. 2023			*
 * Descripción: Dado un valor n, utilizar ciclos para calcular el valor de la expresión
 ************************************************/
package instrc_iterar;

/**
 * @author cristopher
 *
 */
public class Ejercicio5 {
	public static void main(String[] args) {
		int n = 6; 
		double aux=0,aux2=0;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				aux2 += Math.pow(j, 2);
			}
			aux += aux2;
			aux2 = 0;
		}
		
		System.out.println("total " + aux);
	}
}
