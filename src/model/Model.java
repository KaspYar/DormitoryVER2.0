package model;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Logger;

import org.apache.log4j.lf5.Log4JLogRecord;

import view.Student;

public enum Model {
	INSTANCE;
	Logger log = Logger.getLogger(Log4JLogRecord.class.getName());
	IUser user;
	private ArrayList<Settler> userList;
	public ArrayList<Settler> getUserList(){
		return userList;
	}
	private Model(){
		log.info("Model Instance Has Been Creared Successfully");
	}
	public boolean checkUserLogInPswd(String user, String logIn, char [] pswd)throws SQLException{
		boolean auth = false;
			switch (user){
			case "Student":{
				/*
				if (database.DAO.INSTANCE.checkStudentByIdentNumberAndPswd(logIn, pswd)){
					auth = true;
					this.user = database.DAO.INSTANCE.getStudentBySsn(logIn);
					log.info(( (model.Student) this.user).getProfile().getLastname());
				}
				*/
				this.user = database.DAO.INSTANCE.getStudentBySsn(logIn, pswd);
				if (this.user != null){
					auth = true;				
					log.info(( (model.Student) this.user).getProfile().getLastname());
				}
				break;
			}
			case "Administrator":{
				auth = true;
				this.user = new model.Administrator();
				break;
			}
			case "Commandant":{
				/*
				if (database.DAO.INSTANCE.checkCommandantByIdentNumberAndPswd(logIn, pswd)){
					auth = true;
					this.user = database.DAO.INSTANCE.getCommandantBySsn(logIn);
					log.info(( (model.Commandant) this.user).getProfile().getLastname());
				}
				*/
				this.user = database.DAO.INSTANCE.getCommandantBySsn(logIn, pswd);
				if (this.user != null){
					auth = true;				
					log.info(( (model.Commandant) this.user).getProfile().getLastname());
					//userList = database.DAO.INSTANCE.getAllSettlersToCommandant(((model.Commandant)this.user).getIdDormitory());
				}
				
				break;
			}
			case "Worker":{
				auth = true;
				//this.user = new model.Worker();
				break;
			}
			case "Guest":{
				auth = true;
				//this.user = new model.Guest();
				break;
			}		
			}	
			
		return auth;
	}
	public String getDormInfoToSettler(){
		return database.DAO.INSTANCE.getDormInfoToSettlerDAO(((Settler)user).getMyRoom());
	}

}
