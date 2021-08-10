package pruebaproyecto;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ventana extends javax.swing.JFrame {

	public Ventana() {
		initComponents();
		setSize(1000, 520);
	}
	private void initComponents() {

		JLabel etiquetaT = new JLabel();
		etiquetaT.setFont(new java.awt.Font("Arial", 0, 22));
		etiquetaT.setText("DUPLICA LA HISTORIA");

		JButton iniciar = new JButton();
		iniciar.setFont(new java.awt.Font("Tahoma", 0, 36));
		iniciar.setText("Inicia");
		iniciar.setBounds(10, 310, 230, 80);

		JLabel im1 = new JLabel();
		JLabel im2 = new JLabel();
		JLabel im3 = new JLabel();
		JLabel im4 = new JLabel();
		JLabel im5 = new JLabel();
		JLabel im6 = new JLabel();
		JLabel im7 = new JLabel();
		JLabel im8 = new JLabel();
		JLabel im9 = new JLabel();
		JLabel im10 = new JLabel();
		JLabel im11 = new JLabel();
		JLabel im12 = new JLabel();

		im1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Interrogacion.jpg")));
		im1.setBounds(5, 0, 100, 100);
		im2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Interrogacion.jpg")));
		im2.setBounds(113, 0, 100, 100);
		im3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Interrogacion.jpg")));
		im3.setBounds(220, 0, 100, 100);
		im4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Interrogacion.jpg")));
		im4.setBounds(5, 0, 100, 315);
		im5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Interrogacion.jpg")));
		im5.setBounds(113, 0, 100, 315);
		im6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Interrogacion.jpg")));
		im6.setBounds(220, 0, 100, 315);
		im7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Interrogacion.jpg")));
		im7.setBounds(5, 0, 100, 530);
		im8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Interrogacion.jpg")));
		im8.setBounds(113, 0, 100, 530);
		im9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Interrogacion.jpg")));
		im9.setBounds(220, 0, 100, 530);
		im10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Interrogacion.jpg")));
		im10.setBounds(5, 0, 100, 745);
		im11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Interrogacion.jpg")));
		im11.setBounds(113, 0, 100, 745);
		im12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Interrogacion.jpg")));
		im12.setBounds(220, 0, 100, 745);


		JPanel panelcartas = new JPanel();
		panelcartas.setBackground(new java.awt.Color(121, 158, 200));
		panelcartas.setLayout(null);
		panelcartas.setBounds(320, 0, 320, 465);
		panelcartas.add(im1);
		panelcartas.add(im2);
		panelcartas.add(im3);
		panelcartas.add(im4);
		panelcartas.add(im5);
		panelcartas.add(im6);
		panelcartas.add(im7);
		panelcartas.add(im8);
		panelcartas.add(im9);
		panelcartas.add(im10);
		panelcartas.add(im11);
		panelcartas.add(im12);
		
		
		
		JPanel titulo = new JPanel();
		titulo.setBackground(new java.awt.Color(255, 255, 255));
		titulo.add(etiquetaT);

		JPanel info = new JPanel();
		info.setBackground(new java.awt.Color(83, 73, 122));
		info.setLayout(null);
		info.setBounds(320, 0, 260, 420);
		info.add(iniciar);

		JPanel centro = new JPanel();
		centro.setBackground(new java.awt.Color(57, 147, 142));
		centro.setLayout(null);
		centro.add(panelcartas);
		centro.add(info);

		add(centro, java.awt.BorderLayout.CENTER);
		add(titulo, java.awt.BorderLayout.PAGE_START);
		add(info, java.awt.BorderLayout.PAGE_END);
		
		pack();
	}

}