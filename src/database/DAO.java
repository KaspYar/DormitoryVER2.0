package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Logger;

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
		try {
			pst = connection.prepareStatement("SELECT * FROM persons");
			rs = pst.executeQuery();
			while(rs.next()){
				log.info("Lastname:  "+rs.getString("LASTNAME") );
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
