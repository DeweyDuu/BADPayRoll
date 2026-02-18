package payrollContents;

public class SalaryEmployee extends Employee {

	public SalaryEmployee(String employeeName, double employeeHourlyRate) {
		super(employeeName, employeeHourlyRate);
	}
	
	@Override
    public double payEmployee() 
	{
		return employeeHourlyRate*40;
		
	}
}
