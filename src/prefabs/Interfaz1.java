package prefabs;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Interfaz1 extends JFrame implements ActionListener,KeyListener{
//	static JLabel lbNum1,lbNum2,lbNumeros;
//	static JTextField txtNum1,txtNum2;
//	static JButton btnAceptar;
	
	public Interfaz1(){
//		lbNum1 = new JLabel("Número 1");
//		lbNum2 = new JLabel("Número 2");
//		lbNumeros = new JLabel("");
//		txtNum1 = new JTextField(); 
//		txtNum2 = new JTextField();
//		btnAceptar = new JButton("Aceptar");
		
		setSize(300, 300);
		setResizable(false);
		setLocationRelativeTo(null);
		setTitle("Ejercicio de repaso");
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
//		lbNum1.setBounds(100, 50, 100, 20);
//		txtNum1.setBounds(100, 80, 100, 20);
//		lbNum2.setBounds(100, 110, 100, 20);
//		txtNum2.setBounds(100, 140, 100, 20);
//		btnAceptar.setBounds(100, 170, 100, 30);
		
//		btnAceptar.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				lbNumeros.setText("Los números que ingresaste son " + txtNum1.getText() +" y " + txtNum2.getText());
//			}
//		});
		
//		add(lbNum1);
//		add(txtNum1);
//		add(lbNum2);		
//		add(txtNum2);
//		add(btnAceptar);
//		add(lbNumeros);
		
//		setVisible(true);
	}
	
	public static void setLimit(int n) {
		
	}
	
	public static void main(String[] args) {
		Interfaz1 wn = new Interfaz1();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
