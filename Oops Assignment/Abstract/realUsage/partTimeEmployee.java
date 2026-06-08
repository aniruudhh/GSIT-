package Abstract.realUsage;

public class partTimeEmployee extends Employee {
	
	void calculateSalary() {
		double workingHours = 2;
		int salaryPerHour = 100;
	   double salary = workingHours * salaryPerHour;
	   
	   System.out.println("Salary of parttime employee will be based on working hours: " + salary);
	}
	
	public static void main (String[] args) {
		Employee e1 = new partTimeEmployee();
		Employee e2 = new fullTimeEmployee();
		
		e1.calculateSalary();
		e2.calculateSalary();
		e1.employeeDetails();
		
	}

}
