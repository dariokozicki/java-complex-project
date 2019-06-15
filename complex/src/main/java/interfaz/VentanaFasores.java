package interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

public class VentanaFasores extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaFasores frame = new VentanaFasores();
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
	public VentanaFasores() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 311, 311);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIngreseLosFasores = new JLabel("Ingrese los fasores");
		lblIngreseLosFasores.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblIngreseLosFasores.setBounds(80, 11, 120, 23);
		contentPane.add(lblIngreseLosFasores);
		
		JLabel lblNewLabel = new JLabel("Amplitud");
		lblNewLabel.setBounds(10, 39, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel label = new JLabel("Amplitud");
		label.setBounds(180, 39, 46, 14);
		contentPane.add(label);
		
		JLabel lblFrecuencia = new JLabel("Frecuencia");
		lblFrecuencia.setBounds(10, 94, 60, 14);
		contentPane.add(lblFrecuencia);
		
		JLabel lblFase = new JLabel("Fase");
		lblFase.setBounds(10, 147, 31, 14);
		contentPane.add(lblFase);
		
		JLabel label_1 = new JLabel("Frecuencia");
		label_1.setBounds(180, 94, 60, 14);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("Fase");
		label_2.setBounds(180, 147, 31, 14);
		contentPane.add(label_2);
		
		textField = new JTextField();
		textField.setBounds(10, 63, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(10, 116, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(10, 172, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(180, 63, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(180, 119, 86, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(180, 172, 86, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
	}

}
