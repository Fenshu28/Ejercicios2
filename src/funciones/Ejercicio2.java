/************************************************
 * Autor: Cristopher Alexis Zarate Valencia		*
 * Fecha de creación: 10 abr. 2023				*
 * Fecha de modificación: 10 abr. 2023			*
 * Descripción: 
 ************************************************/
package funciones;

import java.time.LocalDate;

/**
 * @author cristopher
 *
 */
public class Ejercicio2 {
	public static void main(String[] args) {
		int mes = 4,year = 2023;
		
		System.out.println("El número de días transcurridos son " + numDias(mes,year));
		
	}
	
	public static int numDias(int mes,int year) {	
		return LocalDate.of(year, mes, 1).getDayOfYear();
	}
}
