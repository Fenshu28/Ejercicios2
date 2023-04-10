/************************************************
 * Autor: Cristopher Alexis Zarate Valencia		*
 * Fecha de creación: 8 abr. 2023				*
 * Fecha de modificación: 10 abr. 2023			*
 * Descripción: El IMC resulta de la división de la masa del individuo (en kilogramos) entre el
		cuadrado de la estatura (en metros). El índice de masa corporal es un indicador
		del peso de una persona en relación con su altura.
 ************************************************/
package instruc_control;

import java.util.Scanner;

/**
 * @author cristopher
 *
 */
public class Ejercicio4 {
	public void main(String[] args) {
		double masa,altura,imc;
		Scanner rd = new Scanner(System.in);
		
		System.out.println("Ingresa tu masa en kilogramos: ");
		masa = rd.nextDouble();
		
		System.out.println("Ingresa tu altura en metros: ");
		altura = rd.nextDouble();
		
		imc = masa / Math.pow(altura,2);
		
		System.out.println("IMC es " + imc);
		System.out.println(typeImc(imc));
		
	}
	
	public String typeImc(double imc) {
		if(imc < 16) {
			return ("Criterio de ingreso");
		}else if(imc >= 16 && imc <= 16.9) {
			return("Infrapeso");
		}else if(imc >= 17 && imc <= 18.4) {
			return("Bajo peso");
		}else if(imc >= 18.5 && imc <= 24.9) {
			return("Peso normal");
		}else if(imc >= 25 && imc <= 29.9) {
			return("Sobrepeso");
		}else if(imc >= 30 && imc <= 34.9) {
			return("Obesidad premórbida");
		}else if(imc >= 40 && imc <= 45) {
			return("Obesidad mórbida");
		}else if(imc > 45) {
			return("Obesidad hipermórbida");
		}
		return "";
	}
}
