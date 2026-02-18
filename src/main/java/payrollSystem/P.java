package payrollSystem;
import java.util.ArrayList;
import java.util.List;

import payrollContents.E;


public class P 
{
	private List<E> el;
	
	public P() 
	{
		this.el = new ArrayList<>();;
	}
	
	public void addEmployee(E em)
	{
		this.el.add(em);
	}

	public double[] PPE() 
	{
		double[] payList = new double[el.size()];
		
		for(int i=0;i<el.size();i++)
		{
			payList[i] = el.get(i).pe();
		}
		return payList;
	}

	/**
	 * @return the employee_list
	 */
	public List<E> getel() {
		return el;
	}

}
