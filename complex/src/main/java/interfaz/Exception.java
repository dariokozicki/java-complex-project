package interfaz;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class Exception extends JPanel {
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public Exception() {
		
		textField = new JTextField();
		add(textField);
		textField.setColumns(10);

	}

}
