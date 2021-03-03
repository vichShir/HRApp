package hr;

public class Department 
{
	private String name;
	private Employee[] employees = new Employee[10];
	
	public Department(String name)
	{
		this.name = name;
	}
	
	public void addEmployee(Employee emp)
	{
		for (int i = 0; i < employees.length; i++)
		{
			if(employees[i] == null)
			{
				employees[i] = emp;
				break;
			}
		}
	}
	
	public Employee[] getEmployees()
	{
		if(getEmployeeCount() != 0)
			return employees;
		else
			return null;
	}
	
	public int getEmployeeCount()
	{
		int count = 0;
		
		for (int i = 0; i < employees.length; i++)
		{
			if(employees[i] != null)
			{
				count++;
			}
		}
		
		return count;
	}
	
	public Employee getEmployeeByID(int id)
	{
		Employee myEmp = null;
		
		for (Employee emp: getEmployees())
		{
			if(emp.getId() == id)
			{
				myEmp = emp;
				break;
			}
		}
		
		return myEmp;
	}
	
	public double getTotalSalary()
	{
		double total = 0.0;
		
		for (Employee emp: getEmployees())
		{
			if(emp != null)
			{
				total += emp.getSalary();
			}
		}
		
		return total;
	}
	
	public double getAverageSalary()
	{
		double average = 0.0;
		
		try 
		{
			average = getTotalSalary() / getEmployeeCount();
		} 
		catch (ArithmeticException e) 
		{
			System.out.println("Impossível calcular a média de salário.");
		}
		
		return average;
	}
	
	@Override
	public String toString()
	{
		return name;
	}
}
