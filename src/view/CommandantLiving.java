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
import javax.swing.border.LineBorder;

public class CommandantLiving extends MyPanel{
	private JTextField textFieldDateFrom;
	private JTextField textFieldDateTo;
	private JTextField textFieldPrice;
	private JTextField textFieldRoom;

	
	public CommandantLiving() {
		
		JLabel lblLiving = new JLabel("Living");
		lblLiving.setFont(new Font("Tahoma", Font.PLAIN, 34));
		lblLiving.setBounds(347, 22, 200, 50);
		add(lblLiving);
		
		JButton btnBack = new JButton("Back");
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnBack.setBounds(668, 422, 89, 23);
		add(btnBack);
		
		JPanel panelLiving = new JPanel();
		panelLiving.setBorder(new LineBorder(new Color(0, 0, 153), 3));
		panelLiving.setBounds(380, 94, 377, 299);
		add(panelLiving);
		
		JCheckBox chckbxStudent = new JCheckBox("Student");
		chckbxStudent.setFont(new Font("Tahoma", Font.PLAIN, 15));
		chckbxStudent.setBounds(48, 94, 97, 23);
		add(chckbxStudent);
		
		JCheckBox chckbxWorker = new JCheckBox("Worker");
		chckbxWorker.setFont(new Font("Tahoma", Font.PLAIN, 15));
		chckbxWorker.setBounds(48, 136, 97, 23);
		add(chckbxWorker);
		
		JCheckBox chckbxGuest = new JCheckBox("Guest");
		chckbxGuest.setFont(new Font("Tahoma", Font.PLAIN, 15));
		chckbxGuest.setBounds(48, 178, 97, 23);
		add(chckbxGuest);
		
		JLabel lblDateFrom = new JLabel("Date from");
		lblDateFrom.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDateFrom.setBounds(48, 244, 76, 40);
		add(lblDateFrom);
		
		JLabel lblDateTo = new JLabel("Date to");
		lblDateTo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDateTo.setBounds(48, 281, 76, 50);
		add(lblDateTo);
		
		textFieldDateFrom = new JTextField();
		textFieldDateFrom.setBounds(145, 256, 86, 20);
		add(textFieldDateFrom);
		textFieldDateFrom.setColumns(10);
		
		textFieldDateTo = new JTextField();
		textFieldDateTo.setBounds(145, 298, 86, 20);
		add(textFieldDateTo);
		textFieldDateTo.setColumns(10);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPrice.setBounds(48, 342, 46, 14);
		add(lblPrice);
		
		textFieldPrice = new JTextField();
		textFieldPrice.setBounds(145, 341, 86, 20);
		add(textFieldPrice);
		textFieldPrice.setColumns(10);
		
		JLabel lblRoom = new JLabel("Room");
		lblRoom.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblRoom.setBounds(48, 384, 46, 14);
		add(lblRoom);
		
		textFieldRoom = new JTextField();
		textFieldRoom.setBounds(145, 378, 86, 20);
		add(textFieldRoom);
		textFieldRoom.setColumns(10);
		

		
	
		
		
		
	
	}
}
