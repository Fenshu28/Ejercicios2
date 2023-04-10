/************************************************
 * Autor: Cristopher Alexis Zarate Valencia		*
 * Fecha de creación: 8 abr. 2023				*
 * Fecha de modificación: 10 abr. 2023			*
 * Descripción: Escriba un programa que dado el peso de una persona en libras (1 libra =
		0.453592 Kg) y su estatura en centímetros, calcule su IMC e indique como
		salida el peso en kilogramos, el valor de IMC de la persona y la categoría en
		la cual fue clasificado.
 ************************************************/
package instruc_control;

import java.util.Scanner;
import instruc_control.Ejercicio4;

/**
 * @author cristopher
 *
 */
public class Ejercicio5 {
	public static void main(String[] args) {
		double masaLib, masaKg, estatCent, estatMet,imc;
		Scanner rd = new Scanner(System.in);
		Ejercicio4 ej4 = new Ejercicio4();
		
		System.out.println("Ingresa tu masa en libras: ");
		masaLib = rd.nextFloat();
		
		System.out.println("Ingresa tu estatura en centimetros: ");
		estatCent = rd.nextFloat();
		
		masaKg = masaLib*0.453592;
		estatMet = estatCent/100;
		imc = masaKg/Math.pow(estatMet, 2);
		
		System.out.println("Masa en kilogramos es " + masaKg);
		System.out.println("IMC es " + imc);
		System.out.println("Clasificación es " +  ej4.typeImc(imc));
	}
}
