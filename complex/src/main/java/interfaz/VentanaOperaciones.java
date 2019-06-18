package interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import complex.Complejo;
import complex.OperacionesAvanzadas;
import complex.OperacionesBasicas;
import complex.Punto;

import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JList;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class VentanaOperaciones extends JFrame {
	
	private JPanel contentPane;
	private JTextField textNumero1;
	private JTextField textNumero2;
	private JTextField textResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaOperaciones frame = new VentanaOperaciones();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VentanaOperaciones() {
		setResizable(false);
		VentanaOperaciones operacion = this;
		setTitle("Seleccionar Operacion");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Seleccione la operacion deseada", TitledBorder.LEADING, TitledBorder.ABOVE_TOP, null, new Color(0, 0, 255)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnMultiplicacion = new JButton("Multiplicacion");
		btnMultiplicacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Complejo complejo1 = new Complejo(textNumero1.getText());
				Complejo complejo2 = new Complejo(textNumero2.getText());
				Punto resultado =OperacionesBasicas.multiplicacion(complejo1.getPunto(), complejo2.getPunto());
				textResultado.setText(Double.toString(resultado.getRe())+" + "+Double.toString(resultado.getIm())+ " j");
			}
		});
		btnMultiplicacion.setBounds(32, 148, 120, 23);
		contentPane.add(btnMultiplicacion);
		
		JButton btnCociente = new JButton("Cociente");
		btnCociente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Complejo complejo1 = new Complejo(textNumero1.getText());
				Complejo complejo2 = new Complejo(textNumero2.getText());
				Punto resultado =OperacionesBasicas.cociente(complejo1.getPunto(), complejo2.getPunto());
				textResultado.setText(Double.toString(resultado.getRe())+" + "+Double.toString(resultado.getIm())+ " j");
			}
		});
		btnCociente.setBounds(32, 182, 120, 23);
		contentPane.add(btnCociente);
		
		JButton btnSum = new JButton("Suma");
		btnSum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Complejo complejo1 = new Complejo(textNumero1.getText());
				Complejo complejo2 = new Complejo(textNumero2.getText());
				Punto resultado =OperacionesBasicas.suma(complejo1.getPunto(), complejo2.getPunto());
				textResultado.setText(Double.toString(resultado.getRe())+" + "+Double.toString(resultado.getIm())+ " j");
			}
		});
		btnSum.setBounds(162, 148, 120, 23);
		contentPane.add(btnSum);
		
		JButton btnNewButton = new JButton("Resta");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Complejo complejo1 = new Complejo(textNumero1.getText());
				Complejo complejo2 = new Complejo(textNumero2.getText());
				Punto resultado =OperacionesBasicas.resta(complejo1.getPunto(), complejo2.getPunto());
				textResultado.setText(Double.toString(resultado.getRe())+" + "+Double.toString(resultado.getIm())+ " j");
			}
		});
		btnNewButton.setBounds(292, 148, 120, 23);
		contentPane.add(btnNewButton);
		
		JButton btnPotencia = new JButton("Potencia");
		
		btnPotencia.setBounds(292, 182, 120, 23);
		contentPane.add(btnPotencia);
		
		JButton btnRadicacion = new JButton("Radicacion");
		btnRadicacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Complejo complejo1 = new Complejo(textNumero1.getText());
				int exponencial = Integer.valueOf(textNumero2.getText());
				ArrayList<Punto> resultados =OperacionesAvanzadas.raizNescima(complejo1.getPunto(), exponencial);
				resultados.forEach(resultado->textResultado.setText(
						Double.toString(resultado.getRe())+" + "+Double.toString(resultado.getIm())+ " j")
				);
			}
		});
		btnRadicacion.setBounds(162, 182, 120, 23);
		contentPane.add(btnRadicacion);
		
		JButton btnSumaDeFasores = new JButton("Suma de fasores");
		btnSumaDeFasores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//	this.setVisible(false); 
				IngresarBasicas.main();
			}
		});
		btnSumaDeFasores.setBounds(144, 216, 146, 23);
		contentPane.add(btnSumaDeFasores);
		
		JLabel label = new JLabel("Primer Número");
		label.setEnabled(false);
		label.setBounds(32, 48, 81, 14);
		contentPane.add(label);
		
		textNumero1 = new JTextField();
		textNumero1.setBounds(32, 73, 120, 20);
		contentPane.add(textNumero1);
		textNumero1.setColumns(10);
		
		JLabel lblSegundonmero = new JLabel("SegundoN\u00FAmero");
		lblSegundonmero.setEnabled(false);
		lblSegundonmero.setBounds(188, 48, 81, 14);
		contentPane.add(lblSegundonmero);
		
		textNumero2 = new JTextField();
		textNumero2.setBounds(188, 73, 151, 20);
		contentPane.add(textNumero2);
		textNumero2.setColumns(10);
		
		JLabel lblResultado = new JLabel("Resultado");
		lblResultado.setEnabled(false);
		lblResultado.setBounds(87, 115, 54, 14);
		contentPane.add(lblResultado);
		
		textResultado = new JTextField();
		textResultado.setEnabled(false);
		textResultado.setBounds(162, 117, 120, 20);
		contentPane.add(textResultado);
		textResultado.setColumns(10);
	}
}
