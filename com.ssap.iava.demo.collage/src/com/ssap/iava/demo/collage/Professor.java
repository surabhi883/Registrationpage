package com.ssap.iava.demo.collage;

public class Professor {
	private int Professorid;
	private String Name;
	private String Department;
	private Address Address;
	
	

	public int getProfessorid() {
		return Professorid;
	}



	public void setProfessorid(int professorid) {
		Professorid = professorid;
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



	@Override
	public String toString() {
		return "Professor [Professorid=" + Professorid + ", Name=" + Name + ", Department=" + Department + ", Address="
				+ Address + "]";
	}



	public Professor(int professorid, String name, String department, com.ssap.iava.demo.collage.Address address) {
		super();
		this.Professorid = professorid;
		this.Name = name;
		this.Department = department;
		this.Address = address;
	}



	public Professor() {
		// TODO Auto-generated constructor stub
	}

}
