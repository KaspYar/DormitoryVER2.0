package view;

import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JButton;

import java.awt.event.ActionEvent;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.DefaultListModel;
import javax.swing.SwingConstants;
import javax.swing.JToolBar;
import javax.swing.JSpinner;
import javax.swing.JList;
import javax.swing.JScrollBar;
import javax.swing.JComboBox;


public class LogIn extends MyPanel {
	
	String txtBtnLogIn = "Log In";
	String txtLblYourLogin = "Your login:";
	String txtLblYourPswd = "Your password :";
	String txtLblGreetings = "Sing up to work";
	String txtBtnSpravka = "Tip";
	String txtLblInfoTool = "If you are a student, guest or worker enter your surname and password 11111";
	String [] lstBoxUser = {"Administrator","Commandant","Student","Worker", "Guest"};
	
	
	private JButton btnLogIn;
	private JTextField textFieldLogin;
	private JPasswordField textFieldPswd;
	private JLabel lblGreeting;
	private JLabel lblInfoTool;
	private JButton btnSpravka;
	private JComboBox<String> boxUser;
	private JLabel lblYourLogin;
	private JLabel lblYourPassword;
	

	public JButton getLogInBtn() {
		return btnLogIn;
	}

	public LogIn() {

		btnLogIn = new JButton(txtBtnLogIn);
		btnLogIn.setBounds(350, 320, 100, 23);
		add(btnLogIn);
		
		textFieldLogin = new JTextField();
		textFieldLogin.setBounds(350, 250, 100, 20);
		add(textFieldLogin);
		textFieldLogin.setColumns(10);
		
		textFieldPswd = new JPasswordField();
		textFieldPswd.setBounds(350, 285, 100, 20);
		add(textFieldPswd);
		
		lblYourLogin = new JLabel(txtLblYourLogin);
		lblYourLogin.setBounds(244, 250, 100, 20);
		add(lblYourLogin);
		
		lblYourPassword = new JLabel(txtLblYourPswd);
		lblYourPassword.setBounds(244, 285, 100, 20);
		add(lblYourPassword);
		
		lblGreeting = new JLabel(txtLblGreetings);
		lblGreeting.setForeground(Color.WHITE);
		lblGreeting.setHorizontalAlignment(SwingConstants.CENTER);
		lblGreeting.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblGreeting.setBounds(204, 99, 387, 96);
		add(lblGreeting);
		
		lblInfoTool = new JLabel(txtLblInfoTool);
		lblInfoTool.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblInfoTool.setBounds(55, 11, 735, 110);
		lblInfoTool.setVisible(false);
		add(lblInfoTool);
		
		btnSpravka = new JButton(txtBtnSpravka);
		btnSpravka.setBounds(701, 11, 89, 23);
		add(btnSpravka);
		
		boxUser = new JComboBox<String>(lstBoxUser);
		boxUser.setBounds(302, 206, 189, 23);
		add(boxUser);
	}

	public JButton getBtnLogIn() {
		return btnLogIn;
	}

	public JPasswordField getTextFieldPswd() {
		return textFieldPswd;
	}

	public JLabel getLblInfoTool() {
		return lblInfoTool;
	}

	public JButton getBtnSpravka() {
		return btnSpravka;
	}
	
	public JTextField getTextFieldLogin() {
		return textFieldLogin;
	}

	public JComboBox<String> getBoxUser() {
		return boxUser;
	}

	public void addListener(ActionListener l) {
		btnLogIn.addActionListener(l);
		btnSpravka.addActionListener(l);
		boxUser.addActionListener(l);

	}
}
