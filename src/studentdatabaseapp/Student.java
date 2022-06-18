package studentdatabaseapp;

import java.util.Scanner;

public class Student {
	private String firstName ;
	private String lastName ;
	private int gradeYear;
	private String studentID;
	private String courses = null;
	private int tuitionBalance = 0;
	private static int costOfCourse = 600;
	private static int id = 1000;
	

	//constructor : prompt user to enter student"s name and year
	public Student(){
		Scanner in = new Scanner (System.in);
		System.out.println("Enter student first name : ");
		this.firstName = in.nextLine();
		
		System.out.println("Enter student last name : ");
		this.lastName = in.nextLine();
		
		System.out.println("1 - Freshmen\n2 - Sophomore\n3 - Junior\n4 - Senior\nEnter student class level  : ");
		this.gradeYear = in.nextInt();
		
		setStudentID();
		//System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentID);		
	}
	
	// generate an ID
	private void setStudentID() {
		
	// grade level+ ID
		id++;
		this.studentID = gradeYear + "" + id;
		
		
	}
	
	//Enroll in courses
	public void enroll() {
		//get inside the loop, user hit 0
		do {
			System.out.print("Enter course to enroll (Q to quit) : ");
			Scanner in = new Scanner (System.in);
			String course = in.nextLine();
			if (!course.equalsIgnoreCase("Q")) {
				courses = courses + "\n  " + course;
				tuitionBalance = tuitionBalance + costOfCourse;
			}
			else { 
				break;
				} 
		} while (1 != 0);
		//System.out.println("ENROLLED IN : " + courses);
		//System.out.println("TUITION BALANCE : " + tuitionBalance);
	}
	
	// View balance 
	public void viewBalance () {
		System.out.println("Your Balance is : $" + tuitionBalance);
	}
	
	// Pay tuition
	public void payTuition() {
		viewBalance();
		System.out.print("Enter Your Payment : $");
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();
		tuitionBalance = tuitionBalance - payment;
	System.out.println("Thankyou for your payment of $" + payment);
	viewBalance();
	}

	// show status
	public String toString() {
		return "Name : " + firstName + " " + lastName + 
				"\nGrade Level : " + gradeYear +
				"\nStudent ID : " + studentID +
				"\nCourses Enrolled : " + courses + 
				"\nBalance : $" + tuitionBalance;
	}
}
