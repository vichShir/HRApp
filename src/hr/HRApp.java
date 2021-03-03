package hr;

/*
 * author: vichShir
 */
public class HRApp 
{
	public static void main(String[] args) 
	{
		System.out.println("HR App Starts");
		
		Department dp = new Department("Department Education");
		System.out.println("Deparment: " + dp);
		
		Employee[] emps = 
		{
				new Employee(101, "Ann", 1234.56),
				new Employee(102, "Bob", 1200.34),
				new Employee(103, "Ray", 1122.33),
				new Employee(104, "Cristine", 1850.18),
				new Employee(105, "Jackson", 1199.89)
		};
		
		for (Employee emp: emps)
			dp.addEmployee(emp);
		
		System.out.println("Employee: " + dp.getEmployeeByID(101));
		System.out.println("Employee: " + dp.getEmployeeByID(102));
		System.out.println("Employee: " + dp.getEmployeeByID(103));
		System.out.println("Employee: " + dp.getEmployeeByID(104));
		System.out.println("Employee: " + dp.getEmployeeByID(105));
		
		System.out.println("Total Salary: $" + dp.getTotalSalary());
		System.out.println("Average Salary: $" + dp.getAverageSalary());
	}
}
