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

import java.awt.Choice;

import javax.swing.JTable;

import java.awt.List;

import javax.swing.JEditorPane;
import javax.swing.JComboBox;
import javax.swing.border.LineBorder;

public class SettleAdmin extends MyPanel{
	
	String txtLblSettle = "Settle";
	String txtBtnSettlecreateLiving = "Settle/Create Living";
	String txtBtnBack = "Back";
	String txtLblSelect = "Select";
    	
	

	private JTable tableStudent;
	private AbstractButton btnSettlecreateLiving;
	private AbstractButton btnBack;
	private Choice boxStudent;
	private JLabel lblSettle;
	private JLabel lblSelect;
	
	public SettleAdmin() {
		
		Choice boxStudent = new Choice();
		boxStudent.setBounds(140, 120, 200, 50);
		add(boxStudent);
		
		JLabel lblSettle = new JLabel("Settle");
		lblSettle.setFont(new Font("Tahoma", Font.PLAIN, 34));
		lblSettle.setBounds(363, 26, 200, 50);
		add(lblSettle);
		
		
		JButton btnSettlecreateLiving = new JButton("Settle/Create living");
		btnSettlecreateLiving.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnSettlecreateLiving.setBounds(62, 426, 158, 23);
		add(btnSettlecreateLiving);
		
		JButton btnBack = new JButton("Back");
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnBack.setBounds(666, 439, 89, 23);
		add(btnBack);
		
		tableStudent = new JTable();
		tableStudent.setBorder(new LineBorder(new Color(0, 0, 153), 3));
		tableStudent.setBounds(62, 184, 412, 148);
		add(tableStudent);
		
		JLabel lblSelect = new JLabel("Select");
		lblSelect.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSelect.setBounds(62, 108, 72, 40);
		add(lblSelect);
		
	
		
		
	
	}
	public void addListener(ActionListener l) {
		btnSettlecreateLiving.addActionListener(l);
		btnBack.addActionListener(l);

	}
}
