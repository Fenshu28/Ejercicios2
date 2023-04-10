/************************************************
 * Autor: Cristopher Alexis Zarate Valencia		*
 * Fecha de creación: 7 abr. 2023				*
 * Fecha de modificación: 10 abr. 2023			*
 * Descripción: Una juguetería tiene mucho 
 * 	éxito en dos de sus productos: payasos y 
 * 	muñecas. Suele hacer venta por correo y 
 * 	la empresa de logística les cobra por peso 
 * 	de cada paquete así que deben calcular el
 * 	peso de los payasos y muñecas que
 * 	saldrán en cada paquete a demanda. 
 * 	Cada payaso tiene un peso de 112 g y cada 
 * 	muñeca 75 g. Escribe un programa que lea el 
 * 	número de payasos y muñecas vendidos en el
 * 	último pedido y calcule el peso total del
 * 	paquete que será enviado.
 ************************************************/
package datosbasicos;

import java.util.Scanner;

/**
 * @author cristopher
 *
 */
public class Ejercicio7 {
	public static void main(String[] args) {
		final int pMuñeca = 75;
		final int pPayaso = 112;
		int numPay,numMuñ;
		Scanner rd = new Scanner(System.in);		
		
		System.out.println("Digite el número de muñecas vendidas en el último pedido: ");
		numMuñ = rd.nextInt();
		System.out.println("Digite el número de payasos vendidos en el último pedido: ");
		numPay = rd.nextInt();
		
		System.out.println("El peso total del paquete es " + (numMuñ*pMuñeca+numPay*pPayaso) + " g");
			
	}
}
