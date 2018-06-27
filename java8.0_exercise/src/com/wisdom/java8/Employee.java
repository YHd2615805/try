package com.wisdom.java8;

import java.io.Serializable;

public class Employee implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3480846068321717389L;
	private int id;
	private int age;
	private String name;
	private Double salary;
	private String position;
	private String status;
	public Employee(int id, int age, String name, Double salary, String position, String status) {
		this.id = id;
		this.age = age;
		this.name = name;
		this.salary = salary;
		this.position = position;
		this.status = status;
	}
	public Employee() {
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", age=" + age + ", name=" + name + ", salary=" + salary + ", position="
				+ position + ", status=" + status + "]";
	}
	
}
