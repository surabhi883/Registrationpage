package com.ssap.iava.demo.collage;

public class Student {
     private int Rollno;
     private String Name;
     private String Department;
     private Address Address;
     private String gender;
	public int getRollno() {
		return Rollno;
	}
	public void setRollno(int rollno) {
		Rollno = rollno;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}
	public Address getAddress() {
		return Address;
	}
	public void setAddress(Address address) {
		Address = address;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Student [Rollno=" + Rollno + ", Name=" + Name + ", Department=" + Department + ", Address=" + Address
				+ ", gender=" + gender + "]";
	}
	public Student(int rollno, String name, String department, Address address, String string) {
		super();
		this.Rollno = rollno;
		this.Name = name;
		this.Department = department;
		this.Address = address;
		this.gender = string;
	}
	public Student() {
		super();
	
	}

     
	
	}
enum Gendertype{
MALE,
FEMALE
}