



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.Statement;
public class Retrievedata {
	static Connection connection = null;
	static String databaseName="";
	static String url= "jdbc:mysql://localhost:3306/new_schema11";
	static String username = "root";
	static String password = "Work@123";
	
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		String query = "select name , place from students ";
//Class.forName("com.mysql.jdbc.Driver").newInstance();
connection = DriverManager.getConnection(url,username,password);
java.sql.Statement statements = connection.createStatement();
 ResultSet rs = statements.executeQuery(query);
 rs.next();
 for (int i=0 ; i<10;i++) {
	 String data = rs.getString(1);
	 System.out.println(data);
	 
 }
 statements.close();
 connection.close();
	}

}
