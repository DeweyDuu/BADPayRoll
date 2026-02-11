package payrollSystem;

import java.util.ArrayList;
import java.util.List;

import payrollContents.Employee;

/**
 * Must have a function that will pay all employees based on the hours that they worked that week.  
 * This function will return an array of the pay of each employee.  
 * You may decide if the employees are an input to your function or data members in an object.  
 * One consideration should be, which is easier to test?
 */

public class PayrollSystem 
{
	private List<Employee> Employee_list;
	
	public PayrollSystem() 
	{
		this.Employee_list = new ArrayList<>();;
	}
	
	public void addEmployee(Employee em)
	{
		this.Employee_list.add(em);
	}

	public double[] PayrollPayEmployees() 
	{
		double[] payList = new double[Employee_list.size()];
		
		for(int i=0;i<Employee_list.size();i++)
		{
			payList[i] = Employee_list.get(i).payEmployee();
		}
		return payList;
	}

	/**
	 * @return the employee_list
	 */
	public List<Employee> getEmployee_list() {
		return Employee_list;
	}

}
