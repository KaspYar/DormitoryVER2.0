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

public class Commandant extends MyPanelWithLogOut {
	String txtLblCommandant = "Commandant";
	private JButton btnSettle;
	private JButton btnResettle;
	private JButton btnEvict;
	private JButton btnInformation;
	private JLabel lblCommandant;
	private JButton btnBack;

	
	public Commandant() {
		
	    lblCommandant = new JLabel(txtLblCommandant);
		lblCommandant.setForeground(Color.WHITE);
		lblCommandant.setBackground(Color.WHITE);
		lblCommandant.setFont(new Font("Tahoma", Font.PLAIN, 34));
		lblCommandant.setBounds(444, 0, 200, 50);
		add(lblCommandant);
		

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
	}

	public void addListener(ActionListener l){
		this.getBtnLogOut().addActionListener(l);
	}
	
}
