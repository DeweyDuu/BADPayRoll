package payrollContents;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import payrollSystem.P;
import payrollSystem.PayrollSystem;

class EmployeeTest {
	
	c jimCont;
	he pamHour;
	se dwightSal;
	P paySys;

	@BeforeEach
	void setUp() throws Exception 
	{
		jimCont = new c("Jim", 20.0);
		pamHour = new he("Pam", 15.0);
		dwightSal = new se("Dwight", 25.0);
		
		paySys = new P();
	}

	@Test
	void attributeTest() 
	{
		//test names 
		assertEquals("Jim",jimCont.getn());
		assertEquals("Pam",pamHour.getn());
		assertEquals("Dwight",dwightSal.getn());
		
		//test hours worked initialization
		assertEquals(0,jimCont.gethr());
		assertEquals(0,pamHour.gethr());
		assertEquals(0,dwightSal.gethr());
		
		pamHour.sethr(3);
		assertEquals(3,pamHour.gethr());
		assertEquals(45,pamHour.pe());
		
		pamHour.sethr(42);
		assertEquals(645,pamHour.pe());

	}
	
	@Test
	void payrollTest()
	{
		assertTrue(paySys.getel().isEmpty());
		
		pamHour.sethr(42);
		jimCont.sethr(45);
		dwightSal.sethr(25);
		
		paySys.addEmployee(pamHour);
		paySys.addEmployee(jimCont);
		paySys.addEmployee(dwightSal);
		
		assertFalse(paySys.getel().isEmpty());
		
		//Im pretty sure there needs to be a different assertion statement here 
		double[] Expected = {645.0,900.0,1000.0};
		double[] actual = paySys.PPE();
		
		assertArrayEquals(Expected, actual);

		
	}
}





