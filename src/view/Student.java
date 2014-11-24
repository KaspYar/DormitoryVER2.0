package view;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;

public class Student extends MyPanelWithLogOut{
	private String txtLblSignedAs = "Student";
	private String txtBtnGetDormInfo = "Get settle information";
	private String txtBtnGetRequestStatus = "Get request status";
	private String txtBtnPay = "Pay";
	private String txtLblYouCan = "You can:";
	private String txtLblOutput = "Output:";
	
	private JLabel lblSignedAs;
	private JLabel lblYouCan;
	private JLabel lblOutput;
	
	private JButton btnGetDormInfo;
	private JButton btnGetRequestStatus;
	private JButton btnPay;
	
	private JTextPane textPanePrinter;
	
	private JScrollPane scrollPane;

	public Student() {
		
		lblSignedAs = new JLabel(txtLblSignedAs);
		lblSignedAs.setForeground(Color.WHITE);
		lblSignedAs.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblSignedAs.setBounds(350, 15, 100, 30);
		add(lblSignedAs);
		
		btnGetDormInfo = new JButton(txtBtnGetDormInfo);
		btnGetDormInfo.setBounds(39, 120, 180, 30);
		add(btnGetDormInfo);
		
		btnGetRequestStatus = new JButton(txtBtnGetRequestStatus);
		btnGetRequestStatus.setBounds(39, 180, 180, 30);
		add(btnGetRequestStatus);
		
		btnPay = new JButton(txtBtnPay);
		btnPay.setBounds(39, 240, 180, 30);
		add(btnPay);
		
		lblYouCan = new JLabel(txtLblYouCan);
		lblYouCan.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblYouCan.setBounds(20, 70, 149, 25);
		add(lblYouCan);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(400, 120, 350, 350);
		add(scrollPane);
		
		textPanePrinter = new JTextPane();
		textPanePrinter.setEditable(false);
		scrollPane.setViewportView(textPanePrinter);
		
		lblOutput = new JLabel(txtLblOutput);
		lblOutput.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblOutput.setBounds(400, 70, 92, 38);
		add(lblOutput);
	}
	
	
	public JButton getBtnGetDormInfo() {
		return btnGetDormInfo;
	}


	public JButton getBtnGetRequestStatus() {
		return btnGetRequestStatus;
	}


	public JButton getBtnPay() {
		return btnPay;
	}


	public JTextPane getTextPanePrinter() {
		return textPanePrinter;
	}	

	public void setTxtLblSignedAs(String str) {
		this.lblSignedAs.setText(str);
	}


	public void addListener(ActionListener l){
		this.getBtnLogOut().addActionListener(l);
		this.btnGetDormInfo.addActionListener(l);
		this.btnGetRequestStatus.addActionListener(l);
		this.btnPay.addActionListener(l);
	}
}
