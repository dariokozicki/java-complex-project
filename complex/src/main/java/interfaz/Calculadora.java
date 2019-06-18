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

public class Calculadora extends JFrame {
	
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
					Calculadora frame = new Calculadora();
					frame.setVisible(true);
				} catch (RuntimeException e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Calculadora() {
		setResizable(false);
		setTitle("Seleccionar Operacion");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 737, 343);
		contentPane = new JPanel();
		contentPane.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Seleccione la operacion deseada", TitledBorder.LEADING, TitledBorder.ABOVE_TOP, null, new Color(0, 0, 255)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		DefaultListModel listDefault =new DefaultListModel();
		JList listResultado = new JList();
		listResultado.setBounds(10, 139, 559, 114);
		contentPane.add(listResultado);
		
		JButton btnMultiplicacion = new JButton("Multiplicacion");
		btnMultiplicacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				listDefault.clear();
				Complejo complejo1 = new Complejo(textNumero1.getText());
				Complejo complejo2 = new Complejo(textNumero2.getText());
				Punto resultado =OperacionesBasicas.multiplicacion(complejo1.getPunto(), complejo2.getPunto());
				listDefault.addElement(Double.toString(resultado.getRe())+" + "+Double.toString(resultado.getIm())+ " j");
				listResultado.setModel(listDefault);
				}catch(RuntimeException ex) {
					listResultado.setModel(Calculadora.manejoDeErrores(ex));
				}
			}
		});
		btnMultiplicacion.setBounds(585, 101, 120, 23);
		contentPane.add(btnMultiplicacion);
		
		JButton btnCociente = new JButton("Cociente");
		btnCociente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				listDefault.clear();
				Complejo complejo1 = new Complejo(textNumero1.getText());
				Complejo complejo2 = new Complejo(textNumero2.getText());
				Punto resultado =OperacionesBasicas.cociente(complejo1.getPunto(), complejo2.getPunto());
				listDefault.addElement(Double.toString(resultado.getRe())+" + "+Double.toString(resultado.getIm())+ " j");
				listResultado.setModel(listDefault);
				}catch(RuntimeException ex) {
					listResultado.setModel(Calculadora.manejoDeErrores(ex));
				}
			}
		});
		btnCociente.setBounds(585, 136, 120, 23);
		contentPane.add(btnCociente);
		
		JButton btnSum = new JButton("Suma");
		btnSum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				listDefault.clear();
				Complejo complejo1 = new Complejo(textNumero1.getText());
				Complejo complejo2 = new Complejo(textNumero2.getText());
				Punto resultado =OperacionesBasicas.suma(complejo1.getPunto(), complejo2.getPunto());
				listDefault.addElement(Double.toString(resultado.getRe())+" + "+Double.toString(resultado.getIm())+ " j");
				listResultado.setModel(listDefault);
				}catch(RuntimeException ex) {
					listResultado.setModel(Calculadora.manejoDeErrores(ex));
				}
			}
		});
		btnSum.setBounds(585, 62, 120, 23);
		contentPane.add(btnSum);
		
		JButton btnNewButton = new JButton("Resta");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				listDefault.clear();
				Complejo complejo1 = new Complejo(textNumero1.getText());
				Complejo complejo2 = new Complejo(textNumero2.getText());
				Punto resultado =OperacionesBasicas.resta(complejo1.getPunto(), complejo2.getPunto());
				listDefault.addElement(Double.toString(resultado.getRe())+" + "+Double.toString(resultado.getIm())+ " j");
				listResultado.setModel(listDefault);
				}catch(RuntimeException ex) {
					listResultado.setModel(Calculadora.manejoDeErrores(ex));
				}
			}
		});
		btnNewButton.setBounds(585, 28, 120, 23);
		contentPane.add(btnNewButton);
		
		JButton btnPotencia = new JButton("Potencia");
		btnPotencia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				listDefault.clear();
				Complejo complejo1 = new Complejo(textNumero1.getText());
				int exponencial = Integer.valueOf(textNumero2.getText());
				Punto resultado =OperacionesAvanzadas.potencia(complejo1.getPunto(), exponencial);
				listDefault.addElement(Double.toString(resultado.getRe())+" + "+Double.toString(resultado.getIm())+ " j ");
				listResultado.setModel(listDefault);
				}catch(RuntimeException ex) {
					listResultado.setModel(Calculadora.manejoDeErrores(ex));
				}
				
			}
		});
		btnPotencia.setBounds(585, 240, 120, 23);
		contentPane.add(btnPotencia);
		
		JButton btnRadicacion = new JButton("Radicacion");
		btnRadicacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				listDefault.clear();
				Complejo complejo1 = new Complejo(textNumero1.getText());
				int exponencial = Integer.valueOf(textNumero2.getText());
				ArrayList<Punto> resultados =OperacionesAvanzadas.raizNescima(complejo1.getPunto(), exponencial);
				resultados.forEach(resultado->listDefault.addElement(
						Double.toString(resultado.getRe())+" + "+Double.toString(resultado.getIm())+ " j ")
				);
				listResultado.setModel(listDefault);
				}catch(RuntimeException ex) {
					listResultado.setModel(Calculadora.manejoDeErrores(ex));
				}
				
			}
		});
		btnRadicacion.setBounds(585, 170, 120, 23);
		contentPane.add(btnRadicacion);
		
		JButton btnRadicacionPrimitivas = new JButton("RaicesPrimitivas");
		btnRadicacionPrimitivas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				listDefault.clear();
				Complejo complejo1 = new Complejo(textNumero1.getText());
				int exponencial = Integer.valueOf(textNumero2.getText());
				ArrayList<Punto> resultados =OperacionesAvanzadas.raicesPrimitivas(complejo1.getPunto(), exponencial);
				resultados.forEach(resultado->listDefault.addElement(
						Double.toString(resultado.getRe())+" + "+Double.toString(resultado.getIm())+ " j ")
				);
				listResultado.setModel(listDefault);
				}catch(RuntimeException ex) {
					listResultado.setModel(Calculadora.manejoDeErrores(ex));
				}
				
			}
		});
		btnRadicacionPrimitivas.setBounds(585, 206, 120, 23);
		contentPane.add(btnRadicacionPrimitivas);
		
		JButton btnSumaDeFasores = new JButton("Suma de fasores");
		btnSumaDeFasores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				listDefault.clear();
				SumaFasores suma = new SumaFasores(textNumero1.getText(),textNumero2.getText());
				FuncionSinusoidal resultado = suma.sumarFasores();
				listDefault.addElement(
						Double.toString(resultado.getAmplitud())+resultado.getOperacion()+"("+
						Double.toString(resultado.getFrecuencia())+ "t + "+ Double.toString(resultado.getFaseInicial())+")");
				listResultado.setModel(listDefault);
				}catch(RuntimeException ex) {
					listResultado.setModel(Calculadora.manejoDeErrores(ex));
				}
			}
		});
		btnSumaDeFasores.setBounds(585, 274, 120, 23);
		contentPane.add(btnSumaDeFasores);
		
		JLabel label = new JLabel("Primer Número");
		label.setEnabled(false);
		label.setBounds(32, 48, 131, 14);
		contentPane.add(label);
		
		textNumero1 = new JTextField();
		textNumero1.setBounds(32, 73, 120, 20);
		contentPane.add(textNumero1);
		textNumero1.setColumns(10);
		
		JLabel lblSegundonmero = new JLabel("Segundo Número/ Exponente");
		lblSegundonmero.setEnabled(false);
		lblSegundonmero.setBounds(188, 48, 222, 23);
		contentPane.add(lblSegundonmero);
		
		textNumero2 = new JTextField();
		textNumero2.setBounds(188, 73, 151, 20);
		contentPane.add(textNumero2);
		textNumero2.setColumns(10);
		
		JLabel lblResultado = new JLabel("Resultado");
		lblResultado.setEnabled(false);
		lblResultado.setBounds(32, 110, 160, 23);
		contentPane.add(lblResultado);		
	}
	public static DefaultListModel manejoDeErrores(RuntimeException exception){
		DefaultListModel listDefault =new DefaultListModel();
		listDefault.addElement("ERROR!  "+ exception.getMessage());
		listDefault.addElement("Recuerde que:");
		listDefault.addElement("Formato del complejo es ejemplo: 0+5j o (0,5) o [0,2]");
		listDefault.addElement("Formato de la funcion sinusoidal es ejemplo: 5cos(3t+2)");
		return listDefault;
	}
}
