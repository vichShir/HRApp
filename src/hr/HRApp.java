package hr;

public class HRApp {

	public static void main(String[] args) 
	{
		System.out.println("HR App Starts");
		
		Department dp = new Department("Department Education");
		System.out.println("Deparment: " + dp);
		
		Employee emp1 = new Employee(101, "Ann", 1234.56);
		Employee emp2 = new Employee(102, "Bob", 1200.34);
		Employee emp3 = new Employee(103, "Ray", 1122.33);
		
		dp.addEmployee(emp1);
		dp.addEmployee(emp2);
		dp.addEmployee(emp3);
		
		System.out.println("Employee: " + dp.getEmployeeByID(101));
		System.out.println("Employee: " + dp.getEmployeeByID(102));
		System.out.println("Employee: " + dp.getEmployeeByID(103));
		
		System.out.println("Total Salary: " + dp.getTotalSalary());
		System.out.println("Average Salary: " + dp.getAverageSalary());
	}

}
