package hr;

/*
 * author: vichShir
 */
public class Department 
{
	private String name;
	private Employee[] employees = new Employee[10];
	private int lastEmployeeIndex = 0;
	
	public Department(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void addEmployee(Employee emp)
	{
		if(lastEmployeeIndex < employees.length)
		{
			employees[lastEmployeeIndex] = emp;
			lastEmployeeIndex++;
		}
	}
	
	public Employee[] getEmployees()
	{
		Employee[] currentEmployees = new Employee[getEmployeeCount()];
		
		for(int i = 0; i < getEmployeeCount(); i++)
			currentEmployees[i] = employees[i];
		
		return currentEmployees;
	}
	
	public int getEmployeeCount()
	{
		return lastEmployeeIndex;
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
			total += emp.getSalary();
		
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
			System.out.println("Sem employees para calcular a média salarial. Adicione alguns.");
		}
		
		return average;
	}
	
	@Override
	public String toString()
	{
		return name;
	}
}
