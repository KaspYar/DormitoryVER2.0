package model;

import java.util.logging.Logger;

import org.apache.log4j.lf5.Log4JLogRecord;

public enum Model {
	INSTANCE;
	Logger log = Logger.getLogger(Log4JLogRecord.class.getName());
	private Model(){
		log.info("Model Instance Has Been Creared Successfully");
	}
	public boolean checkLogInPswd4Administrator(String logIn, char [] pswd){
		return true;
	}

}
