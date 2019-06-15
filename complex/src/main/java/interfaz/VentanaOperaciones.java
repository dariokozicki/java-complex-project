package interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JList;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaOperaciones extends JFrame {
	
	private JPanel contentPane;

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
				//	this.setVisible(false);
					IngresarBasicas.main();
			}
		});
		btnMultiplicacion.setBounds(32, 59, 120, 23);
		contentPane.add(btnMultiplicacion);
		
		JButton btnCociente = new JButton("Cociente");
		btnCociente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//	this.setVisible(false); 
				IngresarBasicas.main();
			}
		});
		btnCociente.setBounds(32, 103, 120, 23);
		contentPane.add(btnCociente);
		
		JButton btnSum = new JButton("Suma");
		btnSum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//	this.frame.setVisible(false); 
				IngresarBasicas.main();
			}
		});
		btnSum.setBounds(162, 59, 120, 23);
		contentPane.add(btnSum);
		
		JButton btnNewButton = new JButton("Resta");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//	frame.setVisible(false);
				IngresarBasicas.main();
			}
		});
		btnNewButton.setBounds(292, 59, 120, 23);
		contentPane.add(btnNewButton);
		
		JButton btnPotencia = new JButton("Potencia");
		btnPotencia.setBounds(295, 103, 120, 23);
		contentPane.add(btnPotencia);
		
		JButton btnRadicacion = new JButton("Radicacion");
		btnRadicacion.setBounds(162, 103, 120, 23);
		contentPane.add(btnRadicacion);
		
		JButton btnSumaDeFasores = new JButton("Suma de fasores");
		btnSumaDeFasores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//	this.setVisible(false); 
				IngresarBasicas.main();
			}
		});
		btnSumaDeFasores.setBounds(151, 150, 146, 23);
		contentPane.add(btnSumaDeFasores);
	}
}
