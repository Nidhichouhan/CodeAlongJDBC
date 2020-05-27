import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {
public Connection getConnection() throws SQLException, ClassNotFoundException {
	//Register the Driver 
	Class.forName("oracle.jdbc.OracleDriver");
	
	//Establishing the connection through connection object
	Connection con=null;
	
	con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","admin");
	
	
	if(con!=null) {
		System.out.println("Established");
	}
	return con;
}
}
