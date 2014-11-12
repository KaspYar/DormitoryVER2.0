package view;


import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JLayeredPane;
import javax.swing.JTabbedPane;
import javax.swing.JToolBar;
import javax.swing.JSplitPane;
import javax.swing.JDesktopPane;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.JTable;
import javax.swing.JComboBox;

public class Commandant extends MyPanelWithLogOut {
	private String txtLblCommandant = "Commandant";
	private String txttoolBar = "Settle";
	
	
	private JLabel lblCommandant;
	private JTabbedPane tabbedPane;
	private JToolBar toolBar;
	private JPanel panelSettle;
	private JTable table;


	
	public Commandant() {
		
	    lblCommandant = new JLabel(txtLblCommandant);
		lblCommandant.setForeground(Color.WHITE);
		lblCommandant.setBackground(Color.WHITE);
		lblCommandant.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCommandant.setBounds(325, 0, 255, 50);
		add(lblCommandant);
		

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(25, 80, 765, 361);
		add(tabbedPane);
		
		JPanel panelSettle = new JPanel();
		panelSettle.setBackground(Color.GREEN);
		tabbedPane.addTab("Settle", null, panelSettle, null);
		panelSettle.setLayout(null);
		panelSettle.setBackground(new Color( 102,178,255));
		
		JLabel lblSelect = new JLabel("Select");
		lblSelect.setBounds(35, 51, 46, 14);
		panelSettle.add(lblSelect);
		
		table = new JTable();
		table.setBounds(35, 111, 443, 175);
		panelSettle.add(table);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(109, 36, 200, 50);
		panelSettle.add(comboBox);
		
		JButton btnSettle = new JButton("Settle");
		btnSettle.setBounds(515, 47, 89, 23);
		panelSettle.add(btnSettle);
		
		JPanel panelResettle = new JPanel();
		tabbedPane.addTab("Resettle", null, panelResettle, null);
		panelResettle.setLayout(null);
		panelResettle.setBackground(new Color( 102,178,255));
		
		
		
		
	
	}
}
