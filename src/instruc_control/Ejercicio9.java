/************************************************
 * Autor: Cristopher Alexis Zarate Valencia		*
 * Fecha de creación: 9 abr. 2023				*
 * Fecha de modificación: 10 abr. 2023			*
 * Descripción: Cree un algoritmo que tome como entrada la hora exacta (horas, minutos,
		segundos y AM/PM) e indique el número de segundos transcurridos durante ese
		día.
 ************************************************/
package instruc_control;

import java.util.Scanner;

/**
 * @author cristopher
 *
 */
public class Ejercicio9 {
	public static void main(String[] args) {
		int h,m,s,totSeg;
		String am_pm = new String();
		
		Scanner rd = new Scanner(System.in);
		
		System.out.println("Ingresa la hora:");
		h = rd.nextInt();
		System.out.println("Ingresa los minutos:");
		m = rd.nextInt();
		System.out.println("Ingresa los segundos:");
		s = rd.nextInt();
		System.out.println("¿am o pm?");
		am_pm = rd.nextLine();
		
		if(am_pm.contains("p")) {
			h += 12;
		}
		
		totSeg = (h*3600) + (m*60) + s;
		
			
		
		
		
		System.out.println("El total de segundos en el día es " + totSeg);
	}
}
