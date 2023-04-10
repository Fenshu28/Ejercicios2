/************************************************
 * Autor: Cristopher Alexis Zarate Valencia		*
 * Fecha de creación: 10 abr. 2023				*
 * Fecha de modificación: 10 abr. 2023			*
 * Descripción: Dada una secuencia de números terminada en cero, elaborar un algoritmo para
		calcular el porcentaje y la suma de los números impares, el porcentaje y la
		suma de los números pares, y la suma de todos los números, y cuántos
		números fueron ingresados.
 ************************************************/
package instrc_iterar;

import java.util.Scanner;

/**
 * @author cristopher
 *
 */
public class Ejercicio4 {
	public static void main(String[] args) {
		float Nums[] = new float[99];
		int n = 0,numImp=0,numPar=0,sumTot=0,sumImp=0,sumPar=0;
		Scanner rd = new Scanner(System.in);
				
		do {
			Nums[n] = rd.nextFloat();
			
			n++;
		}while(Nums[n-1] != 0);
		
		
		for (int i = 0; i < n; i++) {
			if(Nums[i]%2 != 0) { // Numeros pares
				numPar++;
				sumPar+=Nums[i];
			}else { // Numeros impares
				numImp++;
				sumImp+=Nums[i];
			}
			sumTot+=Nums[i];
		}
		
		System.out.println("Porcentaje de pares: " + (numPar*100)/n + " %");
		System.out.println("Suma de pares: " + sumPar);
		System.out.println("Porcentaje de impares: " + (numImp*100)/n + " %");
		System.out.println("Suma de pares: " + sumImp);
		System.out.println("Total de números: " + n);
		System.out.println("Suma total: " + sumTot);
		
		
	}
}
