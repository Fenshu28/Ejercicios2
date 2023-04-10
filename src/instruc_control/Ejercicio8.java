/************************************************
 * Autor: Cristopher Alexis Zarate Valencia		*
 * Fecha de creación: 9 abr. 2023				*
 * Fecha de modificación: 10 abr. 2023			*
 * Descripción: Dados dos valores X e Y que forman un intervalo cerrado, y un valor W, realice
		un programa para determinar si W está dentro o fuera del intervalo.
 ************************************************/
package instruc_control;

/**
 * @author cristopher
 *
 */
public class Ejercicio8 {
	public static void main(String[] args) {
		int x= 10,y=20,w=12;
		if(w>x && w<y) {
			System.out.println("Esta en el intervalo");
		}else {
			System.out.println("No esta en el intervalo");
		}
	}	
}
