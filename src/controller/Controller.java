package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import javax.swing.JOptionPane;

import org.apache.log4j.lf5.Log4JLogRecord;

import fabricMethod.GuestFactory;
import fabricMethod.ISettlerFactory;
import sun.tools.jar.CommandLine;
import view.AddRequest;
import view.Administrator;
import view.Commandant;
import view.LogIn;
import view.MainContainer;
import view.MyPanelWithLogOut;
import view.Student;
import view.AddDormitory;

public class Controller {

	private MainContainer frame;
	private view.LogIn login;
	private view.Administrator admin;
	private view.Commandant command;
	private view.Student student;
	private view.AddRequest addRequest;
	
	private model.IUser user;
	private model.Request rqst;
	private ISettlerFactory fact;
	private view.AddDormitory adddormitory;
	
	
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
							user = new model.Administrator();
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
							user = new model.Commandant();
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
			if (source == admin.getBtnAddNewSettler()){
				addRequest = new AddRequest();
				addRequest.addListener(new ListenerAddRequest());
				frame.showPane(addRequest);
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
			if(source == command.getBtnSettle()){
				System.out.println("Commandant View : settle");
			}
			if(source == command.getBtnEvict()){
				System.out.println("Commandant View : evict ");
			}
			if (source == command.getBtnEvictAllGraduates()){
				System.out.println("commandant view: evict all graduateras" );
			}
			if (source == command.getBtnInhabitansOfRoom()){
				System.out.println("command view: inhabitans of room");
			}
			if (source == command.getBtnResettle()){
				System.out.println("command view: resettle");
			}
			if (source == command.getBtnShowMonitor()){
				System.out.println("command view: information about monitor  ");
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
				((model.Student)user).getMyDormitory();
				((model.Student)user).getMyRoom();
				String result = model.Model.INSTANCE.getDormInfoToSettler();
				student.getTextPanePrinter().setText(result);
			}
			if (source == student.getBtnGetRequestStatus()){
				System.out.println("Student: Button Request Status");
				rqst = model.Model.INSTANCE.getRequestToStudent();
				rqst.getStatus();
			}
			if (source == student.getBtnPay()){
				((model.Student)user).pay();
			}
			
		}
		
	}
	private class ListenerWorker implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			Object source = e.getSource();
			if (source == student.getBtnLogOut()){
				frame.showPane(login);
			}
			if (source == student.getBtnGetDormInfo()){
				((model.Worker)user).getMyDormitory();
				((model.Worker)user).getMyRoom();
				String result = "Тут повинна бути інформація про гуртожиток для працівника";
				student.getTextPanePrinter().setText(result);
			}
			if (source == student.getBtnGetRequestStatus()){
				System.out.println("Worker: Button Request Status");
				rqst = model.Model.INSTANCE.getRequestToWorker();
				student.getTextPanePrinter().setText(rqst.getStatus());
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
	private class ListenerGuest implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			Object source = e.getSource();
			if (source == student.getBtnLogOut()){
				frame.showPane(login);
			}
			if (source == student.getBtnGetDormInfo()){
				((model.Guest)user).getMyDormitory();
				((model.Guest)user).getMyRoom();
			}
			if (source == student.getBtnGetRequestStatus()){
				System.out.println("Guest: Button Request Status");
				rqst = model.Model.INSTANCE.getRequestToGuest();
				student.getTextPanePrinter().setText(rqst.getStatus());
			}
			if (source == student.getBtnPay()){
				((model.Guest)user).pay();

			}
		}
		private class ListenerAddDormitory implements ActionListener{
			
				@Override
				public void actionPerformed(ActionEvent e) {
					Object source = e.getSource();
					if (source == adddormitory.getBtnSave()){
						System.out.println("AddDormitory View: added new dormitory");
					}
					if(source == adddormitory.getBtnReset()){
						System.out.println("AddDormitory View: resetted all fields");
					}
					
			}
		}
		
	}
	private class ListenerAddRequest implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			Object source = e.getSource();
			if (source == addRequest.getBtnBack()){
				frame.showPane(admin);
			}
			if (source == addRequest.getBtnReset()){
				System.out.println("reset btn");
			}
			if (source == addRequest.getBtnSaveGuest()){
				System.out.println("Save Guest");
				fact = new fabricMethod.GuestFactory();
				model.Guest gst = (model.Guest)fact.getSettler();
				model.ProfileGuest pfGst = (model.ProfileGuest)fact.getProfile();
				model.Request rq = new model.Request();
				model.Model.INSTANCE.addSettlerToDb(gst, pfGst);
				model.Model.INSTANCE.addRequestToDb(rq);
			}
			if (source == addRequest.getBtnSaveStudent()){
				System.out.println("save student");
				fact = new fabricMethod.StudentFactory();
				model.Student gst = (model.Student)fact.getSettler();
				model.ProfileStudent pfGst = (model.ProfileStudent)fact.getProfile();				
				model.Request rq = new model.Request();
				model.Model.INSTANCE.addSettlerToDb(gst, pfGst);
				model.Model.INSTANCE.addRequestToDb(rq);
			}
			if (source == addRequest.getBtnSaveWorker()){
				System.out.println("save worker");
				fact = new fabricMethod.WorkerFactory();
				model.Worker gst = (model.Worker)fact.getSettler();
				model.ProfileWorker pfGst = (model.ProfileWorker)fact.getProfile();				
				model.Request rq = new model.Request();
				model.Model.INSTANCE.addSettlerToDb(gst, pfGst);
				model.Model.INSTANCE.addRequestToDb(rq);
			}
			
			
		}
		
	}
}
