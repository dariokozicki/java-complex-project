package interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import complex.Complejo;
import complex.FuncionSinusoidal;
import complex.OperacionesAvanzadas;
import complex.OperacionesBasicas;
import complex.Punto;
import complex.SumaFasores;

import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JList;

public class VentanaOperaciones extends JFrame {
	
	private JPanel contentPane;
	private JTextField textNumero1;
	private JTextField textNumero2;

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
		setBounds(100, 100, 548, 343);
		contentPane = new JPanel();
		contentPane.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Seleccione la operacion deseada", TitledBorder.LEADING, TitledBorder.ABOVE_TOP, null, new Color(0, 0, 255)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		DefaultListModel listDefault =new DefaultListModel();
		JList listResultado = new JList();
		listResultado.setBounds(32, 139, 292, 114);
		contentPane.add(listResultado);
		
		JButton btnMultiplicacion = new JButton("Multiplicacion");
		btnMultiplicacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listDefault.clear();
				Complejo complejo1 = new Complejo(textNumero1.getText());
				Complejo complejo2 = new Complejo(textNumero2.getText());
				Punto resultado =OperacionesBasicas.multiplicacion(complejo1.getPunto(), complejo2.getPunto());
				listDefault.addElement(Double.toString(resultado.getRe())+" + "+Double.toString(resultado.getIm())+ " j");
				listResultado.setModel(listDefault);
			}
		});
		btnMultiplicacion.setBounds(351, 95, 120, 23);
		contentPane.add(btnMultiplicacion);
		
		JButton btnCociente = new JButton("Cociente");
		btnCociente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listDefault.clear();
				Complejo complejo1 = new Complejo(textNumero1.getText());
				Complejo complejo2 = new Complejo(textNumero2.getText());
				Punto resultado =OperacionesBasicas.cociente(complejo1.getPunto(), complejo2.getPunto());
				listDefault.addElement(Double.toString(resultado.getRe())+" + "+Double.toString(resultado.getIm())+ " j");
				listResultado.setModel(listDefault);
			}
		});
		btnCociente.setBounds(351, 120, 120, 23);
		contentPane.add(btnCociente);
		
		JButton btnSum = new JButton("Suma");
		btnSum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listDefault.clear();
				Complejo complejo1 = new Complejo(textNumero1.getText());
				Complejo complejo2 = new Complejo(textNumero2.getText());
				Punto resultado =OperacionesBasicas.suma(complejo1.getPunto(), complejo2.getPunto());
				listDefault.addElement(Double.toString(resultado.getRe())+" + "+Double.toString(resultado.getIm())+ " j");
				listResultado.setModel(listDefault);
			}
		});
		btnSum.setBounds(351, 72, 120, 23);
		contentPane.add(btnSum);
		
		JButton btnNewButton = new JButton("Resta");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listDefault.clear();
				Complejo complejo1 = new Complejo(textNumero1.getText());
				Complejo complejo2 = new Complejo(textNumero2.getText());
				Punto resultado =OperacionesBasicas.resta(complejo1.getPunto(), complejo2.getPunto());
				listDefault.addElement(Double.toString(resultado.getRe())+" + "+Double.toString(resultado.getIm())+ " j");
				listResultado.setModel(listDefault);
			}
		});
		btnNewButton.setBounds(351, 48, 120, 23);
		contentPane.add(btnNewButton);
		
		JButton btnPotencia = new JButton("Potencia");
		btnPotencia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listDefault.clear();
				Complejo complejo1 = new Complejo(textNumero1.getText());
				int exponencial = Integer.valueOf(textNumero2.getText());
				Punto resultado =OperacionesAvanzadas.potencia(complejo1.getPunto(), exponencial);
				listDefault.addElement(Double.toString(resultado.getRe())+" + "+Double.toString(resultado.getIm())+ " j ");
				listResultado.setModel(listDefault);
				
			}
		});
		btnPotencia.setBounds(351, 196, 120, 23);
		contentPane.add(btnPotencia);
		
		JButton btnRadicacion = new JButton("Radicacion");
		btnRadicacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listDefault.clear();
				Complejo complejo1 = new Complejo(textNumero1.getText());
				int exponencial = Integer.valueOf(textNumero2.getText());
				ArrayList<Punto> resultados =OperacionesAvanzadas.raizNescima(complejo1.getPunto(), exponencial);
				resultados.forEach(resultado->listDefault.addElement(
						Double.toString(resultado.getRe())+" + "+Double.toString(resultado.getIm())+ " j ")
				);
				listResultado.setModel(listDefault);
				
			}
		});
		btnRadicacion.setBounds(351, 150, 120, 23);
		contentPane.add(btnRadicacion);
		
		JButton btnRadicacionPrimitivas = new JButton("RaicesPrimitivas");
		btnRadicacionPrimitivas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listDefault.clear();
				Complejo complejo1 = new Complejo(textNumero1.getText());
				int exponencial = Integer.valueOf(textNumero2.getText());
				ArrayList<Punto> resultados =OperacionesAvanzadas.raicesPrimitivas(complejo1.getPunto(), exponencial);
				resultados.forEach(resultado->listDefault.addElement(
						Double.toString(resultado.getRe())+" + "+Double.toString(resultado.getIm())+ " j ")
				);
				listResultado.setModel(listDefault);
				
			}
		});
		btnRadicacionPrimitivas.setBounds(351, 173, 120, 23);
		contentPane.add(btnRadicacionPrimitivas);
		
		JButton btnSumaDeFasores = new JButton("Suma de fasores");
		btnSumaDeFasores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listDefault.clear();
				SumaFasores suma = new SumaFasores(textNumero1.getText(),textNumero2.getText());
				FuncionSinusoidal resultado = suma.sumarFasores();
				listDefault.addElement(
						Double.toString(resultado.getAmplitud())+resultado.getOperacion()+"("+
						Double.toString(resultado.getFrecuencia())+ "t + "+ Double.toString(resultado.getFaseInicial())+")");
				listResultado.setModel(listDefault);
			}
		});
		btnSumaDeFasores.setBounds(351, 230, 120, 23);
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
		lblResultado.setBounds(32, 110, 54, 14);
		contentPane.add(lblResultado);
		
		
		
		
	}
}
