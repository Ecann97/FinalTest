import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.Box;

public class Interface {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JLabel lblIntegral;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interface window = new Interface();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Interface() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		//This should submit the math for the function
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			lblIntegral.setText(String.valueOf(1));
			
			}
		});
		btnSubmit.setBounds(10, 11, 89, 23);
		frame.getContentPane().add(btnSubmit);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textField_4.setText("");
				textField_5.setText("");
				textField_6.setText("");
				textField_7.setText("");
				textField_8.setText("");
				textField_9.setText("");
				textField_10.setText("");
				
			}
		});
		btnReset.setBounds(335, 11, 89, 23);
		frame.getContentPane().add(btnReset);
		
		JLabel lblX = new JLabel("x");
		lblX.setBounds(70, 86, 29, 14);
		frame.getContentPane().add(lblX);
		
		JLabel label = new JLabel("x");
		label.setBounds(153, 86, 29, 14);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("x");
		label_1.setBounds(231, 86, 29, 14);
		frame.getContentPane().add(label_1);
		
		textField = new JTextField();
		textField.setBounds(39, 83, 22, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(121, 83, 22, 20);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(199, 83, 22, 20);
		frame.getContentPane().add(textField_2);
		
		JLabel label_2 = new JLabel("+");
		label_2.setBounds(96, 82, 8, 23);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("+");
		label_3.setBounds(174, 82, 8, 23);
		frame.getContentPane().add(label_3);
		
		textField_3 = new JTextField();
		textField_3.setBounds(77, 66, 22, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(160, 66, 22, 20);
		frame.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(231, 66, 22, 20);
		frame.getContentPane().add(textField_5);
		
		JLabel lblUpperRange = new JLabel("Upper Range");
		lblUpperRange.setBounds(10, 179, 89, 14);
		frame.getContentPane().add(lblUpperRange);
		
		JLabel lblLowerRange = new JLabel("Lower Range");
		lblLowerRange.setBounds(10, 204, 89, 14);
		frame.getContentPane().add(lblLowerRange);
		
		textField_6 = new JTextField();
		textField_6.setBounds(121, 176, 86, 20);
		frame.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(121, 201, 86, 20);
		frame.getContentPane().add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setBounds(57, 110, 29, 20);
		frame.getContentPane().add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(141, 111, 29, 20);
		frame.getContentPane().add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(224, 111, 29, 20);
		frame.getContentPane().add(textField_10);
		
		lblIntegral = new JLabel("");
		lblIntegral.setBounds(320, 179, 46, 14);
		frame.getContentPane().add(lblIntegral);
	}
}
