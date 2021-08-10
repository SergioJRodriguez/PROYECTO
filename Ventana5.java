package Aplicacion;

import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Font;

public class Ventana5 extends javax.swing.JFrame {
	public Ventana5() {
		setSize(1000, 520);
	componentes5(); 
}
	private void componentes5() {
		JLabel pregunta= new JLabel();
		pregunta.setFont(new java.awt.Font("Arial", 0,20));
		pregunta.setText("estructura rígida en la parte exterior de la membrana celular de los\r\n"
				+ "vegetales, hongos, algas y bacterias que le da la rigidez, para el soporte a la célula");
		 
		JPanel titulo = new JPanel ();
		titulo.setBackground(new java.awt.Color(255,255,255));
		titulo.add(pregunta);
		
		JLabel imagen1 = new JLabel ();
		imagen1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/NCE.jpg")));
		imagen1.setBounds(25, 50, 600, 300);
		
		JLabel imagen2 = new JLabel ();
		imagen2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/PCE.jpg")));
		imagen2.setBounds(500, 0, 600, 300);
		
		JPanel imagenes = new JPanel ();
		imagenes.setBackground(new java.awt.Color(83,73,122));
		imagenes.add(imagen1);
		imagenes.add(imagen2);
		imagenes.setLayout(null);
		imagenes.setBounds(00, 0, 2000, 1000);
		
		JPanel centro = new JPanel();
		centro.setBackground(new java.awt.Color(83,73,122));
		centro.add(imagenes);
		centro.setLayout(null);
		
		add(centro,java.awt.BorderLayout.CENTER);
		add(titulo,java.awt.BorderLayout.PAGE_START);
		
	}
}
