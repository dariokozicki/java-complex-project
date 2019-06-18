package interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class IngresarBasicas extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IngresarBasicas frame = new IngresarBasicas();
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
	public IngresarBasicas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 410, 265);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIngreseLosNumeros = new JLabel("Ingrese los numeros complejos");
		lblIngreseLosNumeros.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblIngreseLosNumeros.setBounds(87, 11, 209, 27);
		contentPane.add(lblIngreseLosNumeros);
		
		textField = new JTextField();
		textField.setBounds(45, 103, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblPrimerNumero = new JLabel("Primer numero");
		lblPrimerNumero.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPrimerNumero.setBounds(45, 78, 86, 14);
		contentPane.add(lblPrimerNumero);
		
		JLabel lblSegundoNumero = new JLabel("Segundo numero");
		lblSegundoNumero.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblSegundoNumero.setBounds(210, 79, 95, 13);
		contentPane.add(lblSegundoNumero);
		
		textField_1 = new JTextField();
		textField_1.setBounds(210, 103, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnCalcular.setBounds(45, 146, 89, 23);
		contentPane.add(btnCalcular);
		
		JButton btnVolverAtras = new JButton("VolverAtrás");
		btnVolverAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnVolverAtras.setBounds(45, 180, 89, 23);
		contentPane.add(btnVolverAtras);
		
		JLabel lblResultado = new JLabel("");
		lblResultado.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblResultado.setBounds(160, 150, 136, 19);
		contentPane.add(lblResultado);
		
		
	}
}
