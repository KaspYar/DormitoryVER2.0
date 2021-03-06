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

public class AddRequest extends MyPanel{
	

    private String txtlblAddSettler = "Choose settler";
    private String txtlblNameStudent = "Name";
    private String txtlblSurnameStudent = "Surname";
    private String txtlblSsnStudent = "SSN";
    private String txtlblFaculty = "Faculty";
    private String txtlblPhoneStudent = "Phone";
    private String txtlblDormitoryStudent = "Dormitory";
    private String txtlblRoomStudent = "Room";
    private String txtlblDateFromStudent = "Date from";
    private String txtlblDateToStudent = "Date to";
    private String txtlblCourse = "Course";
    private String txtlblPricesStudent = "Prices";
    private String txtlblPriceForMonthStudent = "Price for month";
    private String txtlblTotalPriceStudent = "Total price";
    private String txtlblNameWorker = "Name";
    private String txtlblSurnameWorker = "Surname";
    private String txtlblPhoneWorker = "Phone";
    private String txtlblSsnWorker = "SSN";
    private String txtlblMarriedWorker = "Married";
    private String txtlblQuantityOfChildrenWorker = "Quantity of children";
    private String txtlblDormitoryWorker = "Dormitory";
    private String txtlblRoomWorker = "Room";
    private String txtlblPersonMonthWorker = "Person/month";
    private String txtlblDateFromWorker = "Date from";
    private String txtlblDateToWorker = "Date to";
    private String txtlblPricesWorker = "Prices";
    private String txtlblTotalPriceWorker = "Total price";
    private String txtlblNameGuest = "Name";
    private String txtlblSurnameGuest = "Surname";
    private String txtlblSsnGuest = "SSN";
    private String txtlblPhoneGuest = "Phone";
    private String txtlblDormitoryGuest = "Dormitory";
    private String txtlblRoomGuest = "Room";
    private String txtlblDateFromGuest = "Date from";
    private String txtlblDateToGuest = "Date to";
    private String txtlblPricesGuest = "Prices";
    private String txtlblPriceForDayGuest = "Price for day";
    private String txtlblTotalPriceGuest = "Total price";
    private String txtlblQuantityOfFree = "Quantity of free places in dormitories";
    private String txtbtnSaveStudent = "Save";
	private String txtbtnSaveGuest = "Save";
	private String txtbtnSaveWorker = "Save";
    private String txtbtnReset = "Reset";
    private String txtpanelStudent = "Student";
    private String txtpanelWorker = "Worker";
    private String txtpanelGuest = "Guest";
    private String txtBtnBack = "Go back";
    
    private JSeparator separator;
	private JSeparator separator_1;
	private JSeparator separator_2;
	private JSeparator separator_3;
	
	private JButton btnSave;
	private JButton btnReset;
	private JButton btnSaveStudent;
	private JButton btnSaveGuest;
	private JButton btnSaveWorker;
	
	private JCheckBox chckbxNewCheckBox;
	
	private JComboBox comboBoxDormitoryStudent;
	private JComboBox comboBoxRoomStudent;
	private JComboBox comboBoxCourse;
	private JComboBox comboBoxFaculty;
	private JComboBox comboBoxDormitoryWorker;
	private JComboBox comboBoxRoomWorker;
	private JComboBox comboBoxDormitoryGuest;
	private JComboBox comboBoxRoomGuest;
	
	private JLabel lblAddSettler;
	private JLabel lblNameStudent;
	private JLabel lblSurnameStudent;
	private JLabel lblSsnStudent;
	private JLabel lblFaculty;
	private JLabel lblPhoneStudent;
	private JLabel lblDormitoryStudent;
	private JLabel lblRoomStudent;
	private JLabel lblDateFromStudent;
	private JLabel lblDateToStudent;
	private JLabel lblCourse;
	private JLabel lblPricesStudent;
	private JLabel lblPriceForMonthStudent;
	private JLabel lblTotalPriceStudent;
	private JLabel lblNameWorker;
	private JLabel lblSurnameWorker;
	private JLabel lblPhoneWorker;
	private JLabel lblSsnWorker;
	private JLabel lblMarriedWorker;
	private JLabel lblQuantityOfChildrenWorker;
	private JLabel lblDormitoryWorker;
	private JLabel lblRoomWorker;
	private JLabel lblPersonMonthWorker;
	private JLabel lblDateFromWorker;
	private JLabel lblDateToWorker;
	private JLabel lblPricesWorker;
	private JLabel lblTotalPriceWorker;
	private JLabel lblNameGuest;
	private JLabel lblSurnameGuest;
	private JLabel lblSsnGuest;
	private JLabel lblPhoneGuest;
	private JLabel lblDormitoryGuest;
	private JLabel lblRoomGuest;
	private JLabel lblDateFromGuest;
	private JLabel lblDateToGuest;
	private JLabel lblPricesGuest;
	private JLabel lblPriceForDayGuest;
	private JLabel lblTotalPriceGuest;
	private JLabel lblQuantityOfFree;
	
	private JPanel panelWorkWithSettlers;
	private JPanel panelStudent;
	private JPanel panelWorker;
	private JPanel panelGuest;
	
		
	private JTextField textFieldPriceForDayGuest;
	private JTextField textFieldNameStudent;
	private JTextField textFieldSurnameStudent;
	private JTextField textFieldSSNStudent;
	private JTextField textFieldPhoneStudent;
	private JTextField textFieldDateFromStudent;
	private JTextField textFieldDateToStudent;
	private JTextField textFieldPriceForMonthStudent;
	private JTextField textFieldTotalPriceStudent;
	private JTextField textFieldNameWorker;
	private JTextField textFieldSurnameWorker;
	private JTextField textFieldPhoneWorker;
	private JTextField textFieldSsnWorker;
	private JTextField textFieldQuantityOfChildrenWorker;
	private JTextField textFieldPhoneGuest;
	private JTextField textFieldTotalPriceGuest;
	private JTextField textFieldDateToGuest;
	private JTextField textFieldDateFromGuest;
	private JTextField textFieldSurnameGuest;
	private JTextField textFieldSsnGuest;
	private JTextField textFieldNameGuest;
	private JTextField textFieldTotalPriceWorker;
	private JTextField textFieldDateFromWorker;
	private JTextField textFieldPersonMonthWorker;
	private JTextField textFieldDateToWorker;
	
	private JTabbedPane tabbedPaneSettler;
	private JSeparator separator_4;
	private JButton btnBack;
	

	public AddRequest(){
		
	
	
	
	lblAddSettler = new JLabel(txtlblAddSettler);
	lblAddSettler.setFont(new Font("Tahoma", Font.PLAIN, 26));
	lblAddSettler.setForeground(Color.WHITE);
	lblAddSettler.setBounds(358, 22, 184, 27);
	add(lblAddSettler);
	
	tabbedPaneSettler = new JTabbedPane(JTabbedPane.TOP);
	tabbedPaneSettler.setBounds(150, 123, 527, 270);
	add(tabbedPaneSettler);
	
	panelStudent = new JPanel();
	tabbedPaneSettler.addTab("Student", null, panelStudent, null);
	panelStudent.setLayout(null);
	
	lblNameStudent = new JLabel(txtlblNameStudent);
	lblNameStudent.setBounds(10, 11, 46, 14);
	panelStudent.add(lblNameStudent);
	
	textFieldNameStudent = new JTextField();
	textFieldNameStudent.setBounds(80, 8, 86, 20);
	panelStudent.add(textFieldNameStudent);
	textFieldNameStudent.setColumns(10);
	
	lblSurnameStudent = new JLabel(txtlblSurnameStudent);
	lblSurnameStudent.setBounds(10, 36, 46, 14);
	panelStudent.add(lblSurnameStudent);
	
	textFieldSurnameStudent = new JTextField();
	textFieldSurnameStudent.setBounds(80, 33, 86, 20);
	panelStudent.add(textFieldSurnameStudent);
	textFieldSurnameStudent.setColumns(10);
	
	lblSsnStudent = new JLabel(txtlblSsnStudent);
	lblSsnStudent.setBounds(10, 61, 46, 14);
	panelStudent.add(lblSsnStudent);
	
	textFieldSSNStudent = new JTextField();
	textFieldSSNStudent.setBounds(80, 58, 86, 20);
	panelStudent.add(textFieldSSNStudent);
	textFieldSSNStudent.setColumns(10);
	
	lblFaculty = new JLabel(txtlblFaculty);
	lblFaculty.setBounds(296, 11, 46, 14);
	panelStudent.add(lblFaculty);
	
	lblPhoneStudent = new JLabel(txtlblPhoneStudent);
	lblPhoneStudent.setBounds(296, 61, 46, 14);
	panelStudent.add(lblPhoneStudent);
	
	textFieldPhoneStudent = new JTextField();
	textFieldPhoneStudent.setBounds(370, 58, 86, 20);
	panelStudent.add(textFieldPhoneStudent);
	textFieldPhoneStudent.setColumns(10);
	
	separator_1 = new JSeparator();
	separator_1.setBounds(0, 105, 525, 2);
	panelStudent.add(separator_1);
	
	lblDormitoryStudent = new JLabel(txtlblDormitoryStudent);
	lblDormitoryStudent.setBounds(10, 142, 56, 14);
	panelStudent.add(lblDormitoryStudent);
	
	comboBoxDormitoryStudent = new JComboBox();
	comboBoxDormitoryStudent.setBounds(80, 139, 86, 20);
	panelStudent.add(comboBoxDormitoryStudent);
	
	lblRoomStudent = new JLabel(txtlblRoomStudent);
	lblRoomStudent.setBounds(10, 167, 46, 14);
	panelStudent.add(lblRoomStudent);
	
	lblDateFromStudent = new JLabel(txtlblDateFromStudent);
	lblDateFromStudent.setBounds(192, 142, 56, 14);
	panelStudent.add(lblDateFromStudent);
	
	textFieldDateFromStudent = new JTextField();
	textFieldDateFromStudent.setBounds(245, 139, 86, 20);
	panelStudent.add(textFieldDateFromStudent);
	textFieldDateFromStudent.setColumns(10);
	
	lblDateToStudent = new JLabel(txtlblDateToStudent);
	lblDateToStudent.setBounds(192, 167, 46, 14);
	panelStudent.add(lblDateToStudent);
	
	textFieldDateToStudent = new JTextField();
	textFieldDateToStudent.setBounds(245, 164, 86, 20);
	panelStudent.add(textFieldDateToStudent);
	textFieldDateToStudent.setColumns(10);
	
	lblCourse = new JLabel(txtlblCourse);
	lblCourse.setBounds(296, 36, 46, 14);
	panelStudent.add(lblCourse);
	
	lblPricesStudent = new JLabel(txtlblPricesStudent);
	lblPricesStudent.setBounds(396, 118, 46, 14);
	panelStudent.add(lblPricesStudent);
	
	lblPriceForMonthStudent = new JLabel(txtlblPriceForMonthStudent);
	lblPriceForMonthStudent.setBounds(352, 142, 73, 14);
	panelStudent.add(lblPriceForMonthStudent);
	
	textFieldPriceForMonthStudent = new JTextField();
	textFieldPriceForMonthStudent.setBounds(429, 139, 86, 20);
	panelStudent.add(textFieldPriceForMonthStudent);
	textFieldPriceForMonthStudent.setColumns(10);
	
	lblTotalPriceStudent = new JLabel(txtlblTotalPriceStudent);
	lblTotalPriceStudent.setBounds(352, 167, 73, 14);
	panelStudent.add(lblTotalPriceStudent);
	
	textFieldTotalPriceStudent = new JTextField();
	textFieldTotalPriceStudent.setBounds(429, 164, 86, 20);
	panelStudent.add(textFieldTotalPriceStudent);
	textFieldTotalPriceStudent.setColumns(10);
	
	comboBoxCourse = new JComboBox();
	comboBoxCourse.setBounds(370, 33, 86, 20);
	panelStudent.add(comboBoxCourse);
	
	comboBoxFaculty = new JComboBox();
	comboBoxFaculty.setBounds(370, 8, 86, 20);
	panelStudent.add(comboBoxFaculty);
	
	comboBoxRoomStudent = new JComboBox();
	comboBoxRoomStudent.setBounds(80, 164, 86, 20);
	panelStudent.add(comboBoxRoomStudent);
	
	btnSaveStudent = new JButton(txtbtnSaveStudent);
	btnSaveStudent.setBounds(216, 208, 89, 23);
	panelStudent.add(btnSaveStudent);
	
	panelWorker = new JPanel();
	tabbedPaneSettler.addTab("Worker", null, panelWorker, null);
	panelWorker.setLayout(null);
	
	lblNameWorker = new JLabel(txtlblNameWorker);
	lblNameWorker.setBounds(10, 11, 46, 14);
	panelWorker.add(lblNameWorker);
	
	textFieldNameWorker = new JTextField();
	textFieldNameWorker.setBounds(80, 8, 86, 20);
	panelWorker.add(textFieldNameWorker);
	textFieldNameWorker.setColumns(10);
	
	textFieldSurnameWorker = new JTextField();
	textFieldSurnameWorker.setBounds(80, 33, 86, 20);
	panelWorker.add(textFieldSurnameWorker);
	textFieldSurnameWorker.setColumns(10);
	
	lblSurnameWorker = new JLabel(txtlblSurnameWorker);
	lblSurnameWorker.setBounds(10, 36, 46, 14);
	panelWorker.add(lblSurnameWorker);
	
	textFieldPhoneWorker = new JTextField();
	textFieldPhoneWorker.setBounds(80, 58, 86, 20);
	panelWorker.add(textFieldPhoneWorker);
	textFieldPhoneWorker.setColumns(10);
	
	lblPhoneWorker = new JLabel(txtlblPhoneWorker);
	lblPhoneWorker.setBounds(10, 61, 46, 14);
	panelWorker.add(lblPhoneWorker);
	
	lblSsnWorker = new JLabel(txtlblSsnWorker);
	lblSsnWorker.setBounds(295, 11, 46, 14);
	panelWorker.add(lblSsnWorker);
	
	textFieldSsnWorker = new JTextField();
	textFieldSsnWorker.setBounds(370, 8, 86, 20);
	panelWorker.add(textFieldSsnWorker);
	textFieldSsnWorker.setColumns(10);
	
	lblMarriedWorker = new JLabel(txtlblMarriedWorker);
	lblMarriedWorker.setBounds(295, 36, 46, 14);
	panelWorker.add(lblMarriedWorker);
	
	chckbxNewCheckBox = new JCheckBox("");
	chckbxNewCheckBox.setHorizontalAlignment(SwingConstants.RIGHT);
	chckbxNewCheckBox.setBounds(370, 33, 86, 23);
	panelWorker.add(chckbxNewCheckBox);
	
	lblQuantityOfChildrenWorker = new JLabel(txtlblQuantityOfChildrenWorker);
	lblQuantityOfChildrenWorker.setBounds(295, 58, 97, 14);
	panelWorker.add(lblQuantityOfChildrenWorker);
	
	textFieldQuantityOfChildrenWorker = new JTextField();
	textFieldQuantityOfChildrenWorker.setBounds(425, 58, 31, 20);
	panelWorker.add(textFieldQuantityOfChildrenWorker);
	textFieldQuantityOfChildrenWorker.setColumns(10);
	
	separator_2 = new JSeparator();
	separator_2.setBounds(0, 105, 525, 2);
	panelWorker.add(separator_2);
	
	lblDormitoryWorker = new JLabel(txtlblDormitoryWorker);
	lblDormitoryWorker.setBounds(10, 142, 56, 14);
	panelWorker.add(lblDormitoryWorker);
	
	comboBoxDormitoryWorker = new JComboBox();
	comboBoxDormitoryWorker.setBounds(80, 139, 86, 20);
	panelWorker.add(comboBoxDormitoryWorker);
	
	lblRoomWorker = new JLabel(txtlblRoomWorker);
	lblRoomWorker.setBounds(10, 167, 46, 14);
	panelWorker.add(lblRoomWorker);
	
	lblPersonMonthWorker = new JLabel(txtlblPersonMonthWorker);
	lblPersonMonthWorker.setHorizontalAlignment(SwingConstants.LEFT);
	lblPersonMonthWorker.setBounds(352, 142, 75, 14);
	panelWorker.add(lblPersonMonthWorker);
	
	textFieldPersonMonthWorker = new JTextField();
	textFieldPersonMonthWorker.setBounds(429, 139, 86, 20);
	panelWorker.add(textFieldPersonMonthWorker);
	textFieldPersonMonthWorker.setColumns(10);
	
	lblDateFromWorker = new JLabel(txtlblDateFromWorker);
	lblDateFromWorker.setBounds(192, 142, 56, 14);
	panelWorker.add(lblDateFromWorker);
	
	textFieldDateFromWorker = new JTextField();
	textFieldDateFromWorker.setBounds(245, 139, 86, 20);
	panelWorker.add(textFieldDateFromWorker);
	textFieldDateFromWorker.setColumns(10);
	
	lblDateToWorker = new JLabel(txtlblDateToWorker);
	lblDateToWorker.setBounds(192, 167, 46, 14);
	panelWorker.add(lblDateToWorker);
	
	textFieldDateToWorker = new JTextField();
	textFieldDateToWorker.setBounds(245, 164, 86, 20);
	panelWorker.add(textFieldDateToWorker);
	textFieldDateToWorker.setColumns(10);
	
	lblPricesWorker = new JLabel(txtlblPricesWorker);
	lblPricesWorker.setBounds(396, 118, 46, 14);
	panelWorker.add(lblPricesWorker);
	
	lblTotalPriceWorker = new JLabel(txtlblTotalPriceWorker);
	lblTotalPriceWorker.setBounds(352, 167, 75, 14);
	panelWorker.add(lblTotalPriceWorker);
	
	textFieldTotalPriceWorker = new JTextField();
	textFieldTotalPriceWorker.setBounds(429, 164, 86, 20);
	panelWorker.add(textFieldTotalPriceWorker);
	textFieldTotalPriceWorker.setColumns(10);
	
	comboBoxRoomWorker = new JComboBox();
	comboBoxRoomWorker.setBounds(80, 164, 86, 20);
	panelWorker.add(comboBoxRoomWorker);
	
	btnSaveWorker = new JButton(txtbtnSaveWorker);
	btnSaveWorker.setBounds(216, 208, 89, 23);
	panelWorker.add(btnSaveWorker);
	
	panelGuest = new JPanel();
	tabbedPaneSettler.addTab("Guest", null, panelGuest, null);
	panelGuest.setLayout(null);
	
	lblNameGuest = new JLabel(txtlblNameGuest);
	lblNameGuest.setBounds(10, 11, 46, 14);
	panelGuest.add(lblNameGuest);
	
	textFieldNameGuest = new JTextField();
	textFieldNameGuest.setBounds(80, 8, 86, 20);
	panelGuest.add(textFieldNameGuest);
	textFieldNameGuest.setColumns(10);
	
	lblSurnameGuest = new JLabel(txtlblSurnameGuest);
	lblSurnameGuest.setBounds(10, 36, 46, 14);
	panelGuest.add(lblSurnameGuest);
	
	textFieldSurnameGuest = new JTextField();
	textFieldSurnameGuest.setBounds(80, 33, 86, 20);
	panelGuest.add(textFieldSurnameGuest);
	textFieldSurnameGuest.setColumns(10);
	
	textFieldSsnGuest = new JTextField();
	textFieldSsnGuest.setBounds(370, 8, 86, 20);
	panelGuest.add(textFieldSsnGuest);
	textFieldSsnGuest.setColumns(10);
	
	lblSsnGuest = new JLabel(txtlblSsnGuest);
	lblSsnGuest.setBounds(296, 11, 46, 14);
	panelGuest.add(lblSsnGuest);
	
	separator_3 = new JSeparator();
	separator_3.setBounds(0, 105, 525, 2);
	panelGuest.add(separator_3);
	
	lblDormitoryGuest = new JLabel(txtlblDormitoryGuest);
	lblDormitoryGuest.setBounds(10, 142, 56, 14);
	panelGuest.add(lblDormitoryGuest);
	
    comboBoxDormitoryGuest = new JComboBox();
	comboBoxDormitoryGuest.setBounds(80, 139, 86, 20);
	panelGuest.add(comboBoxDormitoryGuest);
	
	lblRoomGuest = new JLabel(txtlblRoomGuest);
	lblRoomGuest.setBounds(10, 167, 46, 14);
	panelGuest.add(lblRoomGuest);
	
	comboBoxRoomGuest = new JComboBox();
	comboBoxRoomGuest.setBounds(80, 164, 86, 20);
	panelGuest.add(comboBoxRoomGuest);
	
	lblDateFromGuest = new JLabel(txtlblDateFromGuest);
	lblDateFromGuest.setBounds(189, 142, 56, 14);
	panelGuest.add(lblDateFromGuest);
	
	textFieldDateFromGuest = new JTextField();
	textFieldDateFromGuest.setBounds(245, 139, 86, 20);
	panelGuest.add(textFieldDateFromGuest);
	textFieldDateFromGuest.setColumns(10);
	
	lblDateToGuest = new JLabel(txtlblDateToGuest);
	lblDateToGuest.setBounds(189, 167, 46, 14);
	panelGuest.add(lblDateToGuest);
	
	textFieldDateToGuest = new JTextField();
	textFieldDateToGuest.setBounds(245, 164, 86, 20);
	panelGuest.add(textFieldDateToGuest);
	textFieldDateToGuest.setColumns(10);
	
	lblPricesGuest = new JLabel(txtlblPricesGuest);
	lblPricesGuest.setBounds(396, 118, 46, 14);
	panelGuest.add(lblPricesGuest);
	
	lblPriceForDayGuest = new JLabel(txtlblPriceForDayGuest);
	lblPriceForDayGuest.setBounds(352, 142, 75, 14);
	panelGuest.add(lblPriceForDayGuest);
	
	textFieldPriceForDayGuest = new JTextField();
	textFieldPriceForDayGuest.setText("");
	textFieldPriceForDayGuest.setBounds(429, 139, 86, 20);
	panelGuest.add(textFieldPriceForDayGuest);
	textFieldPriceForDayGuest.setColumns(10);
	
	lblTotalPriceGuest = new JLabel(txtlblTotalPriceGuest);
	lblTotalPriceGuest.setBounds(353, 167, 66, 14);
	panelGuest.add(lblTotalPriceGuest);
	
	textFieldTotalPriceGuest = new JTextField();
	textFieldTotalPriceGuest.setBounds(429, 164, 86, 20);
	panelGuest.add(textFieldTotalPriceGuest);
	textFieldTotalPriceGuest.setColumns(10);
	
	lblPhoneGuest = new JLabel(txtlblPhoneGuest);
	lblPhoneGuest.setBounds(296, 36, 46, 14);
	panelGuest.add(lblPhoneGuest);
	
	textFieldPhoneGuest = new JTextField();
	textFieldPhoneGuest.setBounds(370, 33, 86, 20);
	panelGuest.add(textFieldPhoneGuest);
	textFieldPhoneGuest.setColumns(10);
	
	btnSaveGuest = new JButton(txtbtnSaveGuest);
	btnSaveGuest.setBounds(216, 208, 89, 23);
	panelGuest.add(btnSaveGuest);
	
	lblQuantityOfFree = new JLabel(txtlblQuantityOfFree);
	lblQuantityOfFree.setBounds(150, 82, 533, 14);
	add(lblQuantityOfFree);
	
	btnReset = new JButton(txtbtnReset);
	btnReset.setBounds(588, 424, 89, 23);
	add(btnReset);
	
	separator_4 = new JSeparator();
	separator_4.setBounds(0, 60, 800, 2);
	add(separator_4);
	
	btnBack = new JButton(txtBtnBack);
	btnBack.setBounds(701, 22, 89, 23);
	add(btnBack);
}
public void addListener(ActionListener l) {

	    btnSaveStudent.addActionListener(l);
	    btnSaveGuest.addActionListener(l);
	    btnSaveWorker.addActionListener(l);
		btnReset.addActionListener(l);
		btnBack.addActionListener(l);
	}
public JButton getBtnReset() {
	return btnReset;
}
public JButton getBtnSaveStudent() {
	return btnSaveStudent;
}
public JButton getBtnSaveGuest() {
	return btnSaveGuest;
}
public JButton getBtnSaveWorker() {
	return btnSaveWorker;
}
public JButton getBtnBack(){
	return btnBack;
}
}