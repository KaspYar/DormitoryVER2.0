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

public class Administrator extends MyPanelWithLogOut{
	
	//private String txtbtnChangeAUser = "Change user";
	private String txtbtnDeleteDormitory = "Delete dormitory";
	private String txtbtnOkDorm = "OK";
	private String txtbtnResetDorm = "Reset";
	private String txtbtnAddNewDormitory = "Add new dormitory";
	private String txtbtnDeleteCommandant = "Delete commandant";
	private String txtbtnOkComm = "OK";
	private String txtbtnResetComm = "Reset";
	private String txtbtnAddCommandant = "Add commandant";
	private String txtbtnAddNewSettler = "Add new settler";
	private String txtbtnDeleteSettlerSett = "Delete settler";
	private String txtbtnOkSett = "OK";
	private String txtbtnResetSett = "Reset";
	
	private String txtchckbxPressToChangeDorm = "Press to change info";
	private String txtchckbxPressToChangeComm = "Press to change info";
	private String txtchckbxPressToChangeSett = "Press to change info";
	
	private String txtlblAdministrator = "Administrator";
    private String txtlblChooseDormitory = "Choose dormitory ";
    private String txtlblAddress = "Address";
    private String txtlblPhoneDorm = "Phone";
    private String txtlblCommandantDorm = "Commandant:";
    private String txtlblAllFreePlaces = "Free places in all dormitories:";
    private String txtlblChooseCommandant = "Choose commandant";
    private String txtlblNameComm = "Name";
    private String txtlblSurnameComm = "Surname";
    private String txtlblPhoneComm = "Phone";
    private String txtlblWorkAtDormitoryComm = "Work at dormitory:";
    private String txtlblChooseSettler = "Choose settler";
    private String txtlblNameSett = "Name";
    private String txtlblSurnameSett = "Surname";
    private String txtlblPhoneSett = "Phone";
	
    
    private String txtpanelWorkWithSettlers = "Work with settlers";
    private String txtpanelWorkWithDormitories  = "Work with dormitories";
    private String txtpanelInfoAboutDormitory = "Info about dormitory";
    private String txtpanelSettingsDorm = "Settings";
    private String txtpanelWorkWithCommandants = "Work with commandants";
    private String txtpanelInfoAboutCommandant = "Info about commandant";
    private String txtpanelSettingsComm = "Settings";
    private String txtpanelInfoAboutSettlerSett = "Info about settler";
    private String txtpanelSettingsSett = "Settings";
    
		
	private JSeparator separator;
	
	private JCheckBox chckbxPressToChangeDorm;
	private JCheckBox chckbxPressToChangeComm;
    private JCheckBox chckbxPressToChangeSett;

	private JComboBox comboBoxChooseDormitories;
	private JComboBox comboBoxCommandantDorm;
	private JComboBox comboBoxWorkAtDormitoryComm;
	private JComboBox comboBoxChooseCommandant;
	private JComboBox comboBoxChooseSettler;
		
	private JLabel lblAdministrator;
	private JLabel lblChooseDormitory;
	private JLabel lblAddress;
	private JLabel lblPhoneDorm;
	private JLabel lblCommandantDorm;
	private JLabel lblAllFreePlaces;
	private JLabel lblChooseCommandant;
	private JLabel lblNameComm;
	private JLabel lblSurnameComm;
	private JLabel lblPhoneComm;
	private JLabel lblWorkAtDormitoryComm;
	private JLabel lblChooseSettler;
	private JLabel lblNameSett;
	private JLabel lblSurnameSett;
	private JLabel lblPhoneSett;
	
	//private JButton btnChangeAUser;
	private JButton btnDeleteDormitory;
	private JButton btnOkDorm;
	private JButton btnResetDorm;
	private JButton btnAddNewDormitory;
	private JButton btnDeleteCommandant;
	private JButton btnOkComm;	
	private JButton btnResetComm ;
	private JButton btnAddCommandant;
	private JButton btnAddNewSettler;
	private JButton btnDeleteSettlerSett;
	private JButton btnOkSett;
	private JButton btnResetSett;
	
	private JPanel panelWorkWithSettlers;
	private JPanel panelInfoAboutSettlerSett;
	private JPanel panelSettingsSett;
	private JPanel panelWorkWithDormitories;
	private JPanel panelInfoAboutDormitory;
	private JPanel panelSettingsDorm;
	private JPanel panelWorkWithCommandants;
	private JPanel panelInfoAboutCommandant;
	private JPanel panelSettingsComm;
	
	
	private JTabbedPane tabbedPaneAdministrator;
	private JTabbedPane tabbedPaneDormitories;
	private JTabbedPane tabbedPaneCommandant;
	
	private JTextField textFieldAddress;
	private JTextField textFieldPhoneDorm;
	private JTextField textFieldNameComm;
	private JTextField textFieldSurnameComm;
	private JTextField textFieldPhoneComm;
	private JTextField textFieldNameSett;
	private JTextField textFieldSurnameSett;
	private JTextField textFieldPhoneSett;
	private JTabbedPane tabbedPaneSettler;
		

	
	public Administrator() {
		/*
		btnChangeAUser = new JButton(txtbtnChangeAUser);
		btnChangeAUser.setBounds(668, 20, 115, 23);
		add(btnChangeAUser);
		*/
		
		lblAdministrator = new JLabel(txtlblAdministrator);
		lblAdministrator.setForeground(Color.WHITE);
		lblAdministrator.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblAdministrator.setBounds(342, 20, 155, 23);
		add(lblAdministrator);
		
		separator = new JSeparator();
		separator.setBounds(0, 60, 800, 2);
		add(separator);
		
		tabbedPaneAdministrator = new JTabbedPane(JTabbedPane.TOP);
		tabbedPaneAdministrator.setBounds(95, 84, 602, 360);
		add(tabbedPaneAdministrator);
		
		panelWorkWithSettlers = new JPanel();
		tabbedPaneAdministrator.addTab("Work with settlers", null, panelWorkWithSettlers, null);
		panelWorkWithSettlers.setLayout(null);
		panelWorkWithSettlers.setBackground(new Color(102, 178, 255));
		
		lblChooseSettler = new JLabel(txtlblChooseSettler);
		lblChooseSettler.setBounds(28, 34, 81, 14);
		panelWorkWithSettlers.add(lblChooseSettler);
		
		comboBoxChooseSettler = new JComboBox();
		comboBoxChooseSettler.setBounds(153, 31, 221, 20);
		panelWorkWithSettlers.add(comboBoxChooseSettler);
		
		btnAddNewSettler = new JButton(txtbtnAddNewSettler);
		btnAddNewSettler.setBounds(430, 275, 123, 23);
		panelWorkWithSettlers.add(btnAddNewSettler);
		
		tabbedPaneSettler = new JTabbedPane(JTabbedPane.TOP);
		tabbedPaneSettler.setBounds(28, 72, 346, 226);
		panelWorkWithSettlers.add(tabbedPaneSettler);
		
		panelInfoAboutSettlerSett = new JPanel();
		tabbedPaneSettler.addTab("Info about settler", null, panelInfoAboutSettlerSett, null);
		
		panelSettingsSett = new JPanel();
		tabbedPaneSettler.addTab("Settings", null, panelSettingsSett, null);
		panelSettingsSett.setLayout(null);
		
		lblNameSett = new JLabel(txtlblNameSett);
		lblNameSett.setBounds(10, 11, 46, 14);
		panelSettingsSett.add(lblNameSett);
		
		textFieldNameSett = new JTextField();
		textFieldNameSett.setBounds(66, 8, 122, 20);
		panelSettingsSett.add(textFieldNameSett);
		textFieldNameSett.setColumns(10);
		
		lblSurnameSett = new JLabel(txtlblSurnameSett);
		lblSurnameSett.setBounds(10, 39, 46, 14);
		panelSettingsSett.add(lblSurnameSett);
		
		textFieldSurnameSett = new JTextField();
		textFieldSurnameSett.setBounds(66, 36, 122, 20);
		panelSettingsSett.add(textFieldSurnameSett);
		textFieldSurnameSett.setColumns(10);
		
		lblPhoneSett = new JLabel(txtlblPhoneSett);
		lblPhoneSett.setBounds(10, 65, 46, 14);
		panelSettingsSett.add(lblPhoneSett);
		
		textFieldPhoneSett = new JTextField();
		textFieldPhoneSett.setBounds(66, 62, 122, 20);
		panelSettingsSett.add(textFieldPhoneSett);
		textFieldPhoneSett.setColumns(10);
		
		chckbxPressToChangeSett = new JCheckBox(txtchckbxPressToChangeSett);
		chckbxPressToChangeSett.setBounds(202, 7, 128, 23);
		panelSettingsSett.add(chckbxPressToChangeSett);
		
		btnDeleteSettlerSett = new JButton(txtbtnDeleteSettlerSett);
		btnDeleteSettlerSett.setBounds(202, 40, 133, 23);
		panelSettingsSett.add(btnDeleteSettlerSett);
		
		btnOkSett = new JButton(txtbtnOkSett);
		btnOkSett.setBounds(55, 164, 89, 23);
		panelSettingsSett.add(btnOkSett);
		
		btnResetSett = new JButton(txtbtnResetSett);
		btnResetSett.setBounds(211, 164, 89, 23);
		panelSettingsSett.add(btnResetSett);
		
		panelWorkWithDormitories = new JPanel();
		tabbedPaneAdministrator.addTab("Work with dormitories", null, panelWorkWithDormitories, null);
		panelWorkWithDormitories.setLayout(null);
		panelWorkWithDormitories.setBackground(new Color(102, 178, 255));
		
		comboBoxChooseDormitories = new JComboBox();
		comboBoxChooseDormitories.setBounds(153, 31, 221, 20);
		panelWorkWithDormitories.add(comboBoxChooseDormitories);
		
		lblChooseDormitory = new JLabel(txtlblChooseDormitory);
		lblChooseDormitory.setBounds(28, 34, 113, 14);
		panelWorkWithDormitories.add(lblChooseDormitory);
		
		tabbedPaneDormitories = new JTabbedPane(JTabbedPane.TOP);
		tabbedPaneDormitories.setBounds(28, 72, 346, 226);
		panelWorkWithDormitories.add(tabbedPaneDormitories);
		
		panelInfoAboutDormitory = new JPanel();
		tabbedPaneDormitories.addTab("Info about dormitory", null, panelInfoAboutDormitory, null);
		panelInfoAboutDormitory.setLayout(null);
		
		panelSettingsDorm = new JPanel();
		tabbedPaneDormitories.addTab("Settings", null, panelSettingsDorm, null);
		panelSettingsDorm.setLayout(null);
		
		lblAddress = new JLabel(txtlblAddress);
		lblAddress.setBounds(10, 11, 46, 14);
		panelSettingsDorm.add(lblAddress);
		
		textFieldAddress = new JTextField();
		textFieldAddress.setBounds(66, 8, 122, 20);
		panelSettingsDorm.add(textFieldAddress);
		textFieldAddress.setColumns(10);
		
		lblPhoneDorm = new JLabel(txtlblPhoneDorm);
		lblPhoneDorm.setBounds(10, 39, 46, 14);
		panelSettingsDorm.add(lblPhoneDorm);
		
		textFieldPhoneDorm = new JTextField();
		textFieldPhoneDorm.setBounds(66, 36, 122, 20);
		panelSettingsDorm.add(textFieldPhoneDorm);
		textFieldPhoneDorm.setColumns(10);
		
		lblCommandantDorm = new JLabel(txtlblCommandantDorm);
		lblCommandantDorm.setBounds(10, 109, 71, 14);
		panelSettingsDorm.add(lblCommandantDorm);
		
		chckbxPressToChangeDorm = new JCheckBox(txtchckbxPressToChangeDorm);
		chckbxPressToChangeDorm.setBounds(202, 7, 128, 23);
		panelSettingsDorm.add(chckbxPressToChangeDorm);
		
		btnDeleteDormitory = new JButton(txtbtnDeleteDormitory);
		btnDeleteDormitory.setBounds(202, 40, 133, 23);
		panelSettingsDorm.add(btnDeleteDormitory);
		
		btnOkDorm = new JButton(txtbtnOkDorm);
		btnOkDorm.setBounds(55, 164, 89, 23);
		panelSettingsDorm.add(btnOkDorm);
		
		btnResetDorm = new JButton(txtbtnResetDorm);
		btnResetDorm.setBounds(211, 164, 89, 23);
		panelSettingsDorm.add(btnResetDorm);
		
		comboBoxCommandantDorm = new JComboBox();
		comboBoxCommandantDorm.setBounds(91, 106, 97, 20);
		panelSettingsDorm.add(comboBoxCommandantDorm);
		
		lblAllFreePlaces = new JLabel(txtlblAllFreePlaces);
		lblAllFreePlaces.setHorizontalAlignment(SwingConstants.LEFT);
		lblAllFreePlaces.setBounds(28, 9, 346, 14);
		panelWorkWithDormitories.add(lblAllFreePlaces);
		
		btnAddNewDormitory = new JButton(txtbtnAddNewDormitory);
		btnAddNewDormitory.setBounds(430, 275, 123, 23);
		panelWorkWithDormitories.add(btnAddNewDormitory);
		
		panelWorkWithCommandants = new JPanel();
		tabbedPaneAdministrator.addTab("Work with commandants", null, panelWorkWithCommandants, null);
		panelWorkWithCommandants.setLayout(null);
		panelWorkWithCommandants.setBackground(new Color(102, 178, 255));
		
		lblChooseCommandant = new JLabel(txtlblChooseCommandant);
		lblChooseCommandant.setBounds(28, 34, 113, 14);
		panelWorkWithCommandants.add(lblChooseCommandant);
		
		tabbedPaneCommandant = new JTabbedPane(JTabbedPane.TOP);
		tabbedPaneCommandant.setBounds(28, 72, 346, 226);
		panelWorkWithCommandants.add(tabbedPaneCommandant);
		
		panelInfoAboutCommandant = new JPanel();
		tabbedPaneCommandant.addTab("Info about commandant", null, panelInfoAboutCommandant, null);
		panelInfoAboutCommandant.setLayout(null);
		
		panelSettingsComm = new JPanel();
		tabbedPaneCommandant.addTab("Settings", null, panelSettingsComm, null);
		panelSettingsComm.setLayout(null);
		
		lblNameComm = new JLabel(txtlblNameComm);
		lblNameComm.setBounds(10, 11, 46, 14);
		panelSettingsComm.add(lblNameComm);
		
		textFieldNameComm = new JTextField();
		textFieldNameComm.setBounds(66, 8, 122, 20);
		panelSettingsComm.add(textFieldNameComm);
		textFieldNameComm.setColumns(10);
		
		lblSurnameComm = new JLabel(txtlblSurnameComm);
		lblSurnameComm.setBounds(10, 39, 46, 14);
		panelSettingsComm.add(lblSurnameComm);
		
		textFieldSurnameComm = new JTextField();
		textFieldSurnameComm.setBounds(66, 36, 122, 20);
		panelSettingsComm.add(textFieldSurnameComm);
		textFieldSurnameComm.setColumns(10);
		
		lblPhoneComm = new JLabel(txtlblPhoneComm);
		lblPhoneComm.setBounds(10, 65, 46, 14);
		panelSettingsComm.add(lblPhoneComm);
		
		textFieldPhoneComm = new JTextField();
		textFieldPhoneComm.setBounds(66, 62, 122, 20);
		panelSettingsComm.add(textFieldPhoneComm);
		textFieldPhoneComm.setColumns(10);
		
		lblWorkAtDormitoryComm = new JLabel(txtlblWorkAtDormitoryComm);
		lblWorkAtDormitoryComm.setBounds(10, 109, 94, 14);
		panelSettingsComm.add(lblWorkAtDormitoryComm);
		
		comboBoxWorkAtDormitoryComm = new JComboBox();
		comboBoxWorkAtDormitoryComm.setBounds(114, 106, 74, 20);
		panelSettingsComm.add(comboBoxWorkAtDormitoryComm);
		
		chckbxPressToChangeComm = new JCheckBox(txtchckbxPressToChangeComm);
		chckbxPressToChangeComm.setBounds(202, 7, 137, 23);
		panelSettingsComm.add(chckbxPressToChangeComm);
		
		btnDeleteCommandant = new JButton(txtbtnDeleteCommandant);
		btnDeleteCommandant.setBounds(202, 40, 133, 23);
		panelSettingsComm.add(btnDeleteCommandant);
		
		btnOkComm = new JButton(txtbtnOkComm);
		btnOkComm.setBounds(55, 164, 89, 23);
		panelSettingsComm.add(btnOkComm);
		
		btnResetComm = new JButton(txtbtnResetComm);
		btnResetComm.setBounds(211, 164, 89, 23);
		panelSettingsComm.add(btnResetComm);
		
	    comboBoxChooseCommandant = new JComboBox();
		comboBoxChooseCommandant.setBounds(153, 31, 221, 20);
		panelWorkWithCommandants.add(comboBoxChooseCommandant);
		
		btnAddCommandant = new JButton(txtbtnAddCommandant);
		btnAddCommandant.setBounds(430, 275, 123, 23);
		panelWorkWithCommandants.add(btnAddCommandant);
	}
	  
	public void addListener(ActionListener l) {
		
		//btnChangeAUser.addActionListener(l);
		this.getBtnLogOut().addActionListener(l);
		btnDeleteDormitory.addActionListener(l);
		btnOkDorm.addActionListener(l);
		btnResetDorm.addActionListener(l);
		btnAddNewDormitory.addActionListener(l);
		btnDeleteCommandant.addActionListener(l);
		btnOkComm.addActionListener(l);
		btnResetComm.addActionListener(l);
		btnAddCommandant.addActionListener(l);
		btnAddNewSettler.addActionListener(l);
		btnDeleteSettlerSett.addActionListener(l);
		btnOkSett.addActionListener(l);
		btnResetSett.addActionListener(l);
		
				

	}
}
