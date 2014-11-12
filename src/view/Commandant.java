package view;


import java.awt.Color;
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

<<<<<<< HEAD:src/view/CommandantAdmin.java
public class CommandantAdmin extends MyPanelWithLogOut {
=======
public class Commandant extends MyPanel {
>>>>>>> 1ab9aa4525d4a0da97cff4c54fa631993f721813:src/view/Commandant.java
	String txtLblCommandant = "Commandant";
	
	
<<<<<<< HEAD:src/view/CommandantAdmin.java
=======
	private JButton btnSettle;
	private JButton btnResettle;
	private JButton btnEvict;
	private JButton btnInformation;
	private JLabel lblCommandant;
	private JButton btnBack;
>>>>>>> 1ab9aa4525d4a0da97cff4c54fa631993f721813:src/view/Commandant.java
	
	private JLabel lblCommandant;

	
	public Commandant() {
		
<<<<<<< HEAD:src/view/CommandantAdmin.java
	    lblCommandant = new JLabel("txtLblCommandant");
		lblCommandant.setForeground(Color.WHITE);
		lblCommandant.setBackground(Color.WHITE);
=======
		lblCommandant = new JLabel(txtLblCommandant);
>>>>>>> 1ab9aa4525d4a0da97cff4c54fa631993f721813:src/view/Commandant.java
		lblCommandant.setFont(new Font("Tahoma", Font.PLAIN, 34));
		lblCommandant.setBounds(444, 0, 200, 50);
		add(lblCommandant);
		
<<<<<<< HEAD:src/view/CommandantAdmin.java
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(25, 80, 765, 361);
		add(tabbedPane);
		
		JToolBar toolBar = new JToolBar();
		tabbedPane.addTab("New tab", null, toolBar, null);
		
		JPanel panel = new JPanel();
		toolBar.add(panel);
		
		JToolBar toolBar_1 = new JToolBar();
		tabbedPane.addTab("New tab", null, toolBar_1, null);
		
		JPanel panel_1 = new JPanel();
		toolBar_1.add(panel_1);
		
=======
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
>>>>>>> 1ab9aa4525d4a0da97cff4c54fa631993f721813:src/view/Commandant.java
		
	
	}
	
}
