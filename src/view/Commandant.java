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

import javax.swing.AbstractButton;
import javax.swing.DefaultListModel;
import javax.swing.SwingConstants;
import javax.swing.JToolBar;
import javax.swing.JSpinner;
import javax.swing.JList;
import javax.swing.JScrollBar;
import javax.swing.JTabbedPane;
import javax.swing.JDesktopPane;
import javax.swing.JCheckBox;
import javax.swing.JMenuBar;

public class Commandant extends MyPanel {
	String txtLblCommandant = "Commandant";
	String txtBtnSettle = "Settle";
	String txtBtnResettle = "Resettle";
	String txtBtnEvict = "Evict";
	String txtBtnInformation = "Information";
	String txtBtnBack = "Back";
	
	
	private JButton btnSettle;
	private JButton btnResettle;
	private JButton btnEvict;
	private JButton btnInformation;
	private JLabel lblCommandant;
	private JButton btnBack;
	
	
	public Commandant() {
		
		lblCommandant = new JLabel(txtLblCommandant);
		lblCommandant.setFont(new Font("Tahoma", Font.PLAIN, 34));
		lblCommandant.setBounds(315, 29, 200, 50);
		add(lblCommandant);
		
		btnSettle = new JButton(txtBtnSettle);
		btnSettle.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnSettle.setBounds(343, 130, 145, 23);
		add(btnSettle);
		
		btnResettle = new JButton(txtBtnResettle);
		btnResettle.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnResettle.setBounds(343, 205, 145, 23);
		add(btnResettle);
		
		btnEvict = new JButton(txtBtnEvict);
		btnEvict.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnEvict.setBounds(343, 293, 145, 23);
		add(btnEvict);
		
		btnInformation = new JButton(txtBtnInformation);
		btnInformation.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnInformation.setBounds(343, 389, 145, 23);
		add(btnInformation);
		
		btnBack = new JButton(txtBtnBack);
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnBack.setBounds(668, 452, 89, 23);
		add(btnBack);
		
	
	}
	public void addListener(ActionListener l) {
		btnSettle.addActionListener(l);
		btnResettle.addActionListener(l);
		btnEvict.addActionListener(l);
		btnInformation.addActionListener(l);
		btnBack.addActionListener(l);

	}
}
