package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.LogIn;
import view.MainContainer;

public class Controller {

	private MainContainer frame;
	private LogIn login;

	public Controller(MainContainer mc) {
		this.frame = mc;
		frame.setVisible(true);
		
		login = new LogIn();
		frame.showPane(login);
		login.addListener(new ListenerLogIn());		
	}
/*
 * Here starts all Listener<Types>
 * */	
	private class ListenerLogIn implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			Object source = e.getSource();
			if(source == login.getSpravka()){
				System.out.println("ListenerLogIn: pressed getInfo");
				//login.getInfoTool().setVisible(true);
			}
			if (source == login.getLogInBtn()){
				System.out.println("ListenerLogIn: pressed LogIn");
				/*
				  String log = login.getLogin().getText();
				
				char[]  pswd = login.getPswd().getPassword();
				String pswdStr = new String(pswd);
				login.getInfoTool().setVisible(false);
				
				if (log.equals("") || pswdStr.equals("")){
					login.getPswd().setText("");
					login.getAttentLbl().setText("Перевірте правильність даних!");
					
					
					
				}
				else if (Model.Model.INSTANCE.doLogInAdmin(log, pswdStr)){
					adminView = new AdminView();
					adminView.addListener(new AdminViewListener());
					login.getLogin().setText("");
					login.getPswd().setText("");
					login.getAttentLbl().setText("");
					frame.showPane(adminView);
				} else
					try {
						if (Model.Model.INSTANCE.doLogInStudent(log, pswdStr)){
							studView = new StudView("Ви увійшли як " + log);
							studView.addListener(new StudViewListener());
							login.getPswd().setText("");
							login.getAttentLbl().setText("");
							frame.showPane(studView);
						}
						else if (Model.Model.INSTANCE.doLogInComend(log, pswdStr)){
							comendView = new ComendView();
							comendView.addListener(new ComendViewListener() );
							login.getLogin().setText("");
							login.getPswd().setText("");
							login.getAttentLbl().setText("");
							frame.showPane(comendView);
						}
						else{
							login.getPswd().setText("");
							login.getAttentLbl().setText("Перевірте правильність даних!");
						}
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
					 */	
			}
		}

	}
}
