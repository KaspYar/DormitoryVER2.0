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

public class AddDormitory extends MyPanel{
	
	private String txtlblAddDormitory = "Add dormitory";
	private String txtlblIdDormitoryAddDorm = "ID Dormitory";
	private String txtlblAddressAddDorm = "Address";
	private String txtlblCommandantAddDorm = "Comandant";
	private String txtbtnGoBack = "Go back";
	private String txtbtnSave = "Save";
	private String txtbtnReset = "Reset";
	
	
	
	private JTextField textFieldIDDormitoryAddDorm;
	private JTextField textFieldAddressAddDorm;
	
	private JLabel lblAddDormitory;
	private JLabel lblIdDormitoryAddDorm;
	private JLabel lblAddressAddDorm;
	private JLabel lblCommandantAddDorm;
	
	private JPanel panel;
	
	private JComboBox comboBoxCommandantAddDorm;
	
	private JButton btnSave;
	private JButton btnReset;
	
	private JSeparator separator;
	private JButton btnGoBack;
	
	public AddDormitory() {
		
		lblAddDormitory = new JLabel(txtlblAddDormitory);
		lblAddDormitory.setForeground(Color.WHITE);
		lblAddDormitory.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblAddDormitory.setBounds(350, 20, 165, 29);
		add(lblAddDormitory);
		
		panel = new JPanel();
		panel.setBounds(160, 123, 527, 270);
		add(panel);
		panel.setLayout(null);
		
		lblIdDormitoryAddDorm = new JLabel(txtlblIdDormitoryAddDorm);
		lblIdDormitoryAddDorm.setBounds(160, 25, 87, 14);
		panel.add(lblIdDormitoryAddDorm);
		
		textFieldIDDormitoryAddDorm = new JTextField();
		textFieldIDDormitoryAddDorm.setBounds(240, 22, 122, 20);
		panel.add(textFieldIDDormitoryAddDorm);
		textFieldIDDormitoryAddDorm.setColumns(10);
		
		lblAddressAddDorm = new JLabel(txtlblAddressAddDorm);
		lblAddressAddDorm.setBounds(160, 70, 46, 14);
		panel.add(lblAddressAddDorm);
		
		textFieldAddressAddDorm = new JTextField();
		textFieldAddressAddDorm.setBounds(240, 67, 122, 20);
		panel.add(textFieldAddressAddDorm);
		textFieldAddressAddDorm.setColumns(10);
		
		lblCommandantAddDorm = new JLabel(txtlblCommandantAddDorm);
		lblCommandantAddDorm.setBounds(160, 115, 71, 14);
		panel.add(lblCommandantAddDorm);
		
		comboBoxCommandantAddDorm = new JComboBox();
		comboBoxCommandantAddDorm.setBounds(240, 112, 122, 20);
		panel.add(comboBoxCommandantAddDorm);
		
		btnSave = new JButton(txtbtnSave);
		btnSave.setBounds(150, 222, 89, 23);
		panel.add(btnSave);
		
		btnReset = new JButton(txtbtnReset);
		btnReset.setBounds(300, 222, 89, 23);
		panel.add(btnReset);
		
		separator = new JSeparator();
		separator.setBounds(0, 60, 800, 2);
		add(separator);
		
		btnGoBack = new JButton("Go back");
		btnGoBack.setBounds(679, 20, 89, 23);
		add(btnGoBack);
	}
	public void addListener(ActionListener l) {
		btnGoBack.addActionListener(l);
		btnSave.addActionListener(l);
		btnReset.addActionListener(l);
	}
	public JButton getBtnSave() {
		return btnSave;
	}
	public JButton getBtnReset() {
		return btnReset;
	}
	public JButton getBtnGoBack() {
		return btnGoBack;
	}
}
