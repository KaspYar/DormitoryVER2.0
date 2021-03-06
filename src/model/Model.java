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
	Commandant commandant;
	private ArrayList<Settler> userList;
	public ArrayList<Settler> getUserList(){
		return userList;
	}
	public IUser getIUser(){
		return user;
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
				auth = true;
				this.user = new model.Commandant();
				break;
			}
			case "Worker":{
				auth = true;
				this.user = new model.Worker();
				break;
			}
			case "Guest":{
				auth = true;
				this.user = new model.Guest();
				break;
			}		
			}	
			
		return auth;
	}
	public String getDormInfoToSettler(){
		return database.DAO.INSTANCE.getDormInfoToSettlerDAO(((Settler)user).getMyRoom());
	}
	public Request getRequestToWorker() {
		System.out.println("get request from db to worker");
		Request rqst = new Request();
		return rqst;
	}
	public Request getRequestToStudent() {
		System.out.println("get request from db to student");
		Request rqst = new Request();
		return rqst;
	}
	public Request getRequestToGuest() {
		System.out.println("get request from db to guest");
		Request rqst = new Request();
		return rqst;
	}
	public void addSettlerToDb(Settler gst, Profile pfGst) {
		if (gst instanceof model.Student){
			System.out.println("Student and his profile added to db");
		}
		if (gst instanceof model.Guest){
			System.out.println("Guest and his profile added to db");
		}
		if (gst instanceof model.Worker){
			System.out.println("Worker and his profile added to db");
		}
		
	}
	public void addRequestToDb(Request rq) {
		System.out.println("Request added to database");
		
	}
	public void addDormitoryToDb(Dormitory dr){
		System.out.println("Dormitory added to database");
	}
	public void addNewCommandant(model.Commandant cmd, ProfileCommandant pCmd) {
		System.out.println("New commandant and his profile added to db");
		
	}
	public void addNewLiving(Living living) {
		System.out.println("new Living added to database");		
	}

}
