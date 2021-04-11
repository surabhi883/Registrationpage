package com.ssap.iava.demo.collage;

public class Department {
	private String DepartmentName;
	private Student[] students = new Student[5];
	public String getDepartmentName() {
       return DepartmentName;
	}
	
			

	public void setDepartmentName(String departmentName) {
		DepartmentName = departmentName;
	}

	
	



	public Student[] getStudents() {
		return students;
	}



	public void setStudents(Student[] students) {
		this.students = students;
	}



	@Override
	public String toString() {
		return "Department [DepartmentName=" + DepartmentName + "]";
	}





	public Department(String departmentName, Student[] students) {
		super();
		DepartmentName = departmentName;
		this.students = students;
	}



	public Department() {
		// TODO Auto-generated constructor stub
	}

}
