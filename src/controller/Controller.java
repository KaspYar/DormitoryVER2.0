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
  Here starts all Listener<Types>
*/	
	private class ListenerLogIn implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			Object source = e.getSource();
			if(source == login.getBtnSpravka()){
				System.out.println("ListenerLogIn: pressed getInfo");
				//login.getInfoTool().setVisible(true);
			}
			if (source == login.getBtnLogIn()){
				System.out.println("ListenerLogIn: pressed LogIn");					
			}
		}

	}
}
