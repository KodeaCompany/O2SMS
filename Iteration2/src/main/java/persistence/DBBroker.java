package persistence;
import java.sql.*;

public class DBBroker {
	
	private Connection conexion;
	
	public DBBroker(){
		
		try
		{
		   Class.forName("com.mysql.jdbc.Driver");
		   conexion = DriverManager.getConnection ("jdbc:mysql://localhost/multas","ulises", "1234578");
		   	   
		} catch (Exception e)
		{
		   e.printStackTrace();
		} 
	}
	
	public int change(String sql){
		int rs = 0;
		try {
			Statement s = conexion.createStatement();
			rs = s.executeUpdate(sql);
			conexion.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}
	
	public ResultSet read(String sql){
		Statement s = null;
		ResultSet rs = null;
		try {
			s = conexion.createStatement();
			rs = s.executeQuery(sql);
			conexion.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}
}
