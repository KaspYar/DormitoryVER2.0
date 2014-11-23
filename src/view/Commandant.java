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
	private String txtlblFreeRooms = "Free rooms"; 
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
	private JComboBox comboBoxSettle;
	private JPanel panelResettle;
	private JLabel lblFreeRooms ;
	private JButton btnEvictAllGraduates;
	private JPanel panelEvict;
    private JPanel panelInformation;
    private JLabel lblSelect;
    private JButton btnSettle;
    private JLabel lblSelectResettle;
    private JButton btnResettle;
    private JComboBox comboBoxSelect;
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
	private JComboBox comboBoxFreeRooms;
	private JTextPane textPaneResettle;
	private JTextPane textPaneSettle;
	private JTextPane textPaneEvict;
	private JTextPane textPaneInformation;

	
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
	    
	    comboBoxSettle = new JComboBox();
	    comboBoxSettle.setBounds(80, 45, 200, 25);
	    panelSettle.add(comboBoxSettle);
	    
	    btnSettle = new JButton(txtbtnSettle);
	    btnSettle.setBounds(621, 47, 89, 23);
	    panelSettle.add(btnSettle);
	    
	    textPaneSettle = new JTextPane();
	    textPaneSettle.setBounds(35, 104, 675, 200);
	    panelSettle.add(textPaneSettle);
	    
	    panelResettle = new JPanel();
	    tabbedPane.addTab(txtpanelResettle, null, panelResettle, null);
	    panelResettle.setLayout(null);
	    panelResettle.setBackground(new Color( 102,178,255));
	    
	    lblSelectResettle = new JLabel(txtlblSelectResettle);
	    lblSelectResettle.setBounds(19, 41, 40, 15);
	    panelResettle.add(lblSelectResettle);
	    
	    btnResettle = new JButton(txtbtnResettle);
	    btnResettle.setBounds(605, 101, 89, 25);
	    panelResettle.add(btnResettle);
	    
	    lblFreeRooms = new JLabel(txtlblFreeRooms);
	    lblFreeRooms.setBounds(19, 96, 155, 25);
	    panelResettle.add(lblFreeRooms);
	    
	    comboBoxSelect = new JComboBox();
	    comboBoxSelect.setBounds(114, 36, 200, 25);
	    panelResettle.add(comboBoxSelect);
	    
	    textPaneResettle = new JTextPane();
	    textPaneResettle.setBounds(19, 137, 675, 175);
	    panelResettle.add(textPaneResettle);
	    
	    comboBoxFreeRooms = new JComboBox();
	    comboBoxFreeRooms.setBounds(114, 96, 200, 25);
	    panelResettle.add(comboBoxFreeRooms);
	    
	    
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
	    
	
	    btnEvict = new JButton(txtbtnSelectToEvict);
	    btnEvict.setBounds(440, 37, 89, 23);
	    panelEvict.add(btnEvict);
	    
	    btnEvictAllGraduates = new JButton(txtbtnEvictAllGraduates);
	    btnEvictAllGraduates.setBounds(598, 284, 119, 23);
	    panelEvict.add(btnEvictAllGraduates);
	    
	    textPaneEvict = new JTextPane();
	    textPaneEvict.setBounds(29, 107, 500, 200);
	    panelEvict.add(textPaneEvict);
	    
	    
	    
	    panelInformation = new JPanel();
	    tabbedPane.addTab(txtpanelInformation, null, panelInformation, null);
	    panelInformation.setLayout(null);
	    panelInformation.setBackground(new Color( 102,178,255));
	    
	    lblQuantityOfFree = new JLabel(txtlblQuantityOfFree);
	    lblQuantityOfFree.setBounds(10, 54, 125, 14);
	    panelInformation.add(lblQuantityOfFree);
	    
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
	
	textPaneInformation = new JTextPane();
	textPaneInformation.setBounds(418, 35, 300, 270);
	panelInformation.add(textPaneInformation);
		
		
		

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

	public JButton getBtnEvictAllGraduates() {
		return btnEvictAllGraduates;
	}

	public JButton getBtnSettle() {
		return btnSettle;
	}

	public JButton getBtnResettle() {
		return btnResettle;
	}

	public JButton getBtnSelectToEvict() {
		return btnSelectToEvict;
	}

	public JButton getBtnInhabitansOfRoom() {
		return btnInhabitansOfRoom;
	}

	public JButton getBtnShowMonitor() {
		return btnShowMonitor;
	}

	public JButton getBtnEvict() {
		return btnEvict;
	}

	public JComboBox getComboBoxSettle() {
		return comboBoxSettle;
	}

	public JComboBox getComboBoxSelect() {
		return comboBoxSelect;
	}

	public JComboBox getComboBox_2Info() {
		return comboBox_2Info;
	}

	public JComboBox getComboBoxSelectPerson() {
		return comboBoxSelectPerson;
	}

	public JComboBox getComboBoxPanelInfo() {
		return comboBoxPanelInfo;
	}

	public JComboBox getComboBoxEvict() {
		return comboBoxEvict;
	}

	public JComboBox getComboBoxFreeRooms() {
		return comboBoxFreeRooms;
	}
}
