package companydbms;

import java.sql.SQLException;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) throws SQLException {
		
		Scanner ans = new Scanner(System.in);
		
		boolean do_again=true; 
	    String user_choice;
		
		System.out.println("Welcome to Company DBMS utilizing JDBC");
		System.out.println("  By: Stephen Moore");
		System.out.println("");
		System.out.println("What would you like to do?");
		System.out.println("");
		
		
		while (do_again) {
		System.out.println("-----Menu-----");
		System.out.println("MetaData");
		System.out.println("");
		System.out.println("Update");
		System.out.println("");
		System.out.println("Delete");
		System.out.println("");
		System.out.println("Query");
		System.out.println("");
		System.out.println("Enter Here:");
	    String answer=ans.next();
	    if (answer.equals("metadata") || answer.equals("Metadata") || answer.equals("meta") || answer.equals("data") || answer.equals("m") || answer.equals("M"))
	        answer="Metadata";
	    if (answer.equals("update") || answer.equals("Update") || answer.equals("u") || answer.equals("U"))
	        answer="Update";
	    if (answer.equals("delete") || answer.equals("Delete") || answer.equals("d") || answer.equals("D"))
	        answer="Delete";
	    if (answer.equals("query") || answer.equals("Query") || answer.equals("q") || answer.equals("Q"))
	        answer="Query";
	    //System.out.println(answer);
	    close(ans);
	    
	    switch (answer) {
	    //CASE FOR METADATA
	    case "Metadata":
	    	System.out.println("Okay, checking metadata.");
	    	System.out.println("Which table would you like to choose?");
	    	System.out.println("-----Options-----");
	    	System.out.println("Employee");
	    	System.out.println("Department");
	    	System.out.println("Project");
	    	System.out.println("Works_On");
			System.out.println("");
			System.out.println("Enter Here:");
	    	String answer2=ans.next();
	    	if (answer2.equals("employee") || answer2.equals("emp") || answer2.equals("e") || answer2.equals("E"))
		        answer2="Employee";
		    if (answer2.equals("department") || answer2.equals("dept") || answer2.equals("d") || answer2.equals("D"))
		        answer2="Department";
		    if (answer2.equals("project") || answer2.equals("proj") || answer2.equals("p") || answer2.equals("P"))
		        answer2="Project";
		    if (answer2.equals("works on") || answer2.equals("works") || answer2.equals("works_on") || answer2.equals("Works_On") || answer2.equals("w") || answer2.equals("W")|| answer2.equals("Works_on"))
		        answer2="Works On";
		    //SWITCH FOR TABLES
	    	switch (answer2) {
	    	case "Employee":
		    	DatabaseGetter.getEmployee();
		    	break;
		    case "Department":
		    	DatabaseGetter.getDepartment();
			    break;
		    case "Project":
			    DatabaseGetter.getProject();
			    break;
		    case "Works On":
			    DatabaseGetter.getWorksOn();
			    break;
		    case "":
		    	break;
	    	}
	    	break;
	    	//CASE FOR UPDATE
	    case "Update":
	    	System.out.println("Okay, updating database.");
	    	System.out.println("Which table would you like to update?");
	    	System.out.println("-----Options-----");
	    	System.out.println("Employee");
	    	System.out.println("Department");
	    	System.out.println("Project");
	    	System.out.println("Works_On");
			System.out.println("");
			System.out.println("Enter Here:");
	    	String answer3=ans.next();
	    	if (answer3.equals("employee") || answer3.equals("emp") || answer3.equals("e") || answer3.equals("E"))
		        answer3="Employee";
		    if (answer3.equals("department") || answer3.equals("dept") || answer3.equals("d") || answer3.equals("D"))
		        answer3="Department";
		    if (answer3.equals("project") || answer3.equals("proj") || answer3.equals("p") || answer3.equals("P"))
		        answer3="Project";
		    if (answer3.equals("works on") || answer3.equals("works") || answer3.equals("works_on") || answer3.equals("Works_On") || answer3.equals("w") || answer3.equals("W")|| answer3.equals("Works_on"))
		        answer3="Works On";
	    	switch (answer3) {
	    	case "Employee":
		    	DatabaseSetter.insEmployee();
		    	break;
		    case "Department":
		    	DatabaseSetter.insDepartment();
			    break;
		    case "Project":
			    DatabaseSetter.insProject();
			    break;
		    case "Works On":
			    DatabaseSetter.insWorksOn();
			    break;
		    case "":
		    	break;
	    	}
	    case "Delete":
	    	System.out.println("Okay, deleting entries in database.");
	    	System.out.println("Which table would you like to delete entries from?");
	    	System.out.println("-----Options-----");
	    	System.out.println("Employee");
	    	System.out.println("Department");
	    	System.out.println("Project");
	    	System.out.println("Works_On");
			System.out.println("");
			System.out.println("Enter Here:");
	    	String answer4=ans.next();
	    	if (answer4.equals("employee") || answer4.equals("emp") || answer4.equals("e") || answer4.equals("E"))
		        answer4="Employee";
		    if (answer4.equals("department") || answer4.equals("dept") || answer4.equals("d") || answer4.equals("D"))
		        answer4="Department";
		    if (answer4.equals("project") || answer4.equals("proj") || answer4.equals("p") || answer4.equals("P"))
		        answer4="Project";
		    if (answer4.equals("works on") || answer4.equals("works") || answer4.equals("works_on") || answer4.equals("Works_On") || answer4.equals("w") || answer4.equals("W")|| answer4.equals("Works_on"))
		        answer4="Works On";
	    	switch (answer4) {
	    	case "Employee":
		    	DatabaseDelete.delEmployee();
		    	break;
		    case "Department":
		    	DatabaseDelete.delDepartment();
			    break;
		    case "Project":
			    DatabaseDelete.delProject();
			    break;
		    case "Works On":
			    DatabaseDelete.delWorksOn();
			    break;
		    case "":
		    	break;
	    	}
	    case "Query":
	    	System.out.println("Okay, starting the query tool");
	    	System.out.println("");
	    	Query.makeQuery();
	    } 
	    Scanner choice = new Scanner(System.in);
	    System.out.println();
	     System.out.println("Do you want to run the program again? (Y/N)");
	     user_choice = choice.next();
	     user_choice=user_choice.toUpperCase();
	      if (user_choice.equals("NO") || user_choice.equals("N"))
	          do_again=false;
	      close(choice);
	      }
	}

	private static void close(Scanner tableScan) {
	}

}
