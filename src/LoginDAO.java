import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LoginDAO 
{
        public boolean verifyUser(LoginPOJO loginpojo) throws ClassNotFoundException, SQLException
        {
        	String username=loginpojo.getUsername();
        	String password=loginpojo.getPassword();
	
        	ConnectionManager cm=new ConnectionManager();
        	String sql="select * from USERDETAILS";
	
        	Statement st=cm.getConnection().createStatement();
        	ResultSet rs=st.executeQuery(sql);
	
        	while(rs.next())
        	{
        		if(username.equals(rs.getString("USERNAME")) && password.equals(rs.getString("PASSWORD")))
				return true;
				
        	}
		
        	return false;
		
	}
	}
	
	
