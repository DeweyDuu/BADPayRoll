package payrollContents;

public class HourlyEmployee extends Employee {

	public HourlyEmployee(String employeeName, double employeeHourlyRate) {
		super(employeeName, employeeHourlyRate);
	}
	
	@Override
    public double payEmployee() {
        if (employeeHoursWorked <= 40) {
            return employeeHourlyRate * employeeHoursWorked;
        } else {
            double regPay = 40 * employeeHourlyRate;
            double overtimePay = (employeeHoursWorked - 40) * (employeeHourlyRate * 1.5);
            return regPay + overtimePay;
        }
    }

}
