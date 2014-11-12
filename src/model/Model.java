package model;

import java.util.logging.Logger;

import org.apache.log4j.lf5.Log4JLogRecord;

public enum Model {
	INSTANCE;
	Logger log = Logger.getLogger(Log4JLogRecord.class.getName());
	private Model(){
		log.info("Model Instance Has Been Creared Successfully");
	}
	public boolean checkUserLogInPswd(String user, String logIn, char [] pswd){
		boolean auth = false;
		switch (user){
		case "Student":{
			if (database.DAO.INSTANCE.checkStudentByIdentNumberAndPswd(logIn, pswd)) auth = true;
			break;
		}
		case "Administrator":{
			auth = true;
			break;
		}
		case "Commandant":{
			auth = true;
			break;
		}
		case "Worker":{
			auth = true;
			break;
		}
		case "Guest":{
			auth = true;
			break;
		}		
		}
			
		return auth;
	}

}
