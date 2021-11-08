import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Student {

	public static void main(String[] args) {
		// Declare variables
		String fullName;
		int credits;
		double gpa;
		String school;
		String major;
		String emailAddress;
		
		
		// Create an object for the scanner
		Scanner userInput = new Scanner(System.in);
		
		//Ask user for their input
		System.out.print("Enter your full name: ");
		fullName = userInput.nextLine();
		
		System.out.print("Enter your credits earned: ");
		credits = userInput.nextInt();
		
		//Makes sure the input is a positive number
		while (credits < 0) {
			System.out.println("Please provide a number of credits above or equal to O: ");
			credits = userInput.nextInt();
		}
		
		System.out.print("Enter your GPA: ");
		gpa = userInput.nextDouble();
		
		//Makes sure the input is a positive number 
		while (gpa < 0) {
			System.out.println("Please provide a GPA above or equal to O: ");
			gpa = userInput.nextDouble();
		}
		
		//Debug
		userInput.nextLine();
		
		System.out.print("Enter your school name: ");
		school = userInput.nextLine();
		
		System.out.print("Enter your major (Enter not declared or unknown if you have not declared your major): ");
		major = userInput.nextLine();
		
		System.out.print("Enter your email address: ");
		emailAddress = userInput.nextLine();
		
		
		System.out.println();
		
		//Prints today's date
		todaysDate();
		
		//To and from email address
		fromTo(emailAddress);
		System.out.println();
		
		//Prints introduction
		System.out.print("Dear " + fullName + ", \n\nAs the end of the school year nears, we have reviewed your graduation requirements at the "
		+ school + ". ");
		
		//Prints current GPA and credits
        System.out.println("You currently have " + credits + " credits and a GPA of " + gpa + ". ");
        
        //Provides graduation status 
        if (credits >= 120 && gpa >= 2.5) {
        	graduate();
        	
        }
        else if (credits >= 60) {
        	declareMajor(major);
        }
        else {
        	statement();
        	
        }
        //Email signature
        System.out.println("\nFeel free to contact us if you have any questions about your current graduation status.\n\nSincerely,\nKatherine Smith");
	}
	//Print the local date in the format day of the week, month day year
	public static void todaysDate() {
		LocalDate date = LocalDate.now();
		DateTimeFormatter formDate = DateTimeFormatter.ofPattern("E, MMM dd yyyy");
		String formattedDate = date.format(formDate);
		System.out.println(formattedDate + "\n");
	}
        	
	//Email address signature
	public static void fromTo(String email) {
		System.out.println("From: ksmith@gmailcom\nTo: " + email);
		
	}
	//Prints graduation statement
	public static void graduate() {
		System.out.println("You have succesfully completed 120 credits or more and have a GPA above or equal to 2.5. You have met all requirements to graduate. Congratualtions!");
	}
	//Prints a reminder to declare their major or prints their major 
	public static void declareMajor(String major) {
		if (major.trim().equalsIgnoreCase("not declared") || major.trim().equalsIgnoreCase("none")|| major.trim().equalsIgnoreCase("unknown")) {
			System.out.println("You have succesfully completed 60 credits or more, therefore, it is time to declare your major. Please contact your counselor to declare it.");
		}
		else {
			System.out.print("You have declared your major in " + major + ". ");
	
		}
		//Lets user know they have not met the requirements to graduate
		statement();
	}
	//Prints statement letting user know they have not met the requirements to graduate
	public static void statement() {
		System.out.println("To graduate you have to succesfully complete 120 credits and have a GPA of 2.5 or greater. At the moment, you have not met all the requirements.");
	}

}
