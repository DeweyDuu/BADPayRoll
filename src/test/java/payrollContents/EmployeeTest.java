package payrollContents;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import payrollSystem.PayrollSystem;

class EmployeeTest {
	
	Contractor jimCont;
	HourlyEmployee pamHour;
	SalaryEmployee dwightSal;
	
	PayrollSystem paySys;

	@BeforeEach
	void setUp() throws Exception 
	{
		jimCont = new Contractor("Jim", 20.0);
		pamHour = new HourlyEmployee("Pam", 15.0);
		dwightSal = new SalaryEmployee("Dwight", 25.0);
		
		paySys = new PayrollSystem();
	}

	@Test
	void attributeTest() 
	{
		//test names 
		assertEquals("Jim",jimCont.getEmployeeName());
		assertEquals("Pam",pamHour.getEmployeeName());
		assertEquals("Dwight",dwightSal.getEmployeeName());
		
		//test hours worked initialization
		assertEquals(0,jimCont.getEmployeeHoursWorked());
		assertEquals(0,pamHour.getEmployeeHoursWorked());
		assertEquals(0,dwightSal.getEmployeeHoursWorked());
		
		pamHour.setEmployeeHoursWorked(3);
		assertEquals(3,pamHour.getEmployeeHoursWorked());
		assertEquals(45,pamHour.payEmployee());
		
		pamHour.setEmployeeHoursWorked(42);
		assertEquals(645,pamHour.payEmployee());

	}
	
	@Test
	void payrollTest()
	{
		assertTrue(paySys.getEmployee_list().isEmpty());
		
		pamHour.setEmployeeHoursWorked(42);
		jimCont.setEmployeeHoursWorked(45);
		dwightSal.setEmployeeHoursWorked(25);
		
		paySys.addEmployee(pamHour);
		paySys.addEmployee(jimCont);
		paySys.addEmployee(dwightSal);
		
		assertFalse(paySys.getEmployee_list().isEmpty());
		
		//Im pretty sure there needs to be a different assertion statement here 
		double[] Expected = {645.0,900.0,1000.0};
		double[] actual = paySys.PayrollPayEmployees();
		
		assertArrayEquals(Expected, actual);

		
	}
}





