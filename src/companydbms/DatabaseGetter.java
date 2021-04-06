package companydbms;

import java.sql.*;

public class DatabaseGetter {
	private static String url = "jdbc:mysql://localhost:3306/company?autoReconnect=true&useSSL=false";
	private static String user = "root";
	private static String pass = "RedPanda4";
	
	//Getter Method for EMPLOYEE
	public static void getEmployee(){
		try {
			//1. Get a connection
			Connection myConn = DriverManager.getConnection(url, user, pass);
			//2. Create Statement
			Statement myStmt = myConn.createStatement();
			//3. Execute SQl Query
			ResultSet myRs = myStmt.executeQuery("select * from employee");
			//FORMATTING
			System.out.println("-----------------------------------------------------------------------------");
		    System.out.printf("%10s %15s %10s %15s %10s", "LAST NAME", "FIRST NAME", "SSN", "SUPER-SSN", "DEPT.NO");
		    System.out.println();
		    System.out.println("-----------------------------------------------------------------------------");
		    //4. Process result set.
			while (myRs.next()) {
			    System.out.format("%10s %10s %20d %10d %5d",
			        		myRs.getString("lname"), myRs.getString("fname"), myRs.getInt("ssn"), myRs.getInt("Super_ssn"), myRs.getInt("Dno"));
			    System.out.println();
			    System.out.println("-----------------------------------------------------------------------------");
			}
		}
		catch (Exception exc) {
			exc.printStackTrace();
		}
	}
	
	public static void getDepartment(){
		try {
			//1. Get a connection
			Connection myConn = DriverManager.getConnection(url, user, pass);
			//2. Create Statement
			Statement myStmt = myConn.createStatement();
			//3. Execute SQl Query
			ResultSet myRs = myStmt.executeQuery("select * from department");
			//FORMATTING
			System.out.println("-----------------------------------------------------------------------------");
		    System.out.printf("%10s %15s %15s %25s ", "DEPT.NAME", "DEPT.NO", "MANAGER-SSN", "MANAGER-START-DATE");
		    System.out.println();
		    System.out.println("-----------------------------------------------------------------------------");
		    //4. Process result set.
			while (myRs.next()) {
			    System.out.format("%10s %10d %20d %20s" ,
			        		myRs.getString("dname"), myRs.getInt("dnumber"), myRs.getInt("mgr_ssn"), myRs.getString("mgr_start_date"));
			    System.out.println();
			    System.out.println("-----------------------------------------------------------------------------");
			}
		}
		catch (Exception exc) {
			exc.printStackTrace();
		}
	}
	
	public static void getProject(){
		try {
			//1. Get a connection
			Connection myConn = DriverManager.getConnection(url, user, pass);
			//2. Create Statement
			Statement myStmt = myConn.createStatement();
			//3. Execute SQl Query
			ResultSet myRs = myStmt.executeQuery("select * from project");
			//FORMATTING
			System.out.println("-----------------------------------------------------------------------------");
		    System.out.printf("%10s %15s %15s %25s ", "PROJECT-NAME", "PROJECT-NUMBER", "LOCATION", "DEPT.NO");
		    System.out.println();
		    System.out.println("-----------------------------------------------------------------------------");
		    //4. Process result set.
			while (myRs.next()) {
			    System.out.format("%10s %10d %20s %20d" ,
			        		myRs.getString("pname"), myRs.getInt("pnumber"), myRs.getString("plocation"), myRs.getInt("dnum"));
			    System.out.println();
			    System.out.println("-----------------------------------------------------------------------------");
			}
		}
		catch (Exception exc) {
			exc.printStackTrace();
		}
	}
	
	public static void getWorksOn(){
		try {
			//1. Get a connection
			Connection myConn = DriverManager.getConnection(url, user, pass);
			//2. Create Statement
			Statement myStmt = myConn.createStatement();
			//3. Execute SQl Query
			ResultSet myRs = myStmt.executeQuery("select * from works_on");
			//FORMATTING
			System.out.println("-----------------------------------------------------------------------------");
		    System.out.printf("%10s %15s %15s ", "EMPLOYEE-SSN", "PROJECT-NUMBER", "HOURS");
		    System.out.println();
		    System.out.println("-----------------------------------------------------------------------------");
		    //4. Process result set.
			while (myRs.next()) {
			    System.out.format("%10d %10d %20s " ,
			        		myRs.getInt("essn"), myRs.getInt("pno"), myRs.getString("hours"));
			    System.out.println();
			    System.out.println("-----------------------------------------------------------------------------");
			}
		}
		catch (Exception exc) {
			exc.printStackTrace();
		}
	}

}
