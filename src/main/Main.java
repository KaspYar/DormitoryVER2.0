package main;

import java.util.logging.Logger;

import org.apache.log4j.lf5.Log4JLogRecord;
import org.apache.log4j.xml.Log4jEntityResolver;

import controller.Controller;
import view.MainContainer;

public class Main {
	private static Logger log = Logger.getLogger(Log4JLogRecord.class.getName());
	public static void main(String [] args){
<<<<<<< HEAD
		MainContainer mc = new MainContainer();
		Controller contr = new Controller(mc);
=======
		//MainContainer mc = new MainContainer();
		//Controller contr = new Controller(mc);
>>>>>>> 2bb78ae8af75abd8a56b4d46f2c42a7284979ead
		//database.DAO.INSTANCE.firstStep();
	}
}
