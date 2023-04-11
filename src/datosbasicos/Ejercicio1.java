/************************************************
 * Autor: Cristopher Alexis Zarate Valencia		*
 * Fecha de creación: 8 abr. 2023				*
 * Fecha de modificación: 10 abr. 2023			*
 * Descripción: Escribir un programa que 
 * 		pregunte al usuario por el número de 
 * 		horas trabajadasy el coste por hora. 
 * 		Después debe mostrar por la pantalla 
 * 		la paga total que le corresponde al 
 * 		usuario.
 ************************************************/
package datosbasicos;

import java.awt.Dialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import prefabs.Interfaz1;

public class Ejercicio1 {
	public static void main(String[] args) {
		JLabel lbTit1 = new JLabel("Numero de horas"),lbTit2 = new JLabel("Costo por hora");
		JTextField txtInput1 = new JTextField(), txtInput2 = new JTextField();
		JButton btnOk = new  JButton("Aceptar");		
		
		Interfaz1 win = new Interfaz1();
		
		lbTit1.setBounds(25,50,250,30);
		txtInput1.setBounds(25,90,250,30);
		lbTit2.setBounds(25,130,250,30);
		txtInput2.setBounds(25,170,250,30);
		btnOk.setBounds(25,210,250,30);
		
		win.add(lbTit1);
		win.add(txtInput1);
		win.add(lbTit2);
		win.add(txtInput2);
		win.add(btnOk);
		
		btnOk.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Dialog dlg = new Dialog(win);
				
				JOptionPane.showMessageDialog(null, "Total a pagar $" + 
						(Float.parseFloat(txtInput1.getText())*Float.parseFloat(txtInput2.getText())));
				
			}
		});
		
		win.setVisible(true);
		
	}
}
