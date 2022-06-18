package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {
//		Student stu2 = new Student();
//		stu2.enroll();
//		stu2.payTuition();
//		System.out.println(stu2.toString());
//		
//		Student stu3 = new Student();
//		stu3.enroll();
//		stu3.payTuition();
//		System.out.println(stu3.toString());
		
		// ask how many new students we want to add
		System.out.println("Enter number of new student to enroll : ");
		Scanner in = new Scanner(System.in);
		int numOfStudent = in.nextInt();
		Student[] students = new Student[numOfStudent];
	
		// create n number of new student
		for (int n = 0; n < numOfStudent; n++) {
			students[n] = new Student();
			students[n].enroll();
			students[n].payTuition();
		}
		for (int n = 0; n < numOfStudent; n++) {
			System.out.println(students[n].toString());
		}
	}
}
