package Simple_Caculator;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.PermissionCollection;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.naming.spi.DirStateFactory.Result;
import javax.swing.JButton;

public class Calculator extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
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
	public Calculator() {
		setTitle("Caculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("First Number");
		lblNewLabel.setBounds(29, 39, 80, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Second Number");
		lblNewLabel_1.setBounds(29, 82, 80, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Result");
		lblNewLabel_2.setBounds(29, 126, 49, 14);
		contentPane.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(133, 36, 96, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(133, 79, 96, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(133, 123, 96, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton = new JButton("+");
		btnNewButton.setBounds(20, 171, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("*");
		btnNewButton_1.setBounds(20, 205, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("%");
		btnNewButton_2.setBounds(20, 239, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("-");
		btnNewButton_3.setBounds(181, 171, 89, 23);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("/");
		btnNewButton_4.setBounds(181, 205, 89, 23);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("CLEAR");
		btnNewButton_5.setBounds(181, 239, 89, 23);
		contentPane.add(btnNewButton_5);
		btnNewButton.addActionListener(this);
		btnNewButton_1.addActionListener(this);
		btnNewButton_2.addActionListener(this);
		btnNewButton_3.addActionListener(this);
		btnNewButton_4.addActionListener(this);
		btnNewButton_5.addActionListener(this);
	}
	public void doPlus() {
		double result = Double.parseDouble(textField.getText())+ Double.parseDouble(textField_1.getText());
		textField_2.setText(String.valueOf(result));
	}
	public void doMius() {
		double result = Double.parseDouble(textField.getText())- Double.parseDouble(textField_1.getText());
		textField_2.setText(String.valueOf(result));
	}
    public void doMult() {
		double result = Double.parseDouble(textField.getText()) * Double.parseDouble(textField_1.getText());
		textField_2.setText(String.valueOf(result));
	}
    public void doDiv() {
	    double result = Double.parseDouble(textField.getText()) / Double.parseDouble(textField_1.getText());
	    textField_2.setText(String.valueOf(result));
	} 
    public void doPerc() {
	    double result = Double.parseDouble(textField.getText()) % Double.parseDouble(textField_1.getText());
	    textField_2.setText(String.valueOf(result));
	} 
    public void doClear(){
    	textField.setText("");
    	textField_1.setText("");
    	textField_2.setText("");
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand()=="+")
			doPlus();
		if(e.getActionCommand()=="-")
			doMius();
		if(e.getActionCommand()=="*")
			doMult();
		if(e.getActionCommand()=="/")
			doDiv();
		if(e.getActionCommand()=="%")
			doPerc();
		if(e.getActionCommand()=="CLEAR")
			doClear();
	}
}
