package Oops.Assignment;

public class Employee {
	
	private int empId;
	private String empName;
	private int salary;
	
	public void setempId (int empId) {
		this.empId = empId;
	}
	
	public int getempId() {
		return empId;
	}
	
	public void setempName (String empName) {
		this.empName = empName;
	}
	
	public String getempName() {
		return empName;
		
	}
	
	public void setSalary(int empSalary) {
		this.salary = empSalary;
	}
	
	public int getSalary() {
		return salary;
	}
	public void DisplayDetails() {
		System.out.println("Employee ID Number:" + empId);
		System.out.println("Employee Name:" + empName);
		System.out.println("Employee Salary:" + salary);
	}
	public static void main (String[] args){
		
		Employee emp = new Employee();
		emp.setempId(101);
		emp.setempName("Anirudh");
		emp.setSalary(1000000);
		emp.DisplayDetails();
	}
	
	
	
	
	}
	
	


