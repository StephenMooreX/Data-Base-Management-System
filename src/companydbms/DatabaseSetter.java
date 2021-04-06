package companydbms;

import java.sql.*;
import java.util.Scanner;

public class DatabaseSetter {
	private static String url = "jdbc:mysql://localhost:3306/company?autoReconnect=true&useSSL=false";
	private static String user = "root";
	private static String pass = "RedPanda4";
	
	public static void insEmployee() {
		Scanner scan = new Scanner(System.in);
		try {
			//1. Get a connection
			Connection myConn = DriverManager.getConnection(url, user, pass);
			System.out.println("Connection Established to Company:Employee");
			//2. Create Statement
			Statement myStmt = myConn.createStatement();
			//3. Execute SQl Query
			System.out.println("Please enter the Employee's first name.");
			String fname = scan.next();
			System.out.println("Please enter the Employee's last name.");
			String lname = scan.next();
			System.out.println("Please enter the Employee's social.");
			int ssn = scan.nextInt();
			System.out.println("Please enter the Employee's Supervisor's social.");
			System.out.println("List of available sueprvisors: ");
			System.out.println("Franklin Wong: 333445555.");
			System.out.println("James Borg: 888665555.");
			System.out.println("Ahmad Jabbar: 987654321.");
			System.out.println("None, enter 0.");
			int super_ssn = scan.nextInt();
			System.out.println("Please enter the Employee's Department number.");
			int dno = scan.nextInt();
			
			myStmt.executeUpdate("insert into employee value('"+fname+"','"+lname+"','"+ssn+"','"+super_ssn+"','"+dno+"')");
			System.out.println("Insert Succesful");
		}
		catch (Exception exc) {
			exc.printStackTrace();
			System.out.println("ADD_HANDLER_ISSUE");
		}
		close(scan);
	}

	public static void insDepartment() {
		Scanner scan = new Scanner(System.in);
		try {
			//1. Get a connection
			Connection myConn = DriverManager.getConnection(url, user, pass);
			System.out.println("Connection Established to Company:Department");
			//2. Create Statement
			Statement myStmt = myConn.createStatement();
			//3. Execute SQl Query
			System.out.println("Please enter the Department name.");
			String dname = scan.next();
			System.out.println("Please enter the Department number.");
			int dnumber = scan.nextInt();
			System.out.println("Please enter the Manager's social");
			System.out.println("List of available managers: ");
			System.out.println("Franklin Wong: 333445555.");
			System.out.println("James Borg: 888665555.");
			System.out.println("Ahmad Jabbar: 987654321.");
			int mgr_ssn = scan.nextInt();
			System.out.println("Please enter the Manager's start date.");
            String mgr_start_date = scan.next();
            
            myStmt.executeUpdate("insert into department value('"+dname+"','"+dnumber+"','"+mgr_ssn+"','"+mgr_start_date+"')");
			System.out.println("Insert Succesful");
		}
		catch (Exception exc) {
			exc.printStackTrace();
			System.out.println("ADD_HANDLER_ISSUE");
		}
		close(scan);
		
	}
	
	public static void insProject() {
		Scanner scan = new Scanner(System.in);
		try {
			//1. Get a connection
			Connection myConn = DriverManager.getConnection(url, user, pass);
			System.out.println("Connection Established to Company:Project");
			//2. Create Statement
			Statement myStmt = myConn.createStatement();
			//3. Execute SQl Query
			System.out.println("Please enter the project's name.");
			String pname = scan.next();
			System.out.println("Please enter the project's number.");
			int pnumber = scan.nextInt();
			System.out.println("Please enter the project's loction.");
			String plocation = scan.next();
			System.out.println("Please enter the project's department number");
			int dnum = scan.nextInt();
			
			myStmt.executeUpdate("insert into project value('"+pname+"','"+pnumber+"','"+plocation+"','"+dnum+"')");
			System.out.println("Insert Succesful");
		}
		catch (Exception exc) {
			exc.printStackTrace();
			System.out.println("ADD_HANDLER_ISSUE");
		}
		close(scan);
		
	}
	
	public static void insWorksOn() {
		Scanner scan = new Scanner(System.in);
		try {
			//1. Get a connection
			Connection myConn = DriverManager.getConnection(url, user, pass);
			System.out.println("Connection Established to Company:Works_On");
			//2. Create Statement
			Statement myStmt = myConn.createStatement();
			//3. Execute SQl Query
			System.out.println("Please enter the employee social.");
			int essn = scan.nextInt();
			System.out.println("Please enter the project number.");
			int pno = scan.nextInt();
			System.out.println("Please enter the amount of hours worked on.");
			int hours = scan.nextInt();
			
			myStmt.executeUpdate("insert into project value('"+essn+"','"+pno+"','"+hours+"')");
			System.out.println("Insert Succesful");
		}
		catch (Exception exc) {
			exc.printStackTrace();
			System.out.println("ADD_HANDLER_ISSUE");
		}
		close(scan);
	}
	private static void close(Scanner scan) {
		// TODO Auto-generated method stub
		
	}

}
