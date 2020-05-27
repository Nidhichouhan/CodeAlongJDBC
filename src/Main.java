import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException, ClassNotFoundException, SQLException {
		System.out.println("Register Here");
		System.out.println("Login Here");
		int x;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		x=Integer.parseInt(br.readLine());
		
		RegisterPOJO registerpojo=new RegisterPOJO();
		RegsiterDAO registerdao=new RegsiterDAO();
		LoginPOJO loginpojo=new LoginPOJO();
		LoginDAO logindao=new LoginDAO();
		
		switch(x) {
		case 1:
			System.out.println("Enter the First Name:");
			String firstname=br.readLine();
			System.out.println("Enter the Last Name:");
			String lastname=br.readLine();
			System.out.println("Enter the Username:");
			String username=br.readLine();
			System.out.println("Enter the Password:");
			String password=br.readLine();
			System.out.println("Enter the Email:");
			String email=br.readLine();
			
			registerpojo.setFirstname(firstname);
			registerpojo.setLastname(lastname);
			registerpojo.setUsername(username);
			registerpojo.setPassword(password);
			registerpojo.setEmail(email);
			
			registerdao.addUser(registerpojo);
			
			break;
		case 2:
			System.out.println("Enter the Username:");
			String username1=br.readLine();
			System.out.println("Enter the Password:");
			String password1=br.readLine();
			
			loginpojo.setUsername(username1);
			loginpojo.setPassword(password1);
			
			
			if(logindao.verifyUser(loginpojo)==true) {
				Example example=new Example();
				example.display();
			}
			else {
				System.out.println("Incorrect UserName or Password");
			}
			break;
		}
	}

}
