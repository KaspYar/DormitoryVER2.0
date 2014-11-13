package model;

import java.util.logging.Logger;

import org.apache.log4j.lf5.Log4JLogRecord;

public enum Model {
	INSTANCE;
	Logger log = Logger.getLogger(Log4JLogRecord.class.getName());
	IUser user;
	private Model(){
		log.info("Model Instance Has Been Creared Successfully");
	}
	public boolean checkUserLogInPswd(String user, String logIn, char [] pswd){
		boolean auth = false;
		switch (user){
		case "Student":{
			if (database.DAO.INSTANCE.checkStudentByIdentNumberAndPswd(logIn, pswd)) auth = true;
			this.user = database.DAO.INSTANCE.getStudentBySsn(logIn);
			log.info(( (model.Student) this.user).getProfile().getLastname());
			break;
		}
		case "Administrator":{
			auth = true;
			this.user = new model.Administrator();
			break;
		}
		case "Commandant":{
			auth = true;
			//this.user = new model.Commandant();
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
