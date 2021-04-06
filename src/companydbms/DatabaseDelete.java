package companydbms;

import java.sql.*;
import java.util.Scanner;

public class DatabaseDelete {
	private static String url = "jdbc:mysql://localhost:3306/company?autoReconnect=true&useSSL=false";
	private static String user = "root";
	private static String pass = "RedPanda4";
	
	public static void delEmployee() {
		Scanner scan = new Scanner(System.in);
		try {
			//1. Get a connection
			Connection myConn = DriverManager.getConnection(url, user, pass);
			System.out.println("Connection Established to Company:Employee");
			//2. Create Statement
			Statement myStmt = myConn.createStatement();
			//3. Execute SQl Query
			System.out.println("Please enter the last name of the employee you'd like to delete.");
			String lname = scan.next();
			
			myStmt.executeUpdate("delete from employee where lname='"+lname+"'");
			System.out.println("Delete Succesful");
		}
		catch (Exception exc) {
			exc.printStackTrace();
		}
		close(scan);
	}
	public static void delDepartment() {
		Scanner scan = new Scanner(System.in);
		try {
			//1. Get a connection
			Connection myConn = DriverManager.getConnection(url, user, pass);
			System.out.println("Connection Established to Company:Department");
			//2. Create Statement
			Statement myStmt = myConn.createStatement();
			//3. Execute SQl Query
			System.out.println("Please enter the name of the department you'd like to delete.");
			String dname = scan.next();
			
			myStmt.executeUpdate("delete from department where dname='"+dname+"'");
			System.out.println("Delete Succesful");
		}
		catch (Exception exc) {
			exc.printStackTrace();
		}
		close(scan);
	}
	public static void delProject() {
		Scanner scan = new Scanner(System.in);
		try {
			//1. Get a connection
			Connection myConn = DriverManager.getConnection(url, user, pass);
			System.out.println("Connection Established to Company:Project");
			//2. Create Statement
			Statement myStmt = myConn.createStatement();
			//3. Execute SQl Query
			System.out.println("Please enter the name of the project you'd like to delete.");
			String pname = scan.next();
			
			myStmt.executeUpdate("delete from projects where pname='"+pname+"'");
			System.out.println("Delete Succesful");
		}
		catch (Exception exc) {
			exc.printStackTrace();
		}
		close(scan);
	}
	public static void delWorksOn() {
		Scanner scan = new Scanner(System.in);
		try {
			//1. Get a connection
			Connection myConn = DriverManager.getConnection(url, user, pass);
			System.out.println("Connection Established to Company:Works_On");
			//2. Create Statement
			Statement myStmt = myConn.createStatement();
			//3. Execute SQl Query
			System.out.println("Please enter the employee social of the work records you'd like to delete.");
			System.out.println("WARNING: This may delete multiple entries.");
			int essn = scan.nextInt();
			
			myStmt.executeUpdate("delete from works_on where essn='"+essn+"'");
			System.out.println("Delete Succesful");
		}
		catch (Exception exc) {
			exc.printStackTrace();
		}
		close(scan);
	}
	private static void close(Scanner scan) {
		// TODO Auto-generated method stub
		
	}

}
