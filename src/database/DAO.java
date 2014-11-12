package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Logger;

import model.Dormitory;

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
	public void firstStep(){
		//String [] str = {"01","04","05","08","09","12","13","16","17","20","21","24","25","28","29","32"};
		try{
			System.out.println("FirstStep");
			pst = connection.prepareStatement("SELECT * FROM STUDENTPROFILE WHERE ID < 5");
			//pst.setInt(1, 1);
			rs = pst.executeQuery();			
			while(rs.next()){
				System.out.println("ID:  "+rs.getInt("ID") );
			}
				
			/*pst = connection.prepareStatement("INSERT INTO BLOCK(IDDORM, NUMBERSOFROOMS) VALUES (2, ?)");
			for(int j=2;j<10;j++)
				for (int i=0;i<str.length-1;i+=2){
				//System.out.println(""+j+str[i]+"-"+j+str[i+1]);
					pst.setString(1, ""+j+str[i]+"-"+j+str[i+1]);
					int a = pst.executeUpdate();
					pst.clearParameters();
					System.out.println("Inserted: "+j+str[i]+"-"+j+str[i+1]);
					int res = pst.executeUpdate();
			}*/
			
						
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	public boolean checkStudentByIdentNumberAndPswd(String idd, char [] pswd){
		boolean help = false;
		try{
			pst = connection.prepareStatement("SELECT * FROM STUDENTPROFILE WHERE IDENTNUMBER=?");
			pst.setString(1,idd);
			ResultSet rs  = pst.executeQuery();
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
	
}
