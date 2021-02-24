package org.college;

//child

public class Student extends Hostel{

	public void studentName() {
		
		System.out.println("Student Name");

	}
	
	public void studentId() {
		
		System.out.println("Student ID");

	}
	
	public void studentDept() {
		
		System.out.println("Student Dept");

	}
	
	public static void main(String[] args) {
		
		Student s = new Student();
		s.studentName();
		s.studentId();
		s.studentDept();
		
		s.collegeCode();
		s.collegeName();
		s.collegeRank();
		
		s.deptName();
		s.hostelName();
	}
}
