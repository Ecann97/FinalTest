import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.Box;

public class System {
	
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
	
	public JTextField getTextField() {
		return textField;
	}
	public void setTextField(JTextField textField) {
		this.textField = textField;
	}
	public JTextField getTextField_1() {
		return textField_1;
	}
	public void setTextField_1(JTextField textField_1) {
		this.textField_1 = textField_1;
	}
	public JTextField getTextField_2() {
		return textField_2;
	}
	public void setTextField_2(JTextField textField_2) {
		this.textField_2 = textField_2;
	}
	public JTextField getTextField_3() {
		return textField_3;
	}
	public void setTextField_3(JTextField textField_3) {
		this.textField_3 = textField_3;
	}
	public JTextField getTextField_4() {
		return textField_4;
	}
	public void setTextField_4(JTextField textField_4) {
		this.textField_4 = textField_4;
	}
	public JTextField getTextField_5() {
		return textField_5;
	}
	public void setTextField_5(JTextField textField_5) {
		this.textField_5 = textField_5;
	}
	public JTextField getTextField_6() {
		return textField_6;
	}
	public void setTextField_6(JTextField textField_6) {
		this.textField_6 = textField_6;
	}
	public JTextField getTextField_7() {
		return textField_7;
	}
	public void setTextField_7(JTextField textField_7) {
		this.textField_7 = textField_7;
	}
	public JTextField getTextField_8() {
		return textField_8;
	}
	public void setTextField_8(JTextField textField_8) {
		this.textField_8 = textField_8;
	}
	public JTextField getTextField_9() {
		return textField_9;
	}
	public void setTextField_9(JTextField textField_9) {
		this.textField_9 = textField_9;
	}
	public JTextField getTextField_10() {
		return textField_10;
	}
	public void setTextField_10(JTextField textField_10) {
		this.textField_10 = textField_10;
	}
	public JLabel getLblIntegral() {
		return lblIntegral;
	}
	public void setLblIntegral(JLabel lblIntegral) {
		this.lblIntegral = lblIntegral;
	}

	public double integrand()
	{
		int a = Integer.getInteger(textField.getText()).intValue(); //c
		int d = Integer.getInteger(textField_3.getText()).intValue(); //e
		int i = Integer.getInteger(textField_8.getText()).intValue(); //d
		
		int b = Integer.getInteger(textField_1.getText()).intValue(); //c
		int e = Integer.getInteger(textField_4.getText()).intValue(); //e
		int j = Integer.getInteger(textField_9.getText()).intValue(); //d
		
		int c = Integer.getInteger(textField_2.getText()).intValue(); //c
		int f = Integer.getInteger(textField_5.getText()).intValue(); //e
		int k = Integer.getInteger(textField_10.getText()).intValue(); //d
		
		int g = Integer.getInteger(textField_6.getText()).intValue(); //u
		int h = Integer.getInteger(textField_7.getText()).intValue(); //l
		
		
		
		
		
		double y = ( ((a*(g^(d+1)))/(i*(d+1)))+((b*(g^(e+1)))/(j*(e+1)))+((c*(g^(f+1)))/(k*(f+1))) );
		double t = ( ((a*(h^(d+1)))/(i*(d+1)))+((b*(h^(e+1)))/(j*(e+1)))+((c*(h^(f+1)))/(k*(f+1))) );
		
		double u = y - t;
		
		return u;
	}
	
}
