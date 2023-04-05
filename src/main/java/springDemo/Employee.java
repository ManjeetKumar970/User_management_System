package springDemo;

public class Employee {
	private double salary;
	private String degn;
	
	
	public Employee(double salary,String degn) {
		this.salary=salary;
		this.degn=degn;
	}
	public Employee() {
		
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDegn() {
		return degn;
	}
	public void setDegn(String degn) {
		this.degn = degn;
	}
	
	

}
