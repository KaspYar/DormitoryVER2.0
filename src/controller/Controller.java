package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Logger;

import javax.swing.JOptionPane;

import org.apache.log4j.lf5.Log4JLogRecord;

import view.Administrator;
import view.Commandant;
import view.LogIn;
import view.MainContainer;
import view.MyPanelWithLogOut;
import view.Student;

public class Controller {

	private MainContainer frame;
	private view.LogIn login;
	private view.Administrator admin;
	private view.Commandant command;
	private view.Student student;
	Logger log = Logger.getLogger(Log4JLogRecord.class.getName());

	public Controller(MainContainer mc) {
		this.frame = mc;
		frame.setVisible(true);
		
		login = new LogIn();
		frame.showPane(login);
		login.addListener(new ListenerLogIn());		
	}
/*
  Here starts all Listener<Types>
*/	
	private class ListenerLogIn implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			Object source = e.getSource();
			if(source == login.getBtnSpravka()){
				login.getLblInfoTool().setVisible(true);
			}
			if (source == login.getBtnLogIn()){
				log.info("ListenerLogIn: pressed LogIn");
				log.info("Value user: "+login.getBoxUser().getSelectedItem());
				log.info("Value login: "+login.getTextFieldLogin().getText());
				log.info("Value pswd: "+login.getTextFieldPswd().getText());
				try{
				if (login.getTextFieldLogin().getText().equals("") || 
						login.getTextFieldPswd().getPassword().length == 0 ){
					JOptionPane.showMessageDialog(login,
			                "Field(s) is(are) emtpy!",
			                "Warning!!!",
			                JOptionPane.WARNING_MESSAGE);				
				}else{
					boolean wrongInput = false;
					if (login.getBoxUser().getSelectedItem().equals("Administrator")){
						System.out.println("admin");
						/*check login and pswd for this user if */
						if (model.Model.INSTANCE.checkUserLogInPswd((String)login.getBoxUser().getSelectedItem(),
								login.getTextFieldLogin().getText(), login.getTextFieldPswd().getPassword())){
							admin = new Administrator();
							admin.addListener(new ListenerAdministrator());
							login.getTextFieldLogin().setText("");
							login.getTextFieldPswd().setText("");
							login.getAttentLbl().setText("");
							frame.showPane(admin);
						}else{
							wrongInput = true;							
						}
					}else if (login.getBoxUser().getSelectedItem().equals("Commandant")){
						System.out.println("comend");
						if (model.Model.INSTANCE.checkUserLogInPswd((String)login.getBoxUser().getSelectedItem(),
								login.getTextFieldLogin().getText(), login.getTextFieldPswd().getPassword())){
							command = new Commandant();
							command.addListener(new ListenerCommandant());
							login.getTextFieldLogin().setText("");
							login.getTextFieldPswd().setText("");
							login.getAttentLbl().setText("");
							frame.showPane(command);
						}else{
							wrongInput = true;							
						}
					} else if (login.getBoxUser().getSelectedItem().equals("Student")){
						System.out.println("student");
						if (model.Model.INSTANCE.checkUserLogInPswd((String)login.getBoxUser().getSelectedItem(),
								login.getTextFieldLogin().getText(), login.getTextFieldPswd().getPassword())){
							student = new Student();
							student.addListener(new ListenerStudent());
							login.getTextFieldLogin().setText("");
							login.getTextFieldPswd().setText("");
							login.getAttentLbl().setText("");
							frame.showPane(student);
						}else{
							wrongInput = true;							
						}
					}else if (login.getBoxUser().getSelectedItem().equals("Worker")){
						System.out.println("worker");
						/*if (model.Model.INSTANCE.checkUserLogInPswd((String)login.getBoxUser().getSelectedItem(),
								login.getTextFieldLogin().getText(), login.getTextFieldPswd().getPassword())){
							commmand = new Commandant();
							commmand.addListener(new ListenerCommandant());
							login.getTextFieldLogin().setText("");
							login.getTextFieldPswd().setText("");
							login.getAttentLbl().setText("");
							frame.showPane(commmand);
						}else{
							wrongInput = true;							
						}*/
					} else{
						System.out.println("guest");
						/*if (model.Model.INSTANCE.checkUserLogInPswd((String)login.getBoxUser().getSelectedItem(),
								login.getTextFieldLogin().getText(), login.getTextFieldPswd().getPassword())){
							commmand = new Commandant();
							commmand.addListener(new ListenerCommandant());
							login.getTextFieldLogin().setText("");
							login.getTextFieldPswd().setText("");
							login.getAttentLbl().setText("");
							frame.showPane(commmand);
						}else{
							wrongInput = true;							
						}*/
					}
					if (wrongInput){
						JOptionPane.showMessageDialog(login,
				                "You entered wrong value(s)!",
				                "ERROR",
				                JOptionPane.ERROR_MESSAGE);
					}
				}
				}catch(SQLException exc){
					JOptionPane.showMessageDialog(login,
			                "You entered wrong value(s) type!",
			                "ERROR",
			                JOptionPane.ERROR_MESSAGE);
				}
			}//logInBtn
			if (source == login.getBoxUser()){
				System.out.println("Box user value = "+login.getBoxUser().getSelectedItem());
			}
		}

	}
	private class ListenerAdministrator implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			Object source = e.getSource();
			if (source == admin.getBtnLogOut()){
				frame.showPane(login);
			}
			
		}
		
	}
	private class ListenerCommandant implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			Object source = e.getSource();
			if (source == command.getBtnLogOut()){
				frame.showPane(login);
			}
			
			
		}
		
	}
	private class ListenerStudent implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			Object source = e.getSource();
			if (source == student.getBtnLogOut()){
				frame.showPane(login);
			}
			if (source == student.getBtnGetDormInfo()){
				log.info("StudentView: Button Dormitory Info");
				String result = model.Model.INSTANCE.getDormInfoToSettler();
				student.getTextPanePrinter().setText(result);
			}
			if (source == student.getBtnGetRequestStatus()){
				System.out.println("StudentView: Button Request Status");
			}
			if (source == student.getBtnPay()){
				System.out.println("StudentView: Button Pay");
			}
			
		}
		
	}
}
