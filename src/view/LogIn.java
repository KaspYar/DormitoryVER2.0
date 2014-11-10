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

public class LogIn extends MyPanel {
	private JButton btnLogIn;
	private JTextField textFieldLogin;
	private JPasswordField textFieldPswd;
	private JLabel lblGreeting;
	private JLabel lblInfoTool;
	private JButton btnSpravka;

	

	public JButton getLogInBtn() {
		return btnLogIn;
	}

	public LogIn() {

		btnLogIn = new JButton("\u0423\u0432\u0456\u0439\u0442\u0438");
		btnLogIn.setBounds(350, 320, 100, 23);
		add(btnLogIn);
		
		textFieldLogin = new JTextField();
		textFieldLogin.setBounds(350, 250, 100, 20);
		add(textFieldLogin);
		textFieldLogin.setColumns(10);
		
		textFieldPswd = new JPasswordField();
		textFieldPswd.setBounds(350, 285, 100, 20);
		add(textFieldPswd);
		
		JLabel label = new JLabel("\u041B\u043E\u0433\u0456\u043D:");
		label.setBounds(294, 250, 50, 20);
		add(label);
		
		JLabel label_1 = new JLabel("\u041F\u0430\u0440\u043E\u043B\u044C:");
		label_1.setBounds(294, 285, 50, 20);
		add(label_1);
		
		lblGreeting = new JLabel("\u0423\u0432\u0456\u0439\u0434\u0456\u0442\u044C, \u0449\u043E\u0431 \u0440\u043E\u0437\u043F\u043E\u0447\u0430\u0442\u0438 \u0440\u043E\u0431\u043E\u0442\u0443");
		lblGreeting.setForeground(Color.WHITE);
		lblGreeting.setHorizontalAlignment(SwingConstants.CENTER);
		lblGreeting.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblGreeting.setBounds(152, 74, 509, 150);
		add(lblGreeting);
		
		lblInfoTool = new JLabel("\u042F\u043A\u0449\u043E \u0432\u0438 \u0441\u0442\u0443\u0434\u0435\u043D\u0442, \u0442\u043E \u0432\u0432\u0435\u0434\u0456\u0442\u044C \u0432 \u043F\u043E\u043B\u0435 \u041B\u043E\u0433\u0456\u043D \u0441\u0432\u043E\u0454 \u043F\u0440\u0456\u0437\u0432\u0438\u0449\u0435, \u0430 \u0432 \u043F\u043E\u043B\u0435 \u041F\u0430\u0440\u043E\u043B\u044C 11111(\u043F'\u044F\u0442\u044C \u043E\u0434\u0438\u043D\u0438\u0447\u043E\u043A) \u0442\u0430 \u043D\u0430\u0442\u0438\u0441\u043D\u0456\u0442\u044C \u0423\u0432\u0456\u0439\u0442\u0438.");
		lblInfoTool.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblInfoTool.setBounds(55, 11, 735, 110);
		lblInfoTool.setVisible(false);
		add(lblInfoTool);
		
		btnSpravka = new JButton("\u0421\u043F\u0440\u0430\u0432\u043A\u0430");
		btnSpravka.setBounds(701, 11, 89, 23);
		add(btnSpravka);
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

	public void addListener(ActionListener l) {
		btnLogIn.addActionListener(l);
		btnSpravka.addActionListener(l);

	}
}
