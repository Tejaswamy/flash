import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class ConnectDB {
	static Connection connection = null;
	static String databaseName="";
	static String url= "jdbc:mysql://localhost:3306/new_schema11";
	static String username = "root";
	static String password = "Work@123";
	
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

//Class.forName("com.mysql.jdbc.Driver").newInstance();
connection = DriverManager.getConnection(url,username,password);
PreparedStatement ps = connection.prepareStatement("INSERT INTO students(studentid, name, place, phone, studentscol)VALUES(?, ?, ?, ?, ?);");

	ps.setString(1, "1");
	ps.setString(2, "Mike");
	ps.setString(3, "US");
	ps.setString(4, "33479294");
	ps.setString(5, "");
	ps.setString(1, "222");
	ps.setString(2, "David");
	ps.setString(3, "USA");
	ps.setString(4, "393479294");
	ps.setString(5, "");

int status = ps.executeUpdate();
if(status!=0) {
	System.out.println("database was connected");
	System.out.println("Record was inserted");
}
	}

}
