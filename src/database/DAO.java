package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Logger;

import javax.swing.JOptionPane;

import model.Dormitory;
import model.IUser;
import model.ProfileCommandant;
import model.ProfileStudent;
import model.Settler;

import org.apache.log4j.lf5.Log4JLogRecord;

public enum DAO {
	INSTANCE;
	
	Logger log = Logger.getLogger(Log4JLogRecord.class.getName());
	
	String base_server = "jdbc:oracle:thin:@localhost:1521:XE";
	String base_user = "kaspyar";
	String base_pass = "mypass";
	Connection connection;
	PreparedStatement pst = null;
	ResultSet rs = null;
	
	/*
	data for prototype 
	*/
	//---------------------------------------
	private DAO(){
		System.out.println("Connection created!");
		try {			 
			Class.forName("oracle.jdbc.driver.OracleDriver");
 
		} catch (ClassNotFoundException e) { 
			System.out.println("Where is your Oracle JDBC Driver?");
			e.printStackTrace();
			return; 
		}
		try {
			connection = DriverManager.getConnection(base_server, base_user, base_pass);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Connection failed!");
			e.printStackTrace();
		}
	}
	public void closeConnection(){
		try {
			if (! connection.isClosed() )connection.close();
			log.info("Connection closed");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	/*
	public boolean checkStudentByIdentNumberAndPswd(String idd, char [] pswd){
		boolean help = false;
		try{
			pst = connection.prepareStatement("SELECT * FROM STUDENTPROFILE WHERE IDENTNUMBER=?");
			pst.setString(1,idd);
			rs  = pst.executeQuery();
			if (rs.next()){
				help = true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		char [] goodPswd = {'1','1','1','1','1'};
		if (goodPswd.length != pswd.length) help = false;
		else{
			for (int i=0;i<goodPswd.length;i++) 
				if (goodPswd[i] != pswd[i]) {
				help = false;
				break;
			}
		}
		return help;
	}
	
	public model.IUser getStudentBySsn(String logIn) {
		model.Student stud = null;
		try{
			pst = connection.prepareStatement("SELECT * "
					+ "FROM STUDENT S INNER JOIN STUDENTPROFILE SP ON S.IDPROFILE = SP.IDSTUDENT "
					+ "WHERE SP.IDENTNUMBER = ?");
			pst.setString(1, logIn);
			rs = pst.executeQuery();
			if (rs.next()){
						ProfileStudent prSt = new ProfileStudent(rs.getString("LASTNAME"), rs.getString("FIRSTNAME"), 
						rs.getString("FATHERNAME"), rs.getString("IDENTNUMBER"));
				stud = new model.Student(prSt, rs.getInt("IDROOM"));			
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return stud;
		
	}
	*/
	public IUser getStudentBySsn(String logIn, char [] pswd) throws SQLException{
		model.Student stud = null;
		char [] goodPswd = {'1','1','1','1','1'};
		if (goodPswd.length != pswd.length) return null;
		else{
			for (int i=0;i<goodPswd.length;i++) 
				if (goodPswd[i] != pswd[i]) {
				return null;
			}
		}	
			pst = connection.prepareStatement("SELECT * "
					+ "FROM STUDENT S INNER JOIN STUDENTPROFILE SP ON S.IDPROFILE = SP.IDSTUDENT "
					+ "WHERE SP.IDENTNUMBER = ?");
			pst.setString(1, logIn);
			rs = pst.executeQuery();
			if (rs.next()){
						ProfileStudent prSt = new ProfileStudent(rs.getString("LASTNAME"), rs.getString("FIRSTNAME"), 
						rs.getString("FATHERNAME"), rs.getString("IDENTNUMBER"));
				stud = new model.Student(prSt, rs.getInt("IDROOM"));
			}			
		return stud;
	} 
	public IUser getCommandantBySsn(String logIn, char [] pswd) throws SQLException{
		model.Commandant cmd = null;
			pst = connection.prepareStatement("SELECT * "
					+ "FROM COMMANDANT C INNER JOIN COMMANDANTPROFILE CP ON C.IDPROFILE = CP.ID "
					+ "WHERE C.PSWD = ? AND CP.SSN = ?");
			pst.setString(1, new String(pswd));
			pst.setString(2, logIn);
			
			rs  = pst.executeQuery();
			if (rs.next()){
				ProfileCommandant prComm = new ProfileCommandant(rs.getString("LASTNAME"), rs.getString("FIRSTNAME"), 
						rs.getString("FATHERNAME"), rs.getString("SSN"));
				cmd = new model.Commandant(prComm, rs.getInt("IDDORM"));
			}		
		return cmd;
	}
	/* 
	 * old version
	public boolean checkCommandantByIdentNumberAndPswd(String logIn, char[] pswd) {
		
		boolean help = false;
		try{
			pst = connection.prepareStatement("SELECT C.PSWD, CP.SSN "
					+ "FROM COMMANDANT C INNER JOIN COMMANDANTPROFILE CP ON C.IDPROFILE = CP.ID "
					+ "WHERE C.PSWD = ? AND CP.SSN = ?");
			pst.setString(1, new String(pswd));
			pst.setString(2, logIn);
			
			rs  = pst.executeQuery();
			if (rs.next()){
				help = true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return help;
	}
	 
	public IUser getCommandantBySsn(String logIn) {
		model.Commandant cmd = null;
		try{
			pst = connection.prepareStatement("SELECT * "
					+ "FROM COMMANDANT C INNER JOIN COMMANDANTPROFILE CP ON C.IDPROFILE = CP.ID "
					+ "WHERE CP.SSN = ?");
			pst.setString(1, logIn);
			
			rs  = pst.executeQuery();
			if (rs.next()){
				ProfileCommandant prComm = new ProfileCommandant(rs.getString("LASTNAME"), rs.getString("FIRSTNAME"), 
						rs.getString("FATHERNAME"), rs.getString("SSN"));
				cmd = new model.Commandant(prComm, rs.getInt("IDDORM"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cmd;
		
	}
	*/
	public String getDormInfoToSettlerDAO(int idRoom){
		String str = "";
		try{
			pst = connection.prepareStatement("SELECT D.PHONE, D.ADRESS, B.NUMBERSOFROOMS, R.ROOMNUMBER, R.CAPACITY "
					+ "FROM DORMITORY D INNER JOIN (BLOCK B INNER JOIN ROOM R ON B.ID = R.IDBLOCK) ON D.ID = B.IDDORM "
					+ "WHERE R.ID = ?");
			pst.setInt(1, idRoom);
			rs = pst.executeQuery();
			if (rs.next()){
				str = "Адреса гуртожитка: "+rs.getString("ADRESS")+"\nтелефон: "+rs.getString("PHONE")+
						"\nБлок: "+rs.getString("NUMBERSOFROOMS")+
						"\nКімната: "+rs.getString("ROOMNUMBER")+"\nМісткість: "+rs.getString("CAPACITY");
			}
		} catch(SQLException e){
			e.printStackTrace();
		}
		return str;
	}
	public void deleteSettlerBySSN(String ssn){
		
	}
	
	
}
