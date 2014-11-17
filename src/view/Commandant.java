package view;


import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

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
	private String txtpanelResettle = "Resettle";
	private String txtpanelSettle = "Settle";
	private String txtlblSelectTheRoom = "Input the new room`s number"; 
	private String txtbtnEvictAllGraduates = "Evict all gratuates";
	private String txtpanelInformation = "Information"; 
	private String txtpanelEvict = "Evict";
	private String txtlblSelect = "Select";
	private String txtbtnSettle = "Settle"; 
	private String txtlblSelectResettle = "Select";
	private String txtbtnResettle = "Resettle";
	private String txtlblSelectToEvict = "Select";
	private String txtlblQuantityOfFree = "Quantity of free places";
	private String txtbtnSelectToEvict = "Evict";
	private String txtlblSelectRoomsNumber = "Select room`s number";
	private String txtbtnInhabitansOfRoom = "Inhabitans of room";
	private String txtlblSelectBlocksNumber = "Select block`s number";
	private String txtbtnShowMonitor = "Show monitor";
	private String txtlblSelectPerson = "Select Person";
	private String txtlblInfoemationAboutInhabitants = "Information about inhabitants";
	
	
	private JLabel lblCommandant;
	private JTabbedPane tabbedPane;
	private JPanel panelSettle;
	private JTable tableSettle;
	private JComboBox comboBoxSettle;
	private JPanel panelResettle;
	private JTable tableResettle;
	private JLabel lblSelectTheRoom ;
	private JTable tableEvict;
	private JButton btnEvictAllGraduates;
	private JPanel panelEvict;
    private JPanel panelInformation;
    private JTable tableInformation;
    private JLabel lblSelect;
    private JButton btnSettle;
    private JLabel lblSelectResettle;
    private JButton btnResettle;
    private JComboBox comboBoxSelect;
    private JTextPane textPaneResettle;
    private JLabel lblSelectToEvict;
    private JLabel lblQuantityOfFree;
    private JButton btnSelectToEvict;
    private JLabel lblSelectRoomsNumber;
    private JComboBox comboBox_2Info;
    private JButton btnInhabitansOfRoom;
    private JLabel lblSelectBlocksNumber;
    private JComboBox comboBoxSelectPerson;
    private JButton btnShowMonitor;
    private JLabel lblSelectPerson;
    private JComboBox comboBoxPanelInfo;
    private JLabel lblInformationAboutInhabitants;
    private JButton btnEvict;
    private JComboBox comboBoxEvict;

	
	public Commandant() {
		
	    lblCommandant = new JLabel(txtLblCommandant);
		lblCommandant.setForeground(Color.WHITE);
		lblCommandant.setBackground(Color.WHITE);
		lblCommandant.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCommandant.setBounds(325, 0, 255, 50);
		add(lblCommandant);
		

	    tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(25, 80, 765, 361);
		add(tabbedPane);
		
	    panelSettle = new JPanel();
		panelSettle.setBackground(Color.GREEN);
		tabbedPane.addTab(txtpanelSettle, null, panelSettle, null);
		panelSettle.setLayout(null);
		panelSettle.setBackground(new Color( 102,178,255));
		
		lblSelect = new JLabel(txtlblSelect);
		lblSelect.setBounds(35, 51, 46, 14);
		panelSettle.add(lblSelect);
		
		tableSettle = new JTable();
		tableSettle.setBounds(35, 110, 510, 175);
		panelSettle.add(tableSettle);
		
		comboBoxSettle = new JComboBox();
		comboBoxSettle.setBounds(80, 45, 200, 25);
		panelSettle.add(comboBoxSettle);
		
		btnSettle = new JButton(txtbtnSettle);
		btnSettle.setBounds(455, 47, 89, 23);
		panelSettle.add(btnSettle);
		
		panelResettle = new JPanel();
		tabbedPane.addTab(txtpanelResettle, null, panelResettle, null);
		panelResettle.setLayout(null);
		panelResettle.setBackground(new Color( 102,178,255));
		
		lblSelectResettle = new JLabel(txtlblSelectResettle);
		lblSelectResettle.setBounds(19, 41, 40, 15);
		panelResettle.add(lblSelectResettle);
		
		tableResettle = new JTable();
		tableResettle.setBounds(19, 147, 510, 175);
		panelResettle.add(tableResettle);
		
		btnResettle = new JButton(txtbtnResettle);
		btnResettle.setBounds(440, 97, 89, 23);
		panelResettle.add(btnResettle);
		
		lblSelectTheRoom = new JLabel(txtlblSelectTheRoom);
		lblSelectTheRoom.setBounds(19, 96, 155, 25);
		panelResettle.add(lblSelectTheRoom);
		
		comboBoxSelect = new JComboBox();
		comboBoxSelect.setBounds(184, 36, 200, 25);
		panelResettle.add(comboBoxSelect);
		
		textPaneResettle = new JTextPane();
		textPaneResettle.setBounds(184, 96, 200, 25);
		panelResettle.add(textPaneResettle);
		
		
		panelEvict = new JPanel();
		tabbedPane.addTab(txtpanelEvict, null, panelEvict, null);
		panelEvict.setLayout(null);
		panelEvict.setBackground(new Color( 102,178,255));
		
		
		lblSelectToEvict = new JLabel(txtlblSelectToEvict);
		lblSelectToEvict.setBounds(19, 41, 40, 15);
		panelEvict.add(lblSelectToEvict);
		
		comboBoxEvict = new JComboBox();
		comboBoxEvict.setBounds(80, 36, 200, 25);
		panelEvict.add(comboBoxEvict);
		
		tableEvict = new JTable();
		tableEvict.setBounds(19, 104, 510, 218);
		panelEvict.add(tableEvict);
		
		btnEvict = new JButton(txtbtnSelectToEvict);
		btnEvict.setBounds(440, 37, 89, 23);
		panelEvict.add(btnEvict);
		
		btnEvictAllGraduates = new JButton(txtbtnEvictAllGraduates);
		btnEvictAllGraduates.setBounds(599, 299, 119, 23);
		panelEvict.add(btnEvictAllGraduates);
		
		
		
		panelInformation = new JPanel();
		tabbedPane.addTab(txtpanelInformation, null, panelInformation, null);
		panelInformation.setLayout(null);
		panelInformation.setBackground(new Color( 102,178,255));
		
		lblQuantityOfFree = new JLabel(txtlblQuantityOfFree);
		lblQuantityOfFree.setBounds(10, 54, 125, 14);
		panelInformation.add(lblQuantityOfFree);
		
		tableInformation = new JTable();
		tableInformation.setBounds(410, 28, 327, 276);
		panelInformation.add(tableInformation);
		
		lblSelectRoomsNumber = new JLabel(txtlblSelectRoomsNumber);
		lblSelectRoomsNumber.setBounds(10, 96, 113, 14);
		panelInformation.add(lblSelectRoomsNumber);
		
		comboBox_2Info = new JComboBox();
		comboBox_2Info.setBounds(136, 91, 75, 25);
		panelInformation.add(comboBox_2Info);
		
		btnInhabitansOfRoom = new JButton(txtbtnInhabitansOfRoom);
		btnInhabitansOfRoom.setBounds(242, 91, 140, 25);
		panelInformation.add(btnInhabitansOfRoom);
		
		lblSelectBlocksNumber = new JLabel(txtlblSelectBlocksNumber);
		lblSelectBlocksNumber.setBounds(10, 132, 113, 14);
		panelInformation.add(lblSelectBlocksNumber);
		
		comboBoxSelectPerson = new JComboBox();
		comboBoxSelectPerson.setBounds(136, 127, 75, 25);
		panelInformation.add(comboBoxSelectPerson);
		
		btnShowMonitor = new JButton(txtbtnShowMonitor);
		btnShowMonitor.setBounds(242, 127, 140, 25);
		panelInformation.add(btnShowMonitor);
		
	lblSelectPerson = new JLabel(txtlblSelectPerson);
		lblSelectPerson.setBounds(10, 238, 102, 14);
		panelInformation.add(lblSelectPerson);
		
		comboBoxPanelInfo= new JComboBox();
		comboBoxPanelInfo.setBounds(136, 233, 200, 25);
		panelInformation.add(comboBoxPanelInfo);
		
		lblInformationAboutInhabitants = new JLabel(txtlblInfoemationAboutInhabitants);
		lblInformationAboutInhabitants.setBounds(91, 189, 217, 14);
		panelInformation.add(lblInformationAboutInhabitants);
		
		
		

	}

	public void addListener(ActionListener l){
		this.getBtnLogOut().addActionListener(l);
		btnShowMonitor.addActionListener(l);
		btnInhabitansOfRoom.addActionListener(l);
		btnEvictAllGraduates.addActionListener(l);
		btnEvict.addActionListener(l);
		btnResettle.addActionListener(l);
		btnSettle.addActionListener(l);
		
		
		
	}
}
