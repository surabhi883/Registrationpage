package com.ssap.iava.demo.collage;

public class SearchStudentDetails {
	public static void searchStudents(Department department,String studName) {
		Student student1[] = department.getStudents();		
		
		for (Student stud : student1) {
			if(stud.getName().equals(studName)) {
				System.out.println("Student  Avaiable..!"+studName);
				return;
			}
		}
		System.out.println(studName +",Invalid info of student.!");
	
	}
	public SearchStudentDetails() {
	}

}
