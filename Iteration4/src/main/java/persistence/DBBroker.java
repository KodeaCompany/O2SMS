package persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBBroker {

	private String cadCon = "jdbc:ucanaccess://C:\\Users\\JAVIER OLIVER ASUS\\Desktop\\uni\\1º cuatrimestre (3)\\IngSoft2\\practicas\\GestaBox\\Gestabox.accdb";

	private Connection conn;
	private static DBBroker instance = null;

	private DBBroker() throws Exception{
		Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
		conn = DriverManager.getConnection(cadCon);
	}

	public static DBBroker GetInstance(){
		if(instance == null){
			try {
				instance = new DBBroker();
			} catch (Exception e) {

			}
		}
		return instance;
	}
	
	public ResultSet read(String sql) throws SQLException{
		Statement s = conn.createStatement();
		ResultSet rs = s.executeQuery(sql);
		return rs;

	}
	
	public int change(String sql) throws SQLException{
		Statement s = conn.createStatement();
		int res = s.executeUpdate(sql);
		return res;
	} 	
}
