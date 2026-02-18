package payrollContents;

public class Employee 
{
	String employeeName;
	double employeeHourlyRate, employeeHoursWorked;
	
	public Employee(String employeeName, double employeeHourlyRate) 
	{
		this.employeeName = employeeName;
		this.employeeHourlyRate = employeeHourlyRate;
		this.employeeHoursWorked = 0;
	}
	
	/**
	 * @return the employeeName
	 */
	public String getEmployeeName() {
		return employeeName;
	}

	/**
	 * @return the employeeHourlyRate
	 */
	public double getEmployeeHourlyRate() {
		return employeeHourlyRate;
	}
	/**
	 * @param employeeHourlyRate the employeeHourlyRate to set
	 */
	public void setEmployeeHourlyRate(double employeeHourlyRate) {
		this.employeeHourlyRate = employeeHourlyRate;
	}

	/**
	 * @return the employeeHoursWorked
	 */
	public double getEmployeeHoursWorked() {
		return employeeHoursWorked;
	}

	/**
	 * @param employeeHoursWorked the employeeHoursWorked to set
	 */
	public void setEmployeeHoursWorked(double employeeHoursWorked) {
		this.employeeHoursWorked = employeeHoursWorked;
	}	

	
	public double payEmployee()
	{
		return this.employeeHourlyRate * this.employeeHoursWorked;
		// will be overridden later by extensions
	}
	
}