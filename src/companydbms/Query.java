package companydbms;

import java.sql.*;
import java.util.Scanner;

public class Query {
	private static String url = "jdbc:mysql://localhost:3306/company?autoReconnect=true&useSSL=false";
	private static String user = "root";
	private static String pass = "RedPanda4";
	
	public static void makeQuery() throws SQLException {
		
		Connection myConn = null;
		PreparedStatement myStmt = null;
		ResultSet myRs = null;
		
		
		Scanner scan = new Scanner(System.in);
		try {
			//1. Get a connection
			myConn = DriverManager.getConnection(url, user, pass);
			System.out.println("Connection Established to Company");
			//2. Prepare Statement
			myStmt = myConn.prepareStatement("select * from employee where dno=5");
			
			
			//3. Set parameters
			//System.out.println("Select?");
			//myStmt.setString(1, scan.next());
			//System.out.println("From?");
			//myStmt.setString(2, scan.next());
			//System.out.println("Where?");
			//myStmt.setString(3, scan.next());
			
			//4. Execute Query
			myRs = myStmt.executeQuery();
			
			
			//5. Display
			//System.out.println(myRs);
			while(myRs.next()) {
				String first_name = myRs.getString("fname");
				
				System.out.println(first_name);
			}
				
		}
		catch (Exception exc) {
			exc.printStackTrace();
		}
		finally {
			if (myRs != null) {
				myRs.close();
			}
			
			if (myStmt != null) {
				myStmt.close();
			}
			
			if (myConn != null) {
				myConn.close();
			}
		}
		close(scan);
	}
	private static void close(Scanner scan) {
		// TODO Auto-generated method stub
		
	}
}
