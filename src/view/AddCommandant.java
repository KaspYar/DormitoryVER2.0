package view;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JCheckBox;
import javax.swing.JLayeredPane;
import javax.swing.JSeparator;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.JSplitPane;
import javax.swing.JDesktopPane;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.JTable;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;

public class AddCommandant extends MyPanelWithLogOut{
	
	private String txtlblAddCommandant = "Add commandant";
	private String txtlblNameAddComm = "Name";
	private String txtlblSurnameAddComm = "Surname";
	private String txtlblPhoneAddComm = "Phone";
	private String txtlblSsnAddComm = "SSN";
		
	private String txtbtnSaveAddComm = "Save";
	private String txtbtnResetAddComm = "Reset";
	
	private JTextField textFieldNameAddComm;
	private JTextField textFieldSurnameAddComm;
	private JTextField textFieldPhoneAddComm;
	private JTextField textField;
	
	private JLabel lblAddCommandant;
	private JLabel lblNameAddComm;
	private JLabel lblSurnameAddComm;
	private JLabel lblPhoneAddComm;
	private JLabel lblSsnAddComm;
	
	private JButton btnSaveAddComm;
	private JButton btnResetAddComm;
	
	private JSeparator separator;
	private JPanel panel;
	
	public AddCommandant() {
		
		
		separator = new JSeparator();
		separator.setBounds(0, 60, 800, 2);
		add(separator);
		
		lblAddCommandant = new JLabel(txtlblAddCommandant);
		lblAddCommandant.setBounds(320, 25, 230, 24);
		lblAddCommandant.setForeground(new Color(255, 255, 255));
		lblAddCommandant.setFont(new Font("Tahoma", Font.PLAIN, 26));
		add(lblAddCommandant);
		
		panel = new JPanel();
		panel.setBounds(160, 123, 527, 270);
		add(panel);
		panel.setLayout(null);
		
		lblNameAddComm = new JLabel(txtlblNameAddComm);
		lblNameAddComm.setBounds(160, 25, 46, 14);
		panel.add(lblNameAddComm);
		
		textFieldNameAddComm = new JTextField();
		textFieldNameAddComm.setBounds(240, 22, 122, 20);
		panel.add(textFieldNameAddComm);
		textFieldNameAddComm.setColumns(10);
		
		lblSurnameAddComm = new JLabel(txtlblSurnameAddComm);
		lblSurnameAddComm.setBounds(160, 70, 46, 14);
		panel.add(lblSurnameAddComm);
		
		textFieldSurnameAddComm = new JTextField();
		textFieldSurnameAddComm.setBounds(240, 67, 122, 20);
		panel.add(textFieldSurnameAddComm);
		textFieldSurnameAddComm.setColumns(10);
		
		lblPhoneAddComm = new JLabel(txtlblPhoneAddComm);
		lblPhoneAddComm.setBounds(160, 115, 46, 14);
		panel.add(lblPhoneAddComm);
		
		textFieldPhoneAddComm = new JTextField();
		textFieldPhoneAddComm.setBounds(240, 112, 122, 20);
		panel.add(textFieldPhoneAddComm);
		textFieldPhoneAddComm.setColumns(10);
		
		lblSsnAddComm = new JLabel(txtlblSsnAddComm);
		lblSsnAddComm.setBounds(160, 160, 46, 14);
		panel.add(lblSsnAddComm);
		
		textField = new JTextField();
		textField.setBounds(240, 157, 122, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		btnSaveAddComm = new JButton(txtbtnSaveAddComm);
		btnSaveAddComm.setBounds(150, 222, 89, 23);
		panel.add(btnSaveAddComm);
		
		btnResetAddComm = new JButton(txtbtnResetAddComm);
		btnResetAddComm.setBounds(300, 222, 89, 23);
		panel.add(btnResetAddComm);
	}
      public void addListener(ActionListener l) {
		
		btnSaveAddComm.addActionListener(null);
		btnResetAddComm.addActionListener(null);
	}
}
