package com.ass4.que3;

import java.io.*;
import java.io.Serializable;


class Employe implements Serializable{
	private int id;
	private String name;
	private String address;
	private double salary;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Employe(int id, String name, String address, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.salary  = salary;
	}
	public Employe() {
		
	}
	@Override
	public String toString() {
		return "Employe [id=" + id + ", name=" + name + ", address=" + address + ", salary=" + salary + "]";
	}
	public void display() {
		System.out.println("id: "+id+"  name:"+ name+"  address:"+address+"  salary:"+salary );
	}
	
}
public class Employee{ 
public static void main(String[] args) throws FileNotFoundException, IOException {
	
	//serialization
	ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("Info.ser"));
	Employe emp=new Employe(30,"manimala","AP",25000);
	emp.display();
	oos.writeObject(emp);
	System.out.println(emp);
	
	System.out.println("object is written");
	
	//deserialization
	ObjectInputStream ois=new ObjectInputStream(new FileInputStream("Info.ser"));	
	System.out.println(emp);
}
}


