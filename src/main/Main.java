package main;

import java.util.logging.Logger;

import org.apache.log4j.lf5.Log4JLogRecord;
import org.apache.log4j.xml.Log4jEntityResolver;

import controller.Controller;
import view.MainContainer;

public class Main {
	private static Logger log = Logger.getLogger(Log4JLogRecord.class.getName());
	public static void main(String [] args){

		MainContainer mc = new MainContainer();
		Controller contr = new Controller(mc);
		//database.DAO.INSTANCE.firstStep();
	}
}
