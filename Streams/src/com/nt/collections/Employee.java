package com.nt.collections;

public class Employee implements Comparable<Employee>{
 private int id;
 private String name;
 private String company;
 private String dept;
 
 private double salary;
 private double increment;
 private boolean promotion;
 
public Employee(int id, String name, String company, String dept, double salary, double increment, boolean promotion) {
	super();
	this.id = id;
	this.name = name;
	this.company = company;
	this.dept = dept;
	this.salary = salary;
	this.increment = increment;
	this.promotion = promotion;
}
public int getId() {
	return id;
}
public String getName() {
	return name;
}
public String getCompany() {
	return company;
}
public String getDept() {
	return dept;
}
public double getSalary() {
	return salary;
}
public double getIncrement() {
	return increment;
}
public boolean isPromotion() {
	return promotion;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", company=" + company + ", dept=" + dept + ", salary=" + salary
			+ ", increment=" + increment + ", promotion=" + promotion + "]";
}

public int compareTo(Employee o) {
	// TODO Auto-generated method stub
	System.out.println(this.getSalary()+" "+o.getSalary());
	return Double.compare(this.getSalary(), o.getSalary());
}
 
 
}
