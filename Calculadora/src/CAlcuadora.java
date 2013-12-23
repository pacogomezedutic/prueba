import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class CAlcuadora extends JFrame {

	private JPanel contentPane;
	private JTextField num1;
	private JTextField num2;
	private JTextField result;

	/**
	 * Create the frame.
	 */
	public CAlcuadora() {
		setTitle("CALCULADORA SENCILLA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 248, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNmero = new JLabel("N\u00FAmero 1");
		lblNmero.setBounds(36, 31, 46, 14);
		contentPane.add(lblNmero);
		
		JLabel lblNmero_1 = new JLabel("N\u00FAmero 2");
		lblNmero_1.setBounds(134, 31, 46, 14);
		contentPane.add(lblNmero_1);
		
		num1 = new JTextField();
		num1.setBounds(36, 69, 46, 20);
		contentPane.add(num1);
		num1.setColumns(10);
		
		num2 = new JTextField();
		num2.setColumns(10);
		num2.setBounds(134, 69, 46, 20);
		contentPane.add(num2);
		
		JButton btnNewButton = new JButton("+");
		btnNewButton.setBounds(36, 110, 46, 23);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("-");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button.setBounds(36, 144, 46, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("*");
		button_1.setBounds(134, 110, 46, 23);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("/");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					float division=0;
					division=Float.parseFloat(num1.getText())/Float.parseFloat(num2.getText());
					result.setText(String.valueOf(division));
				}catch (NumberFormatException excepcion){
					System.out.println("Error");
				}
			}
		});
		button_2.setBounds(134, 144, 46, 23);
		contentPane.add(button_2);
		
		JLabel lblResultado = new JLabel("Resultado");
		lblResultado.setBounds(83, 178, 58, 14);
		contentPane.add(lblResultado);
		
		result = new JTextField();
		result.setColumns(10);
		result.setBounds(36, 199, 144, 20);
		contentPane.add(result);
	}
}
